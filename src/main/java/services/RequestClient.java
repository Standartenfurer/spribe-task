package services;


import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RequestClient {

    private static RequestClient instance;

    private RequestClient() {
    }


    //TODO looks unnecessary
    public static RequestClient request() {
        if (instance == null) {
            instance = new RequestClient();
        }
        return instance;
    }

    //TODO check mb not need synchronization
    public static synchronized RequestClient getClient() {
        //make this singleton object, not to create request client each time
        return new RequestClient();
    }


    public Response get(DTOCallable dto) {
        return   given()
                .when()
                .get()
                .then()
                .extract()
                .response();
    }

    public Response post(DTOCallable dto) {
        return given()
                .contentType("application/json")
                .body(dto)
                .when()
                .post()
                .then()
                .extract()
                .response();
    }

    public Response put(DTOCallable dto) {
        return given()
                .contentType("application/json")
                .body(dto)
                .when()
                .put()
                .then()
                .extract()
                .response();
    }

    public Response delete(DTOCallable dto) {
        return given()
                .when()
                .delete()
                .then()
                .extract()
                .response();
    }


}
