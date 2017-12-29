 package myservermod;

import com.youthdigital.servermod.game.*;

public class Game extends TeamData {
  
  public Game(ChatColors teamColor, String teamNameDisplay) {
    super("All Players", teamColor, teamNameDisplay);
  }
  
  public static void setupGameRules() {
    
    GameInfo.setServerDescription("A Minecraft Server by Liver");
    GameInfo.addToWhitelist("lucifitz_liver, sr0rm79");
    GameInfo.addToOPs("lucifitz_liver, sr0rm79");
    
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