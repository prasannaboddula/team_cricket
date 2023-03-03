package com.example.player;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
 
import com.example.player.PlayerService;

@RestController
public class PlayerController{
    PlayerService playerservice = new PlayerService();

    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable("playerId") int playerId){
        playerservice.deletePlayer(playerId);
    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayer(@PathVariable("playerId") int playerId, @RequestBody Player player){
        return playerservice.updatePlayer(playerId, player);
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player){
        return playerservice.addPlayer(player);
    }
    
    @GetMapping("/players")
    public ArrayList<Player> getPlayers() {
        return playerservice.getPlayers();
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayerById(@PathVariable("playerId") int playerId){
        return playerservice.getPlayerById(playerId);
    }

}
