package team.a9043.yiluwiki.service_pojo;

/**
 * @author a9043
 */
public class VoidSuccessOperationResponse extends VoidOperationResponse {
    public static final VoidSuccessOperationResponse SUCCESS =
        new VoidSuccessOperationResponse();

    private VoidSuccessOperationResponse() {
        this.success = true;
    }

    public void setSuccess(boolean success) {
    }

    public void setMessage(String message) {
    }

    public void setCode(Integer code) {
    }

    public String getMessage() {
        return null;
    }

    public Void getData() {
        return null;
    }

    public Integer getCode() {
        return null;
    }
}
