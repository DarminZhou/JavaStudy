package bigIntegerTest;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest 
{
	private static Scanner in;

	public static void main (String [] args)
	{
		in = new Scanner (System.in);
		
		System.out.print("How many numbers do you need to draw?");
		int k=in.nextInt();
		
		System.out.print("What is the highest numbers you can draw?");
		int n=in.nextInt();
		
		BigInteger lotteryOdds = BigInteger.valueOf(1);
		
		for(int i=1;i<=k;i++)
			lotteryOdds=lotteryOdds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));
		 
		System.out.println("You odds are 1 in "+lotteryOdds + ". Good Luck!");
	}
}
