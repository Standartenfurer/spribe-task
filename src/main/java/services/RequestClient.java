package services;


import com.github.cliftonlabs.json_simple.JsonObject;
import dtos.DTOCallable;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public abstract class RequestClient {

    //TODO  1. query param as JsonObject
    //      2. headers go as JsonObject
    //      3. path params go as url parts
    //      4. body goes as DTO and is parsed here
    //TODO will behave good during multithread, but I am reparsing the object back and forth...

    //TODO add logging
    //TODO need null checks?
    //TODO still be abstract?
    //
    public Response get(String endpointURL,HashMap<String,String> headers, HashMap<String,String> queryParams) {
        return given().contentType(ContentType.JSON).accept(ContentType.JSON).
                when().queryParams(queryParams).
                get(endpointURL).
                then().
                extract().
                response();
    }

    public Response get(String endpointURL, HashMap<String,String> queryParams) {
        return given().contentType(ContentType.JSON).accept(ContentType.JSON).
                when().queryParams(queryParams).
                get(endpointURL).
                then().
                extract().
                response();
    }

    public Response get(String endpointURL) {
        return given().contentType(ContentType.JSON).accept(ContentType.JSON).
                when().
                get(endpointURL).
                then().
                extract().
                response();
    }

    public Response post(String endpointURL, HashMap<String,String> headers,HashMap<String,String> queryParam, DTOCallable dtoCallable) {
        return given().contentType(ContentType.JSON).accept(ContentType.JSON).
                when().
                body(body).
                queryParams(queryParam).
                post(endpointURL).
                then().
                extract().
                response();
    }

    public Response post(String endpointURL, HashMap<String,String> queryParam, DTOCallable dtoCallable) {
        return given().contentType(ContentType.JSON).accept(ContentType.JSON).
                when().
                body(body).
                queryParams(queryParam).
                post(endpointURL).
                then().
                extract().
                response();
    }

    public Response post(String endpointURL, HashMap<String,String> queryParam, HashMap<String,String> dtoCallable) {
        return given().contentType(ContentType.JSON).accept(ContentType.JSON).
                when().
                body(body).
                queryParams(queryParam).
                post(endpointURL).
                then().
                extract().
                response();
    }

    public Response post(String endpointURL, DTOCallable dtoCallable) {
        return given().contentType(ContentType.JSON).accept(ContentType.JSON).
                when().
                body(body).
                queryParams(queryParam).
                post(endpointURL).
                then().
                extract().
                response();
    }

    public Response post(String endpointURL, HashMap<String,String> dtoCallable) {
        return given().contentType(ContentType.JSON).accept(ContentType.JSON).
                when().
                body(body).
                queryParams(queryParam).
                post(endpointURL).
                then().
                extract().
                response();
    }
    public Response patch(String endpointURL,HashMap<String,String> headers, JsonObject body) {
        RequestSpecification specification = given();
        return given().contentType(ContentType.JSON).accept(ContentType.JSON).body(body).
                when().
                body(body).
                patch(endpointURL).
                then().
                extract().
                response();
    }

    public Response patch(String endpointURL, JsonObject body) {
        RequestSpecification specification = given();
        return given().contentType(ContentType.JSON).accept(ContentType.JSON).body(body).
                when().
                body(body).
                patch(endpointURL).
                then().
                extract().
                response();
    }

    public Response patch(String endpointURL, HashMap<String,String> dtoCallable) {
        RequestSpecification specification = given();
        return given().contentType(ContentType.JSON).accept(ContentType.JSON).body(body).
                when().
                body(body).
                patch(endpointURL).
                then().
                extract().
                response();
    }

    public Response delete(String endpointURL, HashMap<String,String> headers, JsonObject body) {
        return given().
                when().
                body(body).
                delete(endpointURL).
                then().
                extract().
                response();
    }


}
