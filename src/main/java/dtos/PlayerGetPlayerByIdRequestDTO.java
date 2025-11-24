package dtos;

public class PlayerGetPlayerByIdRequestDTO implements DTOCallable {

    //Don't creating builder, since easier to init object with constructor
    private Integer playerId;

    public PlayerGetPlayerByIdRequestDTO(Integer playerId) {
        this.playerId = playerId;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }
}
