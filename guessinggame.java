package prog2;

import java.util.Random;
import java.util.Scanner;

public class guessinggame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		int number = rnd.nextInt(100);
		int guess;
		int one = rnd.nextInt((24 - 1) + 1) + 1;
		int two = rnd.nextInt((49 - 25) + 1) + 25;
		int three = rnd.nextInt((74 - 50) + 1) + 50;
		int four = rnd.nextInt((100 - 75) + 1) + 75;
		boolean satisfied = false;
		String ans;

		System.out.print("enter a number between 1 and 100: ");
		guess = in.nextInt();

		/*System.out.println(":is it an even number?");
		if(guess % 2 == 0)
		{
			System.out.println(":yes");
		}
		else
		{
			System.out.println(":no");

			System.out.println(":is it an odd number?");
			System.out.println(":yes");
		}*/

		System.out.println(":is it greater than or equal to 50?");
		if(guess >= 50)
		{
			System.out.println(":yes");

			System.out.println(":is it greater than or equal to 75?");
			if(guess >= 75)
			{
				System.out.println(":yes");

				System.out.println(":is " + four + " your number?");
				if(guess == four)
				{
					System.out.println(":yes");
				}
				else if(guess > four)
				{
					System.out.println(":no");
					while(!satisfied)
					{
						four++;
						System.out.println(":is " + four + " your number?");
						if(guess != four)
						{
							satisfied = false;
							System.out.println(":no");
						}
						else
						{
							satisfied = true;
							System.out.println(":yes");
							break;
						}
					}
				}
				else
				{
					System.out.println(":no");
					while(!satisfied)
					{
						four--;
						System.out.println(":is " + four + " your number?");
						if(guess != four)
						{
							satisfied = false;
							System.out.println(":no");
						}
						else
						{
							satisfied = true;
							System.out.println(":yes");
							break;
						}
					}
				}

			}
			else
			{
				System.out.println(":no");
				
				System.out.println(":is " + three + " your number?");
				if(guess == three)
				{
					System.out.println(":yes");
				}
				else if(guess > three)
				{
					System.out.println(":no");
					while(!satisfied)
					{
						three++;
						System.out.println(":is " + three + " your number?");
						if(guess != three)
						{
							satisfied = false;
							System.out.println(":no");
						}
						else
						{
							satisfied = true;
							System.out.println(":yes");
							break;
						}
					}
				}
				else
				{
					System.out.println(":no");
					while(!satisfied)
					{
						three--;
						System.out.println(":is " + three + " your number?");
						if(guess != three)
						{
							satisfied = false;
							System.out.println(":no");
						}
						else
						{
							satisfied = true;
							System.out.println(":yes");
							break;
						}
					}
				}
			}
		}
		else
		{
			System.out.println(":no");
			
			System.out.println(":is it greater than or equal to 25?");
			if(guess >= 25)
			{
				System.out.println(":yes");

				System.out.println(":is " + two + " your number?");
				if(guess == two)
				{
					System.out.println(":yes");
				}
				else if(guess > two)
				{
					System.out.println(":no");
					while(!satisfied)
					{
						two++;
						System.out.println(":is " + two + " your number?");
						if(guess != two)
						{
							satisfied = false;
							System.out.println(":no");
						}
						else
						{
							satisfied = true;
							System.out.println(":yes");
							break;
						}
					}
				}
				else
				{
					System.out.println(":no");
					while(!satisfied)
					{
						two--;
						System.out.println(":is " + two + " your number?");
						if(guess != two)
						{
							satisfied = false;
							System.out.println(":no");
						}
						else
						{
							satisfied = true;
							System.out.println(":yes");
							break;
						}
					}
				}
			}
			else
			{
				System.out.println(":no");
				
				System.out.println(":is " + one + " your number?");
				if(guess == one)
				{
					System.out.println(":yes");
				}
				else if(guess > one)
				{
					System.out.println(":no");
					while(!satisfied)
					{
						one++;
						System.out.println(":is " + one + " your number?");
						if(guess != one)
						{
							satisfied = false;
							System.out.println(":no");
						}
						else
						{
							satisfied = true;
							System.out.println(":yes");
							break;
						}
					}
				}
				else
				{
					System.out.println(":no");
					while(!satisfied)
					{
						one--;
						System.out.println(":is " + one + " your number?");
						if(guess != one)
						{
							satisfied = false;
							System.out.println(":no");
						}
						else
						{
							satisfied = true;
							System.out.println(":yes");
							break;
						}
					}
				}
			}
		}

	}

}
