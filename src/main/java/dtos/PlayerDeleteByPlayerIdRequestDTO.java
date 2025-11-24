package dtos;

public class PlayerDeleteByPlayerIdRequestDTO implements DTOCallable {

    ///Don't adding builder, easier to init with constructor
    private Integer playerId;

    public PlayerDeleteByPlayerIdRequestDTO(Integer playerId) {
        this.playerId = playerId;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }
}
