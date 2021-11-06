package model;

import java.awt.Color;

import model.players.GamePlayer;
import model.players.Goalkeeper;
import model.players.Striker;

/**
 * This class creates players based on input
 * Note: This class implements the factory design pattern
 */
public class PlayerFactory {
	/**
	 * This method creates and returns a type of player depending on input.
	 * @param playerType  either "striker" or "goalkeeper" will create the corresponding GamePlayer.
	 * @return GamePlayer that is same type as input, null if invalid input.
	 */
	public GamePlayer getPlayer(String playerType) {
		if(playerType.equalsIgnoreCase("STRIKER")) {
			return new Striker("Striker", new Color(0,0,128));
		}else if(playerType.equalsIgnoreCase("GOALKEEPER")) {
			return new Goalkeeper("Goalkeeper", new Color(128,128,0));
		}else {
			return null;
		}
	}
}
