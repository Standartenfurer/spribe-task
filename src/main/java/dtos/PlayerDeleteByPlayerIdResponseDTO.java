package dtos;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.util.JSONPObject;

@JsonDeserialize
public class PlayerDeleteByPlayerIdResponseDTO implements DTOCallable {

    private String statusCode;

    private String statusCodeValue;

    private JSONPObject body;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusCodeValue() {
        return statusCodeValue;
    }

    public void setStatusCodeValue(String statusCodeValue) {
        this.statusCodeValue = statusCodeValue;
    }

    public JSONPObject getBody() {
        return body;
    }

    public void setBody(JSONPObject body) {
        this.body = body;
    }

    public PlayerDeleteByPlayerIdResponseDTO(String statusCode, String statusCodeValue, JSONPObject body) {
        this.statusCode = statusCode;
        this.statusCodeValue = statusCodeValue;
        this.body = body;
    }

    public PlayerDeleteByPlayerIdResponseDTO(PlayerDeleteByPlayerIdResponseDTO deleteDto) {
        this.statusCode = deleteDto.statusCode;
        this.statusCodeValue = deleteDto.statusCodeValue;
        this.body = deleteDto.body;
    }
}
