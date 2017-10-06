
public class Die 
{
	
	private int NumDots;
	
	public void roll ()
	{
		NumDots = (int)(Math.random() *6)+1;
	}
	
	public int getNumDots()
	{
		return NumDots;
	}
	
	
	
	
	
	
	
}
