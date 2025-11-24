package services.helpers;

import dtos.*;
import dtos.utility.Role;
import services.PlayerService;

import java.util.Arrays;
import java.util.List;

public class PlayerHelper {

    PlayerService serviceExecutor = new PlayerService();

    public PlayerCreateResponseDTO createPlayer(PlayerCreateRequestDTO createPlayerDto) {
        return new PlayerCreateResponseDTO(
                serviceExecutor.createPlayer(createPlayerDto).as(PlayerCreateResponseDTO.class));
    }

    public int getPlayersNumber() {
        List<PlayerGetByPlayerIdResponseDTO> playersList =
                Arrays.asList(serviceExecutor.getAllPlayers().getBody().as(PlayerGetByPlayerIdResponseDTO[].class));
        return playersList.size();

    }

    public PlayerUpdateResponseDTO updatePlayer(String playerId, Role editor, PlayerUpdateRequestDTO playerUpdateDto) {
        return new PlayerUpdateResponseDTO(serviceExecutor.updatePlayer(playerId, editor, playerUpdateDto).as(PlayerUpdateResponseDTO.class));
    }

    public List<PlayerItemDTO> getAllPlayers() {
        return Arrays.asList(serviceExecutor.getAllPlayers().getBody().as(PlayerItemDTO[].class));

    }

    public PlayerGetByPlayerIdResponseDTO getPlayerById(String playerId) {
        return new PlayerGetByPlayerIdResponseDTO(
                serviceExecutor.getPlayer(playerId).as(PlayerGetByPlayerIdResponseDTO.class));
    }

    public PlayerDeleteByPlayerIdResponseDTO deletePlayerById(Role editor, PlayerDeleteByPlayerIdRequestDTO deleteDto) {
        return new PlayerDeleteByPlayerIdResponseDTO(
                serviceExecutor.deletePlayer(editor, deleteDto).as(PlayerDeleteByPlayerIdResponseDTO.class));


    }

}
