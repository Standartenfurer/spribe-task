package services;

import dtos.DTOCallable;
import io.restassured.response.Response;

public class PlayerService extends RequestClient    {

        //add deserialization here
        //TODO: using post method for resource creation (added to issue list)
        public Response createPlayer(DTOCallable createPlayerDTO) {
                return get();
        }

        //TODO: using post request for getting resource (added to issue list)
        public Response getPlayer(DTOCallable getPlayerDTO) {
                return post();
        }

        public Response deletePlayer(DTOCallable deletePlayerDTO) {
                return delete();
        }

        public Response

}
