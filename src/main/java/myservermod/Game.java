 package myservermod;

import com.youthdigital.servermod.game.*;

public class Game extends TeamData {
  
  public Game(ChatColors teamColor, String teamNameDisplay) {
    super("All Players", teamColor, teamNameDisplay);
  }
  
  public static void setupGameRules() {
    
    GameInfo.setServerDescription("A Minecraft Server by Liver");
    // List contains all Minecraft users that are allowed to connect to the server
    GameInfo.addToWhitelist("lucifitz_liver, sr0rm79");
    // Allow players to become Operators (i.e. game masters)
    GameInfo.addToOPs("lucifitz_liver, sr0rm79");
    
    // Disables random mob spawning
    GameInfo.disableMobSpawning();
    // Users in survival mode can no longer break blocks
    GameInfo.disableBlockBreaking();
    
    // Sets the servers time of day (the sun will not move), takes a number between 0 - 24000.
    GameInfo.setTime(12000);
    // Sets mob difficulty, takes a number between 0 - 3, 0 = No Mobs, 3 = Very Hard Mobs
    GameInfo.setDifficulty(2);
    // Turns rain on or off, takes boolean
    GameInfo.isRaining(false);
    // Turn PVP off or on, takes boolean
    GameInfo.setPVP(false);
    
  }
  
  @Override
  public void onUpdate() {
    
  }
  
  @Override
  public void onResetGameToLobby() {
    
  }
  
  @Override
  public void onStartGame() {
    
  }
  
}