package gcfalgorithm;

public class EuclidGCF 
{
	public int gcfParish(int a, int b)
	{
		
		while (a != b)
		{
			if (b >a)
			{
				b = b-a;
			}
			else
			{
				a = a-b;
			}
		}
		int gcf = a;
		
		return gcf;
	}
	
}
