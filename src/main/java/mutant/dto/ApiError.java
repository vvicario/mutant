package mutant.dto;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * @author vvicario
 */
@Component
public class ApiError {

    private HttpStatus status;
    private String message;

    public ApiError() {
        super();
    }

    public ApiError(final HttpStatus status, final String message) {
        super();
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(final HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

}
