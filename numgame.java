import java.util.Scanner;

public class numgame
 {
	public static void
	NumberGame()
	{
		Scanner sc = new Scanner(System.in);
		int number = 1 + (int)(100 * Math.random());
		int a = 6;

		int i, guess;

		System.out.println("\n A number is chosen between 1 to 100.Guess the number within 6 attempts.");
		for (i = 0; i < a; i++) 
		{

			System.out.println("\n Guess the number:");
			guess = sc.nextInt();
			if (number == guess) 
			{
				System.out.println("\n Congratulations! You guessed the number.");
				break;
			}
			else if (number > guess && i != a - 1)
			 {
				System.out.println("\n The number is greater than " + guess+ "\n Try Again!");
			}
			else if (number < guess && i != a - 1)
			 {
				System.out.println("\n The number is  less than " + guess+"\n Try Again!");
			}
		}

		if (i == a) 
		{
			System.out.println("\n You are out of the attempt ");

			System.out.println("\n The number was " + number);
		}
	}
	public static void
	main(String arg[])
	{
		NumberGame();
	}
}
