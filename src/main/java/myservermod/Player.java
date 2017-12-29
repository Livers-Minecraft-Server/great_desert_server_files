package myservermod;

import com.youthdigital.servermod.game.*;

public class Player extends PlayerData {
  
  public Player(EntityPlayer parPlayerObject) {
    super(parPlayerObject);
  }
  
  // Method continuously checks for the conditional statements within it.
  @Override
  public void onUpdate() {
	  
	if (Conditions.didRightClickBlock("redTeamJoin")) {
		Actions.teleportPlayers("redTeamBase");
	}
	
	if (Conditions.didRightClickBlock("blueTeamJoin")) {
		Actions.teleportPlayers("blueTeamBase");
	}
    
  }
  
  @Override
  public void onJoinedServer(){
	  
	// Spawns players at game start at the command block name 'lobbySpawn'
	Actions.teleportPlayers("lobbySpawn");
    
  }
  
  @Override
  public void onStartGame() {
    
  }
  
  @Override
  public void onResetGameToLobby() {
    
  }
  
  @Override
  public void onRespawned() {
	  
	// Spawns players at respawn at the command block name 'lobbySpawn'  
	Actions.teleportPlayers("lobbySpawn");
    
  }
  
}