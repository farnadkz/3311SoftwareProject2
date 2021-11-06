package model;

/**
 * This class stores statistics for a player.
 */
public class PlayerStatistics {
	/**
	 * Field variable to store statistics.
	 */
	private Integer statistics = 0;
	
	/**
	 * This method sets the player's statistics.
	 * @param newStatistics  Integer representing player's score.
	 */
	public void setStatistics(Integer newStatistics) {
		this.statistics = newStatistics;
	}
	
	/**
	 * This method returns the player's statistics.
	 * @return Integer that is player's statistic.
	 */
	public Integer getStatistics() {
		return this.statistics;
	}
}
