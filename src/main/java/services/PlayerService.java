package services;

import dtos.DTOCallable;
import dtos.utility.Endpoints;
import dtos.utility.Role;
import io.restassured.response.Response;

public class PlayerService extends RequestClient {

    //add deserialization here
    //TODO: using post method for resource creation (added to issue list)
    public Response createPlayer(DTOCallable createPlayerDTO) {
        return get(Endpoints.CREATE_PLAYER.getValue(), createPlayerDTO);
    }

    //TODO: using post request for getting resource (added to issue list)
    //
    public Response getPlayer(DTOCallable getPlayerDTO) {
        return post(Endpoints.GET_PLAYER_BY_ID.getValue(), getPlayerDTO);
    }

    //TODO implementation will be used after fix

    public Response getPlayer(String playerID) {
        return get(Endpoints.GET_PLAYER_BY_ID.getValue() + playerID);
    }

    public Response getAllPlayers() {
        return get(Endpoints.GET_ALL_PLAYERS.getValue());
    }

    public Response updatePlayer(String playerId, Role role, DTOCallable playerUpdateDTO) {
        return patch(Endpoints.GET_PLAYER_BY_ID.getValue() + role.getRoleName() + "/" + playerId, playerUpdateDTO);
    }

    public Response deletePlayer(Role editor, DTOCallable deletePlayerDTO) {
        return delete(Endpoints.DELETE_PLAYER.getValue() + editor.getRoleName(), deletePlayerDTO);
    }


}
