package day_8_Beginner_Operators_Arithmetic_Assignment_and_other;

import java.util.Scanner;

public class Day_8_Beginner_Operators_Arithmetic_Assignment_and_other_all_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int once_again = 0;
		do {

			System.out.println("");
			System.out.println("Which code would you like to execute?\n\n");
			// Question
			System.out.println(
					"1. Your younger brother is going to a modern school. In his school, there was a coding competition planned. The pannel asked a question \"Write a program which can perform the task - Add two numbers and divide them by a third number and print the remainder\".\n"
							+ "   You are a programmer and your brother asks you to write a code that helps him to check his approach.\n\n");
			System.out.println("2.Take three numbers from the user, i.e. n1, n2 and n3.\n" + "\n"
					+ "Now your target is Print the output in the following ways:");
			System.out.println(
					"---------------------------------------------------------------------------------------------------------------------------");
			System.out.println("   In the first line:  print \"Number 1 is \" then n1\n"
					+ "   In the second line: print \"Number 2 is \" then n2\n"
					+ "   In the third line:  print \"Number 3 is \" then n3\n"
					+ "   In the fourth line: print \"(n1 < n2) condition is \" then print boolean result of (n1 < n2).\n"
					+ "   In the fifth line:  print \"(n2 == n3) condition is \" then print boolean result of (n2 == n3).\n"
					+ "   In the sixth line:  print \"(n1 < n2) && (n2 == n3) condition is \" then print boolean result of (n1 < n2) && (n2 == n3).");
			System.out.println(
					"---------------------------------------------------------------------------------------------------------------------------\n\n");

			System.out.println("3. Take three numbers from user, i.e. n1, n2 and n3.\n"
					+ "\nNow your target is Print the output in following ways:");
			System.out.println(
					"---------------------------------------------------------------------------------------------------------------------------");
			System.out.println("   In first line : print \"Number 1 is \" then n1\n"
					+ "   In second line : print \"Number 2 is \" then n2\n"
					+ "   In third line : print \"Number 3 is \" then n3\n"
					+ "   In fourth line : print \"(n1 > n2) condition is \" then print boolean result of (n1 > n2).\n"
					+ "   In fifth line : print \"(n2 <= n3) condition is \" then print boolean result of (n2 <= n3).\n"
					+ "   In sixth line : print \"(n1 < n2) || ((n2 == n3) && (n1 < n3)) condition is \" then print boolean result of (n1 < n2) || ((n2 == n3) && (n1 < n3)).");
			System.out.println(
					"---------------------------------------------------------------------------------------------------------------------------\n\n");
			System.out.println("4. Take three numbers from user, i.e. n1, n2 and n3.\n"
					+ "\nYou have to print numbers taken by user as :");
			System.out.println(
					"---------------------------------------------------------------------------------------------------------------------------");
			System.out.println("   In First Line : \"Number 1 is \" then n1.\n"
					+ "   In Second Line : \"Number 2 is \" then n2.\n"
					+ "   In Third Line : \"Number 3 is \" then n3.\n"
					+ "   then In Fourth Line print \"true\", if all the conditions is true from the following:\n"
					+ "   Condition 1 : n1 < 50\n" + "   Condition 2 : n2 > n3\n" + "   Condition 3 : n1 <= n3\n"
					+ "   Otherwise print false.");
			System.out.println(
					"---------------------------------------------------------------------------------------------------------------------------\n\n");
			System.out.println("5. Take three numbers from user, i.e. n1, n2 and n3.\n"
					+ "\nYou have to print numbers taken by user as :");
			System.out.println(
					"---------------------------------------------------------------------------------------------------------------------------");
			System.out.println("   In First Line : \"Number 1 is \" then n1.\n"
					+ "   In Second Line : \"Number 2 is \" then n2.\n"
					+ "   In Third Line : \"Number 3 is \" then n3.\n"
					+ "   then In Fourth Line print \"true\", if atleast single condition is true from the following:\n"
					+ "   Condition 1 : n1 < 50\n" + "   Condition 2 : n2 > n3\n" + "   Condition 3 : n1 == n3\n"
					+ "   Otherwise print false.");
			System.out.println(
					"---------------------------------------------------------------------------------------------------------------------------\n\n");

			System.out.println(
					"6. Write a program to take two inputs from the user , first is String (S) and second is an Integer (N) and then print the desired output. Desired output is - Print Integer value followed by the String value in the same line.\n\n");
			System.out.println(
					"7.Rahul has N Apples initially, Karan has M apples initially. Rahul gave 5 apples to Karan and after some time Rahul plucked 2 times Initial apples (N) he had from Tree. Find out the total number of apples Rahul and Karan are left with.\n\n");
			System.out.println("You are given a variable X, modify it using the following steps.\n"
					+ "   Make X five times greater than the original value.\n"
					+ "   Increment the value of X by 10.\n"
					+ "   Divide the value of X by 2.");
			
			// Question END
			System.out.print("\nWaiting for you input........:");
			int code_number = scanner.nextInt();
			switch (code_number) {
			case 1: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 *Your younger brother is going to a modern school. In his school, there was a coding competition planned. The pannel asked a question "Write a program which can perform the task - Add two numbers and divide them by a third number and print the remainder".
				 * You are a programmer and your brother asks you to write a code that helps him to check his approach. 
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 0 <= N1, N2 <= 10000000
				 * 1 <= N3 <= 10000000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * First line is number N1.
				 * 
				 * Second line is number N2.
				 * 
				 * Third line is number N3.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print the value of remainder.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input 1 :
				 * 
				 * 14
				 * 
				 * 63
				 * 
				 * 12
				 * 
				 * Input 2 :
				 * 
				 * 53
				 * 
				 * 29
				 * 
				 * 23
				 * 
				 * 
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output 1 :
				 * 
				 * 5
				 * 
				 * Output 2 :
				 * 
				 * 13
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Explanation 1 :
				 * 
				 * Addition of 14 and 63 is equal to 77, and when we divide 77 by 12 we get 5 as remainder.
				 * 
				 * Explanation 2 :
				 * 
				 * Addition of 53 and 29 is equal to 82, and when we divide 82 by 23 we get 13 as remainder.
				 */
				System.out.println("Please enter the numbers one by one");
				System.out.print("First number : ");
				int NumberOne = scanner.nextInt();
				System.out.print("Secand number : ");
				int NumberTwo = scanner.nextInt();
				System.out.print("Third number : ");
				int NumberThree = scanner.nextInt();
				int Calculate = (NumberOne + NumberTwo) % NumberThree;
				System.out.println("So after calculationg the number the Remainder is = " + Calculate);

			}
				break;
			case 2: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Take three numbers from the user, i.e. n1, n2 and n3.
				 • 
				 • Now your target is Print the output in the following ways:
				 • In the first line:  print "Number 1 is " then n1
				 • In the second line: print "Number 2 is " then n2
				 • In the third line:  print "Number 3 is " then n3
				 • In the fourth line: print "(n1 < n2) condition is " then print boolean result of (n1 < n2).
				 • In the fifth line:  print "(n2 == n3) condition is " then print boolean result of (n2 == n3).
				 • In the sixth line:  print "(n1 < n2) && (n2 == n3) condition is " then print boolean result of (n1 < n2) && (n2 == n3).
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * -1000000 <= n1, n2, n3 <= 1000000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * The First line is an integer, n1
				 • The Second line is an integer, n2
				 • The Third line is an integer, n3
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print the statement with Boolean results.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 47
				 • 82
				 • 82
				 • 
				 • 14
				 • 78
				 • 98 
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Number 1 is 47
				 • Number 2 is 82
				 • Number 3 is 82
				 • (n1 < n2) condition is true
				 • (n2 == n3) condition is true
				 • (n1 < n2) && (n2 == n3) condition is true
				 • 
				 • Number 1 is 14
				 • Number 2 is 78
				 • Number 3 is 98
				 • (n1 < n2) condition is true
				 • (n2 == n3) condition is false
				 • (n1 < n2) && (n2 == n3) condition is false
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * n1(47) is strictly smaller than n2(82) and n2(82) and n3(82) are equal
				 * n1(14) is strictly smaller than n2(78) but n2(78) and n3(98) are not equal
				 */
				System.out.println("Please enter the numbers one by one");
				System.out.print("First number : ");
				int N1 = scanner.nextInt();
				System.out.print("Secand number : ");
				int N2 = scanner.nextInt();
				System.out.print("Third number : ");
				int N3 = scanner.nextInt();
				boolean N4 = (N1 < N2);
				boolean N5 = (N2 == N3);
				boolean N6 = (N1 < N2) && (N2 == N3);

				System.out.println("Number 1 is " + N1);
				System.out.println("Number 2 is " + N2);
				System.out.println("Number 3 is " + N3);
				System.out.println("(n1 < n2) condition is " + N4);
				System.out.println("(n2 == n3) condition is " + N5);
				System.out.println("(n1 < n2) && (n2 == n3) condition is " + N6);

			}
				break;
			case 3: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Take three numbers from user, i.e. n1, n2 and n3.
				 * Now your target is Print the output in following ways:
				 * In first line : print "Number 1 is " then n1
				 * In second line : print "Number 2 is " then n2
				 * In third line : print "Number 3 is " then n3
				 * In fourth line : print "(n1 > n2) condition is " then print boolean result of (n1 > n2).
				 * In fifth line : print "(n2 <= n3) condition is " then print boolean result of (n2 <= n3).
				 * In sixth line : print "(n1 < n2) || ((n2 == n3) && (n1 < n3)) condition is " then print boolean result of (n1 < n2) || ((n2 == n3) && (n1 < n3)).
				 * 
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * -1000000 <= n1, n2, n3 <= 1000000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * First line is n1
				 * Second line is n2
				 * Third line is n3
				 * 
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * print the statement with boolean results
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input 1 :
				 * 47
				 * 82
				 * 82
				 * 
				 * Input 2 :
				 * 14
				 * 78
				 * 98
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output 1 :
				 * Number 1 is 47
				 * Number 2 is 82
				 * Number 3 is 82
				 * (n1 > n2) condition is false
				 * (n2 <= n3) condition is true
				 * (n1 < n2) || ((n2 == n3) && (n1 < n3)) condition is true
				 * 
				 * Output 2 :
				 * Number 1 is 14
				 * Number 2 is 78
				 * Number 3 is 98
				 * (n1 > n2) condition is false
				 * (n2 <= n3) condition is true
				 * (n1 < n2) || ((n2 == n3) && (n1 < n3)) condition is true
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Explanation 1 :
				 * n1(47) is strictly smaller than n2(82) and n2(82) and n3(82) are equal
				 * 
				 * Explanation 2 :
				 * n1(14) is strictly smaller than n2(78) but n2(78) and n3(98) are not equal
				 * 
				 */
				System.out.println("Please enter the numbers one by one");
				System.out.print("First number : ");
				int N1 = scanner.nextInt();
				System.out.print("Secand number : ");
				int N2 = scanner.nextInt();
				System.out.print("Third number : ");
				int N3 = scanner.nextInt();
				boolean N4 = (N1 > N2);
				boolean N5 = (N2 <= N3);
				boolean N6 = (N1 < N2) || ((N2 == N3) && (N1 < N3));

				System.out.println("Number 1 is " + N1);
				System.out.println("Number 2 is " + N2);
				System.out.println("Number 3 is " + N3);
				System.out.println("(n1 > n2) condition is " + N4);
				System.out.println("(n2 <= n3) condition is " + N5);
				System.out.println("(n1 < n2) || ((n2 == n3) && (n1 < n3)) condition is " + N6);
			}
				break;
			case 4: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Take three numbers from user, i.e. n1, n2 and n3.
				 * You have to print numbers taken by user as :
				 * In First Line : "Number 1 is " then n1.
				 * In Second Line : "Number 2 is " then n2.
				 * In Third Line : "Number 3 is " then n3.
				 * then In Fourth Line print "true", if all the conditions is true from the following:
				 * Condition 1 : n1 < 50
				 * Condition 2 : n2 > n3
				 * Condition 3 : n1 <= n3
				 * Otherwise print false. 
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * -1000000 <= n1, n2, n3 <= 1000000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * First line is n1
				 * Second line is n2
				 * Third line is n3
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * In First Line : "Number 1 is " then n1.
				 * In Second Line : "Number 2 is " then n2.
				 * In Third Line : "Number 3 is " then n3.
				 * In Fourth Line print "true", if all the conditions are true Otherwise print false.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input 1 :
				 * 45
				 * 82
				 * 80
				 * 
				 * Input 2 :
				 * 55
				 * 78
				 * 98
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output 1 :
				 * Number 1 is 45
				 * Number 2 is 82
				 * Number 3 is 80
				 * true
				 * 
				 * Output 2 :
				 * Number 1 is 55
				 * Number 2 is 78
				 * Number 3 is 98
				 * false
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Explanation 1 :
				 * n1(45) is smaller than 50, n2(82) is greater than n3(80) and n1(45) is less than equal to n3(80). so all conditions are true.
				 * 
				 * Explanation 2 :
				 * n1(55) is not less than 50, so if any single condition is false then result is false.
				 */
				System.out.println("Please enter the numbers one by one");
				System.out.print("First number : ");
				int N1 = scanner.nextInt();
				System.out.print("Secand number : ");
				int N2 = scanner.nextInt();
				System.out.print("Third number : ");
				int N3 = scanner.nextInt();
				boolean N4 = (N1 < 50) && (N2 > N3) && (N1 <= N3);

				System.out.println("Number 1 is " + N1);
				System.out.println("Number 2 is " + N2);
				System.out.println("Number 3 is " + N3);
				System.out.println("(N1<50)&&(N2>N3)&&(N1 <= N3) is = " + N4);
			}
				break;
			case 5: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Take three numbers from user, i.e. n1, n2 and n3.
				 * You have to print numbers taken by user as :
				 * In First Line : "Number 1 is " then n1.
				 * In Second Line : "Number 2 is " then n2.
				 * In Third Line : "Number 3 is " then n3.
				 * then In Fourth Line print "true", if atleast single condition is true from the following:
				 * Condition 1 : n1 < 50
				 * Condition 2 : n2 > n3
				 * Condition 3 : n1 == n3
				 * Otherwise print false.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * -1000000 <= n1, n2, n3 <= 1000000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * First line is n1
				 * Second line is n2
				 * Third line is n3
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * In First Line : "Number 1 is " then n1.
				 * In Second Line : "Number 2 is " then n2.
				 * In Third Line : "Number 3 is " then n3.
				 * In Fourth Line print "true", if atleast single condition is true Otherwise print false.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input 1 :
				 * 57
				 * 82
				 * 80
				 * 
				 * Input 2 :
				 * 55
				 * 78
				 * 98
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output 1 :
				 * Number 1 is 57
				 * Number 2 is 82
				 * Number 3 is 80
				 * true
				 * 
				 * Output 2 :
				 * Number 1 is 55
				 * Number 2 is 78
				 * Number 3 is 98
				 * false
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Explanation 1 :
				 * n1(55) is not smaller than 50 but n2(82) is greater than n3(80) so if second condition is true, output is true. If any single condition is true then no need to check next conditions.
				 * 
				 * Explanation 2 :
				 * n1(55) is not less than 50, n2(78) is not greater than n3(98) and n1(55) is not equal to n3(98) so not a single condition is true here, that's why we print false
				 */
				System.out.println("Please enter the numbers one by one");
				System.out.print("First number : ");
				int N1 = scanner.nextInt();
				System.out.print("Secand number : ");
				int N2 = scanner.nextInt();
				System.out.print("Third number : ");
				int N3 = scanner.nextInt();
				boolean N4 = (N1 < 50) || (N2 > N3) || (N1 == N3);

				System.out.println("Number 1 is " + N1);
				System.out.println("Number 2 is " + N2);
				System.out.println("Number 3 is " + N3);
				System.out.println("(N1<50)||(N2>N3)||(N1 == N3) is = " + N4);
			}
				break;
			case 6: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Write a program to take two inputs from the user , first is String (S) and second is an Integer (N) and then print the desired output. Desired output is - Print Integer value followed by the String value in the same line.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= N <= 100
				 * 1 <= S.length() <= 1000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * First Line is S the value of String
				 * Second Line is N the value of integer variable.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print Integer value followed by the String value in the same line.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Hello World
				 * 100
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 100 Hello World
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * N = 100, S = Hello World
				 * Desired output -> 100 Hello World
				 */
				String N1 = scanner.nextLine();
				int N2 = scanner.nextInt();

				System.out.print(N2);
				System.out.println(" " + N1);
			}
				break;
			case 7: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * 
 				 * Rahul has N Apples initially, Karan has M apples initially. Rahul gave 5 apples to Karan and after some time Rahul plucked 2 times Initial apples (N) he had from Tree. Find out the total number of apples Rahul and Karan are left with. 
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= N <= 1000
 				 * 1 <= M <= 1000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * First Line is N the initial number of apples Rahul has.
 				 * Second Line is M the initial number of apples Karan has.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print the total number of Apples Rahul & Karan has separated by a space.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 50
 				 * 30
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 145 35
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * N = 50, M = 30
 				 * 
 				 * Rahul gave 5 apples to Karan,
				 * Count of apples (Rahul) = 45 & Count of apples (Karan) = 35
 				 * 
 				 * Rahul Plucked 2N apples from tree,
 				 * Count of apples (Rahul) = 45 + 100 & Count of apples (Karan) = 35
				 */
				System.out.println("Enter the number of apple that Rahul have at the start.");
				int R_Apple = scanner.nextInt();
				System.out.println("Enter the number of apple that Karan have at the start.");
		        int M_apple = scanner.nextInt();
		        int n=R_Apple+R_Apple+(R_Apple-5);
		        int m=M_apple+5;

		        System.out.println("Rahul have "+n+" apples and Karan have "+m+"  apples.");
			}
				break;
			case 8: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * You are given a variable X, modify it using the following steps.
				 * Make X five times greater than the original value.
				 * Increment the value of X by 10.
				 * Divide the value of X by 2.
				 * 
				 * Note : Do modification in X step by step without using any extra variable. The value of X must be modified at the end of all steps. Do not use any extra variable other than X.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= X <= 1000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * The value of variable X.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print the modified value of variable X.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 10
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 30
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * X = 10
				 * Value of X after making it 5 times greater, X = 50
				 * Value of X after incrementing it by 10, X = 60
				 * Value of X after dividing it by 2, X = 30
				 */
			 System.out.println("Please give the value of X."); 
				int X=scanner.nextInt();
			       int X5=X*5;
			       int X10=X5+10;
			       int X_2=X10/2;
			       System.out.println("after calculation the value is = "+X_2);
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
