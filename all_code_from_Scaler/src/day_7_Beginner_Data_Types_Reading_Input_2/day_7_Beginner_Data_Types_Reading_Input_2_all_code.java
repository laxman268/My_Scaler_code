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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * You wrote some code to help you cook a gorgeous lasagna from your favorite cookbook. Now, you want to find the total number of minutes you've been cooking for the sum of your preparation time and the time the lasagna has already spent baking in the oven. The preparation time of one layer is 2 minutes. Given the number of layers added to the lasagna and the number of minutes the lasagna has been baking in the oven, find the total elapsed cooking time (prep + bake) in minutes.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= N <= 20
				 * 0 <= M <= 40
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * There are 2 lines in the input.
				 * The first line contains the integer N denoting the number of layers.
				 * The second line contains the integer M denoting the time the lasagna has already spent baking in the oven.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print in a single line the total elapsed cooking time.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input 1:-
				 * 3
				 * 20
				 * 
				 * Input 2:-
				 * 1
				 * 29
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output 1:-
				 * 26
				 * 
				 * Output 2:-
				 * 31
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * 
				 */
				System.out.println("Please enter the number of layers.");
				int numbe_of_layers = scanner.nextInt();
				System.out.println("Time that is already passed.");
				int time_in_oven = scanner.nextInt();
				int Total_Time = (2 * numbe_of_layers + time_in_oven);
				System.out.println(Total_Time);

			}
				break;
			case 2: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Given two numbers A and B. Multiply them and print the product.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 10^5 <= A, B <= 10^6
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * Two space separated integers A and B in the first line.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print in a single line the product of A and B.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input 1: 100000, 1000000
				 * 
				 * Input 2: 1000000, 10000000
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output 1: 100000000000
				 * 
				 * Output 2: 10000000000000
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Explanation 1: 100000 * 1000000 = 100000000000.
				 * 
				 * Explanation 2: 1000000 * 10000000 = 10000000000000.
				 */

				long NumberOne = scanner.nextInt();
				long NumberTwo = scanner.nextInt();
				long c = NumberOne * NumberTwo;
				System.out.println("So the product is =" + c);

			}
				break;
			case 3: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Given total bills amount and amount of a single bill. Print number of bills.
				 * 
				 * Note : The total amount is equally splitted in all bills. The number of bills should be an integer value. 
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= N <= 10000
				 * 1 <= M <= 100
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * The first line contains a real number N denoting the total budget.
				 * The second line contains an integer M denoting the value of a single bill.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print in a single line denoting the total number of bills that can fit in the total budget.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input:-
				 * 126.3
				 * 5
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output:-
				 * 25
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Note: The problem constraints mean that when we test your code, the test cases used in the backend can have input values only within those constraints. You need not implement them in your code. You need to make sure your code will work for all such input values!
				 */
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
