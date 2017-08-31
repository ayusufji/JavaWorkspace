package ceByrdFootball.model;

public class Player extends Team
{
	private String name;
	private int number;
	private double height;
	private boolean start;
	
	public Player()
	{
		name = " ";
		number = 0;
		height = 0.0;
		start = false;
	}
	
	public Player(String name, double height, int number, boolean start)
	{
		this.name = name;
		this.height = height;
		this.number = number;
		this.start = start;
	}
	
	public String toString()
	{
		String str = "This team does not exist.";
		if (name != "")
		{
		str = name + " has " + number + " players " + "and is scoring "+ height + " points per game."  + " Winning Record: ";
		if (start)
			{
			 str = str + "They are starting.";
			}
			else
			{
				str = str + "They are not starting";
			}
		}
		return str;
	}	
}

}
