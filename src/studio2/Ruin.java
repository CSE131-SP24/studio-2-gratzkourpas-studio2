package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Start Amount: ");
		double startAmount = in.nextDouble();
		System.out.print("Win Chance: ");
		double winChance = in.nextDouble();
		System.out.print("Win Limit: ");
		double winLimit = in.nextDouble();
		double money = startAmount;
		System.out.print("Total Simulations: ");
		int totalSimulations = in.nextInt();
		for (int i = 0; i<totalSimulations; i++);
		{
		while (startAmount > 0 && startAmount < winLimit);
		{
			if (Math.random()<=winChance);
			{
				money = money+1;
			}
			if (Math.random()>=winChance);
			{
				money = money-1;
			}
			}
		}
			
	}

}
