package team.a9043.yiluwiki.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;
import org.springframework.lang.NonNull;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import team.a9043.yiluwiki.entity.YwUser;
import team.a9043.yiluwiki.security.entity.YwAuthenticationToken;
import team.a9043.yiluwiki.util.JwtUtil;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author a9043
 */
@Component
public class SisAuthenticationFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest request,
                                    @NonNull HttpServletResponse response,
                                    @NonNull FilterChain filterChain) throws ServletException, IOException {
        String header = request.getHeader("Authorization");
        if (header == null || !header.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }

        String token = header.substring(7);
        if (token.length() <= 0 ||
                SecurityContextHolder.getContext().getAuthentication() != null) {
            filterChain.doFilter(request, response);
            return;
        }

        Claims claims;
        YwUser ywUser;
        //解析token
        try {
            claims = JwtUtil.parseJwt(token);
            ywUser = new YwUser();
            ywUser.setYuId(claims.get("yuId", Integer.class));
            ywUser.setYuName(claims.get("yuName", String.class));

        } catch (MalformedJwtException | SignatureException | ExpiredJwtException e) {
            SecurityContextHolder.clearContext();
            filterChain.doFilter(request, response);
            return;
        }

        //设定Authentication
        YwAuthenticationToken ywAuthenticationToken =
                new YwAuthenticationToken(ywUser, null);
        ywAuthenticationToken
                .setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
        ywAuthenticationToken.setAuthenticated(true);
        SecurityContextHolder.getContext().setAuthentication(ywAuthenticationToken);

        filterChain.doFilter(request, response);
    }
}
