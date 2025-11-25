package services;

import dtos.DTOCallable;
import dtos.utility.Endpoints;
import dtos.utility.Role;
import io.restassured.response.Response;

import static utils.PropertyLoader.getProperties;

public class PlayerService extends RequestClient {

    private final String baseUrl = getProperties().getProperty("url.base");

    //add deserialization here
    //TODO: using post method for resource creation (added to issue list)
    public Response createPlayer(DTOCallable createPlayerDTO) {
        return get(Endpoints.CREATE_PLAYER.getValue(), createPlayerDTO);
    }

    //TODO: using post request for getting resource (added to issue list)
    //
    public Response getPlayer(DTOCallable getPlayerDTO) {
        return post(baseUrl + Endpoints.GET_PLAYER_BY_ID.getValue(), getPlayerDTO);
    }

    //TODO implementation will be used after fix

    public Response getPlayer(String playerID) {
        return get(baseUrl + Endpoints.GET_PLAYER_BY_ID.getValue() + playerID);
    }

    public Response getAllPlayers() {
        return get(baseUrl + Endpoints.GET_ALL_PLAYERS.getValue());
    }

    public Response updatePlayer(String playerId, Role role, DTOCallable playerUpdateDTO) {
        return patch(baseUrl + Endpoints.GET_PLAYER_BY_ID.getValue() + role.getRoleName() + "/" + playerId, playerUpdateDTO);
    }

    public Response deletePlayer(Role editor, DTOCallable deletePlayerDTO) {
        return delete(baseUrl + Endpoints.DELETE_PLAYER.getValue() + editor.getRoleName(), deletePlayerDTO);
    }


}
