package com.exampledatabase.RestConreollerdemo.service;

import com.exampledatabase.RestConreollerdemo.player.Player;
import com.exampledatabase.RestConreollerdemo.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
     private PlayerRepository playerRepository;


    public List<Player> getAllPlayer() {
        List<Player> playerList = new ArrayList<>();
        playerRepository.findAll().forEach(playerList::add);
        return playerList;
    }

    public Player getPlayer(int id) {

        Optional<Player> optionalPlayer =playerRepository.findById(id);

            if (optionalPlayer.isPresent()) {
                return optionalPlayer.get();
            }

        return null;
    }

    public void savePlayer(Player player) {
         playerRepository.save(player);
    }

    public void updatePlayer(Player player) {

         playerRepository.save(player);

    }

    public void deletePlayer(int id) {
        playerRepository.deleteById(id);
    }
}
