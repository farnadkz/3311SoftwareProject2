package model.players;

import java.util.Iterator;

/**
 * This class iterates PlayerCollection.
 */
public class PlayerCollectionIterator implements Iterator<GamePlayer>{
	/**
	 * Int that is index of current object in list.
	 */
	private int current;
	
	/**
	 * Collection of players.
	 */
	private final PlayerCollection playerList;
	
	/**
	 * Constructor for PlayerCollectionIterator.
	 * @param playerList  PlayerCollection that will be iterated.
	 */
	public PlayerCollectionIterator(PlayerCollection playerList) {
		current = -1;
		this.playerList = playerList;
	}
	
	/**
	 * Returns next player in collection.
	 * @return next GamePlayer in collection or null if the end is reached
	 */
	public GamePlayer next() {
		if(hasNext()) {
		this.current = this.current + 1;
	    return this.playerList.get(this.current);
		}else {
			return null;
		}
	}
	
	/**
	 * This method is used to detect if the end of the collection has been reached.
	 * @return true if next object is valid and false if it does not exist.
	 */
	public boolean hasNext() {
		return current + 1 < playerList.size();
	}
}
