package lotteryOdds;

import java.util.Scanner;

public class LotteryOdds 
{
	public static void main(String [] args)
	{
		@SuppressWarnings("resource")
		Scanner in=new Scanner (System.in);
		System.out.print("How many numbers do you need to draw?");
		int k= in.nextInt();
		
		System.out.print("What is the highest numbers  you can draw?");
		int n=in.nextInt();
		
		int lotteryOdds=1;
		for(int i=1;i<+k;i++) 
			lotteryOdds=lotteryOdds*(n-i+1)/i;
		
		System.out.println("Your odds are 1 in " +lotteryOdds + ". Good Luck!");
	}
}
