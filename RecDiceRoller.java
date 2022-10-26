
public class RecDiceRoller
{
	/*
	 * upper bound for dice faces
	 */
	final int Bound = 6;
	
	double sum;
	
	/*
	 * constructor for roller
	 */
	public RecDiceRoller()
	{
		
	}
	
	public double roll()
	{
		int Face = (int)(Math.random()*Bound)+1;
		
		if(Face != 2)
		{
			roll();
			System.out.println("The roll was: "+ Face);
		}
		
		
		sum = sum+1;
		return sum;
	}
	
	/*
	 * roller for 1000 rolls
	 */
	public double secondRoll()
	{
		for(int i = 0; i < 1000; i++)
			roll();
		return sum/1000;
	}
}
