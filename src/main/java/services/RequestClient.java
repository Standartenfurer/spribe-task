package services;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import dtos.DTOCallable;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

/**
 * 1. query is treated as JsonObject
 * 2. headers are treated as as JsonObject
 * 3. path are tread as url parts
 * 4. body treated as dto
 * 5. only requst related data is parsed here to json, reparse will be done by upper layer
 * 6. rest methods should be moved to separate interfaces to ensure better bckw compty
 */

public abstract class RequestClient {

    private static final ObjectMapper mapper = new ObjectMapper();


    //TODO add logging
    //TODO need null checks?
    //TODO still be abstract?
    //

    public Response get(String endpointURL, HashMap<String, String> queryParams) {
        return given().contentType(ContentType.JSON).accept(ContentType.JSON).
                when().queryParams(queryParams).
                get(endpointURL).
                then().
                extract().
                response();
    }

    //TODO temp method, will be removed after player creation issue is resolved
    public Response get(String endpointURL, DTOCallable dtoBody) {

        return given().contentType(ContentType.JSON).accept(ContentType.JSON).
                when().
                queryParams(getHashMapFromDTO(dtoBody)).
                get(endpointURL).
                then().
                extract().
                response();
    }


    public Response post(String endpointURL, HashMap<String, String> queryParam, DTOCallable body) {

        return given().contentType(ContentType.JSON).accept(ContentType.JSON).
                when().
                queryParams(queryParam).
                body(getHashMapFromDTO(body)).
                post(endpointURL).
                then().
                extract().
                response();
    }

    public Response post(String endpointURL, HashMap<String, String> queryParam) {
        return given().contentType(ContentType.JSON).accept(ContentType.JSON).
                when().
                queryParams(queryParam).
                post(endpointURL).
                then().
                extract().
                response();
    }

    public Response post(String endpointURL, DTOCallable body) {
        return given().contentType(ContentType.JSON).accept(ContentType.JSON).
                when().
                body(getHashMapFromDTO(body)).
                post(endpointURL).
                then().
                extract().
                response();
    }


    public Response patch(String endpointURL, DTOCallable body) {
        return given().contentType(ContentType.JSON).accept(ContentType.JSON).
                when().
                body(getHashMapFromDTO(body)).
                patch(endpointURL).
                then().
                extract().
                response();
    }


    public Response delete(String endpointURL, DTOCallable body) {
        return given().
                when().
                body(getHashMapFromDTO(body)).
                delete(endpointURL).
                then().
                extract().
                response();
    }

    public HashMap<String, String> getHashMapFromDTO(DTOCallable dtoCallable) {
        HashMap<String, String> queryParams = new HashMap<String, String>();
        try {
            String json = mapper.writeValueAsString(dtoCallable);
            queryParams = mapper.readValue(json, new TypeReference<HashMap<String, String>>() {
            });
        } catch (JsonProcessingException e) {
            throw new RuntimeException("error during processing dto to json string for GET request QUERY_PARAMS");
        }
        return queryParams;
    }

}
