package team.a9043.yiluwiki;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("team.a9043.yiluwiki.mapper")
@EnableSwagger2
public class YiluWikiApplication {

    public static void main(String[] args) {
        SpringApplication.run(YiluWikiApplication.class, args);
    }
}
