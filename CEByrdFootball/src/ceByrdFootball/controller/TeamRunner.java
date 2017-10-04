package ceByrdFootball.controller;
import ceByrdFootball.model.*;

public class TeamRunner {

	public static void main(String[] args)
	{
		Team myTeam = new Team("CeByrd", 24.5, 124, true);
		Team csTeam = new Team("Captain Shreve", 20, 100, false);
		
		System.out.println(myTeam);
		System.out.println(csTeam);
	}
	
	public String toString()
	{
	String str = " ";
	return str;
	}
}
