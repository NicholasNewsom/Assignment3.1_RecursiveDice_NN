

public class DiceRoller
{
	public static void main(String[] args)
	{
	/*
	 * making roller
	 */
	RecDiceRoller dice = new RecDiceRoller();
	System.out.println("the dice rolled "+ dice.roll() + " rolls to get 2");
	System.out.println("The mean number of rolls to get a 2 is: "+ dice.secondRoll());
	}

}
