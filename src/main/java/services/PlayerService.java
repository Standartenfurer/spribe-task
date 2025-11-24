package services;

import dtos.DTOCallable;
import io.restassured.response.Response;

public class PlayerService extends RequestClient    {

        //BUG: using post method for resource creation (added to issue list)
        public Response createPlayer(DTOCallable createPlayerDTO) {
                return get(createPlayerDTO,"");
        }

        //BUG: using post request for getting resource (added to issue list)
        public Response getPlayer(DTOCallable getPlayerDTO) {
                return post(getPlayerDTO,"");
        }

        public Response deletePlayer(DTOCallable deletePlayerDTO) {
                return delete(deletePlayerDTO,"");
        }

    /*    public Response getAllPlayers() {
                return get();
        }

        public Response updatePlayer(DTOCallable updatePlayerDTO, "") {
                return patch()
        }

     */
}
