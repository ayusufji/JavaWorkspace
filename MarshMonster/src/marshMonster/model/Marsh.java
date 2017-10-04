package marshMonster.model;

public class Marsh 
{
	private String name;
	private double legs;
	private int arms;
	private boolean buttons;
	private int eyes;
	
	public Marsh()
	{
		name = " ";
		legs = 0.0;
		arms = 0;
		buttons = false;
	}
	
	public Marsh(String name, double legs, int arms, int eyes, boolean buttons)
	{
		this.name = name;
		this.legs = legs;
		this.arms = arms;
		this.buttons = buttons;
		this.eyes = eyes;
	}
	
	public String toString()
	{
		String str = "This monster does not exist.";
		if (name != "")
		{
		str = name + " has " + arms + " arms " + "has "+ legs +" legs " + " and has " + eyes + " eyes.";
		if (buttons)
			{
			 str = str + "It has buttons.";
			}
			else
			{
				str = str + " It does not have buttons.";
			}
		}
		return str;
	}	
	
}
