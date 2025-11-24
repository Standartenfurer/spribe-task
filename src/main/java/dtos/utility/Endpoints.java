package dtos.utility;

public enum Endpoints {
    CREATE_PLAYER("/create/"), DELETE_PLAYER("/delete/"), GET_PLAYER_BY_ID("/get/"),
    GET_ALL_PLAYERS("/get/all"), UPDATE_PLAYER_BY_ID("/update/");

    private final String endpoint;

    Endpoints(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getValue() {
        return endpoint;
    }
}
