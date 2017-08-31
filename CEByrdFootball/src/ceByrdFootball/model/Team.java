package ceByrdFootball.model;

public class Team 
{
	private String teamName;
	private double avgPPG;
	private int numberOfPlayers;
	private boolean winningRecord;
	
	public Team()
	{
		teamName = " ";
		avgPPG = 0.0;
		numberOfPlayers = 0;
		winningRecord = false;
	}
	
	public Team(String teamName, double avgPPG, int numberOfPlayers, boolean winningRecord)
	{
		this.teamName = teamName;
		this.avgPPG = avgPPG;
		this.numberOfPlayers = numberOfPlayers;
		this.winningRecord = winningRecord;
	}
	
	public String toString()
	{
		String str = "This team does not exist.";
		if (teamName != "")
		{
		str = teamName + " has " + numberOfPlayers + " players " + "and is scoring "+ avgPPG + " points per game."  + " Winning Record: ";
		if (winningRecord)
			{
			 str = str + "They are winning.";
			}
			else
			{
				str = str + "They are losing";
			}
		}
		return str;
	}	
}
