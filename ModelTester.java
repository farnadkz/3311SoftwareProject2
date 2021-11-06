package model;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Test;

import model.players.GamePlayer;
import model.players.PlayerCollection;

public class ModelTester {
	@Test
	public void statTester() {
	PlayerStatistics stats = new PlayerStatistics();
	Integer zero = 0;
	Integer one = 1;
	assertEquals(zero, stats.getStatistics());
	stats.setStatistics(one);
	assertEquals(one, stats.getStatistics());
	}
	
	@Test
	public void factoryTester() {
		PlayerFactory factory = new PlayerFactory();
		GamePlayer player = factory.getPlayer("Striker");
		assertEquals("Striker", player.getPlayerName());
		player = factory.getPlayer("Goalkeeper");
		assertEquals("Goalkeeper", player.getPlayerName());
		player = factory.getPlayer("NoName");
		assertEquals(null, player);
	}
	
	@Test
	public void collectionTester() {
		PlayerCollection collection = PlayerCollection.getInstance();
		assertEquals(collection, PlayerCollection.getInstance());
		PlayerFactory factory = new PlayerFactory();
		GamePlayer player = factory.getPlayer("Striker");
		assertEquals(true, collection.add(player));
		player = factory.getPlayer("Goalkeeper");
		assertEquals(true, collection.add(player));
		assertEquals("Striker", collection.get(0).getPlayerName());
		assertEquals("Goalkeeper", collection.get(1).getPlayerName());
		assertEquals("Striker", collection.get("Striker").getPlayerName());
		assertEquals("Goalkeeper", collection.get("Goalkeeper").getPlayerName());
		assertEquals(null, collection.get("invalid"));
		
		Iterator<model.players.GamePlayer> iterator = collection.iterator();
		assertEquals(true, iterator.hasNext());
		assertEquals("Striker", iterator.next().getPlayerName());
		assertEquals(true, iterator.hasNext());
		assertEquals("Goalkeeper", iterator.next().getPlayerName());
		assertEquals(false, iterator.hasNext());
		assertEquals(null, iterator.next());
		
		assertEquals(true, collection.contains(player));
		assertEquals(true, collection.remove(player));
		collection.sort();
		assertEquals(false, collection.isEmpty());
		assertEquals("Striker scored 0 goals", collection.toArray()[0].toString());
		assertEquals("Striker scored 0 goals", collection.toArray(collection.toArray())[0].toString());
		assertEquals(false, collection.contains(new Object()));
		assertEquals(true, collection.containsAll(collection));
		assertEquals(true, collection.addAll(collection));
		assertEquals(false, collection.retainAll(collection));
		assertEquals(true, collection.removeAll(collection));
		collection.clear();
	}
}
