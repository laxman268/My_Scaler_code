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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * You're going to write some code to help you cook a gorgeous lasagna from your favorite cookbook. According to your cookbook, the Lasagna should be in the oven for 40 minutes. Given the time (in minutes), the lasagna has been in the oven, find how many more minutes the lasagna still needs to bake for.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 0 <= N <= 40
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * The only first line contains the integer N, denoting the actual time (in minutes) the lasagna has been in the oven for.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print in a single line how many minutes the lasagna needs to bake.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input: 
				 * 30
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output: 
				 * 10
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Note: The problem constraints mean that when we test your code, the test cases used in the backend can have input values only within those constraints.You need not implement them in your code.You need to make sure your code will work for all such input values!
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * You'll write some code to help you cook a gorgeous lasagna from your favorite cookbook. Now, you also want to add a few layers to the lasagna. Assume **each layer takes 2 minutes** to prepare. Given the number of layers you want to add to the lasagna, find how many minutes you would spend making them.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * The only first line contains the integer N denoting the number of layers.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print in a single line how many minutes are required to prepare N layers.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input:-
				 * 2
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output:-
				 * 4
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Note: The problem constraints mean that when we test your code, the test cases used in the backend can have input values only within those constraints. You need not implement them in your code. You must ensure your code will work for all such input values!
				 */
				System.out.println("So, How many layers should you like to add");
				int Time = scanner.nextInt();
				System.out.println("It will take approximately "+(Time*2)+" Min");
				

			}break;
			case 3: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Given three numbers A, B and C. Add them and print the sum.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * Three space separated integers A, B, and C in the first line.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print in a single line the sum of A, B and C.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input 1: 2 3 -1
                 *
I				 * nput 2: 7 -4 0
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output 1: 4
                 *
				 * Output 2: 3
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Explanation 1: 2 + 3 + (-1) = 4.
                 *
				 * Explanation 2: 7 + (-4) + 0 = 3.
				 */
				System.out.println("Please enter the number one by one");
				int numberOne= scanner.nextInt();
		        int numberSnd= scanner.nextInt();
		        int NumberThree= scanner.nextInt();
		       System.out.println("So the tolal is = "+(numberOne+numberSnd+NumberThree));
		        

			}break;
			case 4: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Given Value of Length (L) and Breadth (B) of a Rectangle. Calculate Area Of Rectangle and Print the Result.
                 * 
                 * Note :
                 * Formula for Area of rectangle is Area : Length * Breadth
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 
                 * 1. 0 <= L, B <= 10000
                 * 2. L and B are Integer Number.
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * he first line of the input is L denoting the Length
T                 * he second line of the input is B denoting the Breadth.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print result in a single line denoting the Area of rectangle.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input 1 :
                 * 15
                 * 65
                 * 
                 * Input 2 :
                 * 45
                 * 26
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output 1 :
                 * 975
                 * 
				 * Output 2 :
                 * 1170
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Example Exaplanation 1 :
                 * Length of 15 and breadth is 65, Area is 15 * 65 = 975
                 * 
                 * Example Exaplanation 2 :
                 * Length of 45 and breadth is 26, Area is 45 * 26 = 1170
                 * 
                 */
				System.out.println("To calculate the area of Rectangle please enter the lenght and breadth");
				System.out.println("Lenght is = ");
				int length=scanner.nextInt();
				System.out.println("Breadth is = ");
		        int breadth=scanner.nextInt();
		        System.out.println("Area of a Reactange is = "+(length*breadth));
				

			}break;
			case 5: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Your friend Rahul plans to visit exotic countries all around the world. Sadly, Rahul's math skills aren't good enough. Given the amount of money Rahul has before the currency exchange and the amount of money that is spent from his savings, print the amount of money that remains in his savings.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= N <= 1000
				 * 1 <= M <= N
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * The first line contains an integer N denoting the total savings, the amount of money before exchange.
				 * The second line contains an integer M denoting the exchanging amount, denoting the amount of money that is spent from the savings.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print a single line denoting the amount of money that is left in his savings.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input:-
				 * 116
				 * 12
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output:-
				 * 104
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Note: The problem constraints mean that when we test your code, the test cases used in the backend can have input values only within those constraints. You need not implement them in your code. You must ensure your code will work for all such input values!
				 */
					System.out.println("So you are planing to visit some other country. That's Great!....");
					System.out.println("How much money you want to Exchange?");
				 	int total_amount=scanner.nextInt();
				 	System.out.println("For this I will charge you = ");
				 	System.out.println("Please enter the amount");
			        int Exchange_amount=scanner.nextInt();
			        System.out.println("Ok the here us your money after deducting the charges the total remaining amount is = "+(total_amount-Exchange_amount));
				

			}break;
			case 6: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Given the value of a single bill and the number of bills you received, print the total value of the bills.
				 *
				 * Note: The value of all the bills are same
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= N <= 100
				 * 1 <= M <= 100
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * The first line of the input is an integer N denoting the value of a single bill.
				 * The second line of the input is an integer M denoting the number of bills.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print in a single line denoting the total value of bills.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input:-
				 * 12
				 * 10
				 *
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output:-
				 * 120
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Note: The problem constraints mean that when we test your code, the test cases used in the backend can have input values only within those constraints. You need not implement them in your code. You need to make sure your code will work for all such input values!
				 */
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
