package day_6_Beginner_Data_Types_Reading_Input_1;

import java.util.Scanner;

public class Day_6_Beginner_Data_Types_Reading_Input_1_all_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int once_again = 0;
		do {

			System.out.println("");
			System.out.println("Which code would you like to execute?\n\n");
			//question area 
			System.out.println("1. You're going to write some code to help you cook a gorgeous lasagna from your favorite cookbook. According to your cookbook, the Lasagna should be in the oven for 40 minutes.\n Given the time (in minutes), the lasagna has been in the oven, find how many more minutes the lasagna still needs to bake for.\n\n");
			System.out.println("2. You'll write some code to help you cook a gorgeous lasagna from your favorite cookbook. Now, you also want to add a few layers to the lasagna. Assume **each layer takes 2 minutes** to prepare.\n Given the number of layers you want to add to the lasagna, find how many minutes you would spend making them.\n\n");
			System.out.println("3. Given three numbers A, B and C. Add them and print the sum.\n\n");
			System.out.println("4. Given Value of Length (L) and Breadth (B) of a Rectangle. Calculate Area Of Rectangle and Print the Result.\n"+ "\n"+ "   Note :\n"+ "   Formula for Area of rectangle is Area : Length * Breadth\n\n");
			System.out.println("5. Your friend Rahul plans to visit exotic countries all around the world. Sadly, Rahul's math skills aren't good enough. Given the amount of money Rahul has before the currency exchange and the amount of money that is spent from his savings,\n print the amount of money that remains in his savings.\n\n");
			System.out.println("6. Given the value of a single bill and the number of bills you received, print the total value of the bills.\n"+ "\n"+ "   Note: The value of all the bills are same");
			
			System.out.print("\nWaiting for you input........:");
			int code_number = scanner.nextInt();
			switch (code_number) {
			case 1: {
				System.out.println("So since how long the lasagna was in oven?");
				int Time = scanner.nextInt();
				if (Time < 40) {
					System.out.println("Means we need to cook it for " + (40 - Time) + " more.");
				} else if(Time == 40){
					System.out.println("OK, Now it is cooked");
				}else {
					System.out.println("Ooooooo it is over cooked!.....");
				}

			}break;
			case 2: {
				System.out.println("So, How many layers should you like to add");
				int Time = scanner.nextInt();
				System.out.println("It will take approximately "+(Time*2)+" Min");
				

			}break;
			case 3: {
				System.out.println("Please enter the number one by one");
				int numberOne= scanner.nextInt();
		        int numberSnd= scanner.nextInt();
		        int NumberThree= scanner.nextInt();
		       System.out.println("So the tolal is = "+(numberOne+numberSnd+NumberThree));
		        

			}break;
			case 4: {
				System.out.println("To calculate the area of Rectangle please enter the lenght and breadth");
				System.out.println("Lenght is = ");
				int length=scanner.nextInt();
				System.out.println("Breadth is = ");
		        int breadth=scanner.nextInt();
		        System.out.println("Area of a Reactange is = "+(length*breadth));
				

			}break;
			case 5: {
					System.out.println("So you are planing to visit some other country. That's Great!....");
					System.out.println("How much money you want to Exchange?");
				 	int total_amount=scanner.nextInt();
				 	System.out.println("For this I will charge you = ");
				 	System.out.println("Please enter the amount");
			        int Exchange_amount=scanner.nextInt();
			        System.out.println("Ok the here us your money after deducting the charges the total remaining amount is = "+(total_amount-Exchange_amount));
				

			}break;
			case 6: {
				System.out.println("Enter the price of bill");
				int Bill=scanner.nextInt();
				System.out.println("Number of bills that you have?");
		        int Number_of_Bill=scanner.nextInt();
		        System.out.println("So the total is = "+(Bill*Number_of_Bill));

			}break;
			
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
	//

}
