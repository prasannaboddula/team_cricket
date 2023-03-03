package com.example.player;

public class Player{
    private int playerId;
    private String playerName;
    private int jerseyNumber;
    private String role;

    public Player(int playerId, String playerName, int jerseyNumber, String role){
        this.playerId = playerId;
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
    }

    public int getPlayerId(){
        return playerId;
    }

    public void setPlayerId(int playerId){
        this.playerId = playerId;
    }

    public String getPlayerName(){
        return playerName;
    }

    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }

    public int getjerseyNumber(){
        return jerseyNumber;
    }

    public void setjerseyNumber(int jerseyNumber){
        this.jerseyNumber = jerseyNumber;
    }

    public String getRoleName(){
        return role;
    }

    public void setRoleName(String role){
        this.role = role;
    }

}
