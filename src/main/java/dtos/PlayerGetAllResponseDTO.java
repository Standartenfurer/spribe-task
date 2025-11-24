package dtos;

import java.util.ArrayList;

public class PlayerGetAllResponseDTO implements DTOCallable {

    private ArrayList<PlayerItemDTO> playerItems;

    public PlayerGetAllResponseDTO(ArrayList<PlayerItemDTO> playerItems) {
        this.playerItems = playerItems;
    }

    public ArrayList<PlayerItemDTO> getPlayerItems() {
        return playerItems;
    }

    public void setPlayerItems(ArrayList<PlayerItemDTO> playerItems) {
        this.playerItems = playerItems;
    }

}
