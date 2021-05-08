package mathformulas;
import java.util.*; 
public class DiceRolling 
{

	public static void main(String[] args) 
	{ 
		int num1 = 0; 
		for(int i = 1; i <= 30; i ++)
		{
			System.out.println("Roll " + i + ": ");
			roll(num1); 
		}
	}
	public static void roll(int num1)
	{
		Random rand = new Random(); 
		num1 = rand.nextInt(6) + 1; 
		System.out.println(num1);
	}
}
