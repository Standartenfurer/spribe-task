package services;


import com.github.cliftonlabs.json_simple.JsonObject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public abstract class RequestClient {


    //TODO will behave good during multithread, but I am reparsing the object back and forth...
    public Response get(String endpointURL, JsonObject queryParams) {
        return   given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when()
                .queryParams(queryParams)
                .get(endpointURL)
                .then()
                .extract()
                .response();
    }

    public Response post(String endpointURL, JsonObject body, JsonObject queryParam) {
        return given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when()
                .body(body)
                .queryParams(queryParam)
                .post(endpointURL)
                .then()
                .extract()
                .response();
    }

    public Response patch(String endpointURL, JsonObject body) {
        RequestSpecification specification = given();
        return given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(body)
                .when()
                .body(body)
                .patch(endpointURL)
                .then()
                .extract()
                .response();
    }

    public Response delete(String endpointURL, JsonObject body) {
        return given()
                .when()
                .body(body)
                .delete(endpointURL)
                .then()
                .extract()
                .response();
    }


}
