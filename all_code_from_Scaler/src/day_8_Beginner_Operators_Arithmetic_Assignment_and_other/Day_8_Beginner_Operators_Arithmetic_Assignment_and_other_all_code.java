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
				String N1 = scanner.nextLine();
				int N2 = scanner.nextInt();

				System.out.print(N2);
				System.out.println(" " + N1);
			}
				break;
			case 7: {
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
