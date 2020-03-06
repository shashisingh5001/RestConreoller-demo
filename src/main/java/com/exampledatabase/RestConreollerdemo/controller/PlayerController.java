package com.exampledatabase.RestConreollerdemo.controller;

import com.exampledatabase.RestConreollerdemo.player.Player;
import com.exampledatabase.RestConreollerdemo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @RequestMapping("/players")
    @GetMapping
    public List<Player> getAllPlayer(){
      return playerService.getAllPlayer();
    }

    @RequestMapping("/players/{id}")
    @GetMapping
     public Player getPlayerById(@PathVariable int id){
        return playerService.getPlayer(id);
     }

     @RequestMapping("/players/save")
     @PostMapping
     public void savePlayer(@RequestBody Player player){

        playerService.savePlayer(player);
     }

     @RequestMapping("players/update")
     @PutMapping
     public void updatePlayer(@RequestBody Player player)
     {
         playerService.updatePlayer(player);
     }

     @RequestMapping("players/delete/{id}")
     @DeleteMapping
     public void deletePlayer(@PathVariable int id)
     {
         playerService.deletePlayer(id);
     }

}
