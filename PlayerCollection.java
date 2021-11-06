package model.players;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * This class implements collection and stores a list of players.
 * Note: this class implements singleton design pattern.
 */
public final class PlayerCollection implements Collection<GamePlayer>{
	/**
	 * Field variable to store list of players.
	 */
	private final List<GamePlayer> playerList;
	
	/**
	 * Field variable that stores unique instance.
	 */
	private static PlayerCollection uniqueInstance;
	
	/**
	 * Constructor initializes the collection of players.
	 */
	private PlayerCollection() {
		playerList = new ArrayList<>();
	}
	
	/**
	 * Used to create unique instance of PlayerCollection.
	 * Will automatically clear if called a second time.
	 * @return Unique PlayerCollection instance.
	 */
	public static PlayerCollection getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new PlayerCollection();
		}
		uniqueInstance.clear();
		return uniqueInstance;
	}
	
	/**
	 * Method that adds player to list.
	 * @param player  specific GamePlayer to be added.
	 * @return true if GamePlayer was successfully added, false otherwise.
	 */
	public boolean add(GamePlayer player) {
		return playerList.add(player);
	}
	
	/**
	 * Method returns player at index.
	 * @param index  index of player to be returned.
	 * @return GamePlayer at index of list.
	 */
	public GamePlayer get(int index) {
		return playerList.get(index);
	}
	
	/**
	 * The method finds and returns a player given its name.
	 * @param name  a string containing the name.
	 * @return If GamePlayer with matching name is found, the GamePlayer is returned. Otherwise null is returned.
	 */
	public GamePlayer get(String name) {
		for(GamePlayer player : playerList) {
			if(player.getPlayerName() == name) return player;
		}
		return null;
	}
	
	/**
	 * Removes the specified object from the collection.
	 * @param Object  the object to be removed.
	 * @return True if Object was successfully removed, false otherwise.
	 */
	public boolean remove(Object player) {
		return playerList.remove(player);
	}
	
	/**
	 * Sorts the collection.
	 */
	public void sort() {
		playerList.sort(null);
	}
	
	/**
	 * Returns the size of the collection.
	 * @return an int that is the size of the collection.
	 */
	public int size() {
		return playerList.size();
	}
	
	/**
	 * Indicates whether the collection is empty or not.
	 * @return true if the collection is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return playerList.isEmpty();
	}
	
	/**
	 * Will indicate if the collection contains a specific GamePlayer.
	 * @param player  GamePlayer to be searched for.
	 * @return true if GamePlayer is in collection, false otherwise.
	 */
	public boolean contains(GamePlayer player) {
		return playerList.contains(player);
	}
	
	/**
	 * Parses the collection into an array of Objects.
	 * @return an array containing all Objects that are in the collection.
	 */
	public Object[] toArray() {
		return playerList.toArray();
	}
	
	/**
	 * Parses the array into an array of GamePlayer Objects.
	 * @param a  array of GamePlayers.
	 * @return an array of GamePlayers.
	 */
	public <GamePlayer> GamePlayer[] toArray(GamePlayer[] a) {
		return (GamePlayer[]) playerList.toArray(playerList.toArray());
	}
	
	/**
	 * Indicates whether the collection contains an Object.
	 * @param o  the Object to be searched.
	 * @return true if the Object is in the collection, false otherwise.
	 */
	public boolean contains(Object o) {
		return playerList.contains(o);
	}
	
	/**
	 * Creates a PlayerCollectionIterator to iterate the list.
	 * @return a valid PlayerCollectionIterator.
	 */
	public Iterator<model.players.GamePlayer> iterator() {
		return new PlayerCollectionIterator(this);
	}
	
	/**
	 * Indicates whether this collection has all the elements the other collecion "c".
	 * @param c  The collection to be compared.
	 * @return true if this collection and c have the same elements, false otherwise.
	 */
	public boolean containsAll(Collection<?> c) {
		return playerList.containsAll(c);
	}
	
	/**
	 * Adds all the elements in c into this collection.
	 * @param c  Collection whose elements will be added to this collection.
	 * @return true if elements were added successfully, false otherwise.
	 */
	public boolean addAll(Collection<? extends model.players.GamePlayer> c) {
		return playerList.addAll(c);
	}
	
	/**
	 * Removes all elements from this collection that are in c.
	 * @param c  the collection containing all elements to be removed.
	 * @return true if the elements were removed successfully, false otherwise.
	 */
	public boolean removeAll(Collection<?> c) {
		return playerList.removeAll(c);
	}
	
	/**
	 * Removes all elements from this collection that are not in c.
	 * @param c  the collection containing all elements that will be retained.
	 * @return true if the elements were retained successfully, false otherwise.
	 */
	public boolean retainAll(Collection<?> c) {
		return playerList.retainAll(c);
	}
	
	/**
	 * Clears the collection so it is empty.
	 */
	public void clear() {
		playerList.clear();
	}

}
