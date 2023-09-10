package day_5_Beginner_Output_And_Basic_Data_Types;

import java.util.*;

public class Day_5_Beginner_Output_And_Basic_Data_Types_all_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int once_again = 0;
		do {

			System.out.println("");
			System.out.println("Which code would you like to execute?\n\n");
			System.out.println("1. Print the following text: \n\n" + "   Hello 40\n" + "   50 World !");
			System.out.println("2. Print the following text: \n\n" + "   Hello\n"+ "\n"+ "   World !");
			System.out.println("3. Print the following pattern in output\n"+"   **********\n"+ "   *        *\n"+ "   *        *\n"+ "   **********");
			System.out.println("4. Print the following pattern in output \n"+"    *\n"+ "   * *\n"+ "    *");
			System.out.println("5. Print first five multiples of 3 that is :\n"+"   3 6 9 12 15");
			System.out.println("6. Print first five multiples of 3 in the following manner -\n"+"   3*1 = 3\n"+ "   3*2 = 6\n"+ "   3*3 = 9\n"+ "   3*4 = 12\n"+ "   3*5 = 15");
			System.out.println("7. Print first 5 odd numbers i.e. 1, 3, 5, 7, 9.");
			System.out.println("8. Print first 5 even numbers i.e. 0, 2, 4, 6, 8.");
 
			
			System.out.print("\nWaiting for you input........:");
			int code_number = scanner.nextInt();
			switch (code_number) {
			case 1: {
					System.out.println("Hello " + 40);
					System.out.println(50 + " World !");
				
			}break;
			case 2: {
					System.out.println("Hello");
			        System.out.println("");
			        System.out.print("World !");
				
			}break;
			case 3: {
				    System.out.println("**********");
			        System.out.println("*        *");
			        System.out.println("*        *");
			        System.out.println("**********");
				
			}break;
			case 4: {
					System.out.println(" *");
			        System.out.println("* *");
			        System.out.println(" *");
				
			}break;
			case 5: {
					System.out.println("3 6 9 12 15");
				
			}break;
			case 6: {
					System.out.println("3*1 = " + 3*1);
			        System.out.println("3*2 = " + 3*2);
			        System.out.println("3*3 = " + 3*3);
			        System.out.println("3*4 = " + 3*4);
			        System.out.println("3*5 = " + 3*5);
				
			}break;
			case 7: {
					System.out.println("1 3 5 7 9");
				
			}break;
			case 8: {
					System.out.println("0 2 4 6 8");
				
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
}
