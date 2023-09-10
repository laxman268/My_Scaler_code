package day_7_Beginner_Data_Types_Reading_Input_2;

import java.util.Scanner;

public class day_7_Beginner_Data_Types_Reading_Input_2_all_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int once_again = 0;
		do {

			System.out.println("");
			System.out.println("Which code would you like to execute?\n\n");

			System.out.println("1. You wrote some code to help you cook a gorgeous lasagna from your favorite cookbook. Now, you want to find the total number\n    of minutes you've been cooking for the sum of your preparation time and the time the lasagna has already spent baking in the oven.\n    The preparation time of one layer is 2 minutes. Given the number of layers added to the lasagna\n    and the number of minutes the lasagna has been baking in the oven, find the total elapsed cooking time (prep + bake) in minutes.");
			System.out.println("2. Given two numbers A and B. Multiply them and print the product.\n\n");
			System.out.println("3. Given total bills amount and amount of a single bill. Print number of bills.\n"+ "\n"+ "   Note : The total amount is equally splitted in all bills. The number of bills should be an integer value.");
			System.out.print("\nWaiting for you input........:");
			int code_number = scanner.nextInt();
			switch (code_number) {
			case 1: {
				System.out.println("Please enter the number of layers.");
				int numbe_of_layers = scanner.nextInt();
				System.out.println("Time that is already passed.");
				int time_in_oven = scanner.nextInt();
				int Total_Time = (2 * numbe_of_layers + time_in_oven);
				System.out.println(Total_Time);

			}
				break;
			case 2: {

				long NumberOne = scanner.nextInt();
				long NumberTwo = scanner.nextInt();
				long c = NumberOne * NumberTwo;
				System.out.println("So the product is =" + c);

			}
				break;
			case 3: {
					System.out.println("What is the total budget");
					float a= scanner.nextFloat();
					System.out.println("What is the bill amount");
			       int b=scanner.nextInt();
			       int c= (int) a/b; 
			        System.out.println("The remaining amount is = "+c);
			}
				break;
			default: {
				System.out.println("Please enter the correct option......");
			}
			}
			System.out.println("\n\nWould you like to try again?..... 1/0");

			once_again = scanner.nextInt();

		} while (once_again == 1);
		if (once_again == 1) {
		} else if (once_again == 0) {
			System.out.println("Thanks for using my test question......\n");
		} else {
			System.out.println("incorrcet option. Thanks for using my set question......");
		}

		scanner.close();

	}

}
