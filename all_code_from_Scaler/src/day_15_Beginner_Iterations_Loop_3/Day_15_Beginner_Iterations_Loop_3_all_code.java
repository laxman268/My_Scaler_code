package day_15_Beginner_Iterations_Loop_3;

import java.util.Scanner;

public class Day_15_Beginner_Iterations_Loop_3_all_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int once_again = 0;
		do {

			System.out.println("");
			System.out.println("Which code would you like to execute?\n\n");
			// Question
			System.out.println("1. Take an integer N as input and print its factors.\n"
					+ "   the factor of a number is the number that divides it perfectly leaving no remainder.\n" + "\n"
					+ "   Example: 1, 2, 3, and 6 are factors of 6.");
			System.out.println("2. Take an integer A as input, you have to tell whether it is a prime number or not.\n"
					+ "\n"
					+ "   A prime number is a natural number greater than 1 which is divisible only by 1 and itself.");
			System.out.println(
					"3. Implement a program that takes two positive integers A and B in the input and prints their LCM.\n"
							+ "\n"
							+ "Definition of LCM : The Least Common Multiple or LCM of two numbers say A and B, is denoted as LCM (A,B). And the LCM is the smallest or least positive integer that is divisible by both A and B.");
			System.out.println("4. Write a program to input two integers A & B from user and print their HCF.\n" + "\n"
					+ "   Definition Of HCF: The HCF(Highest Common Factor) or the GCD(greatest common divisor) of two positive integers happens to be the largest positive integer that divides the numbers without leaving a remainder.");
			System.out.println("5. Given A, B, X and Y, Print all the numbers from A to B except X and Y.");
			System.out.println("6. Take an integer N as input and print the count of its factors.\n"
					+ "   The factor of a number is the number that divides it perfectly leaving no remainder.\n" + "\n"
					+ "   Example: 1, 2, 3, and 6 are factors of 6");
			System.out.println("7. Given the Number of Test Cases as T,\n"
					+ " For each test case, take an integer N as input, you have to tell whether it is a perfect number or not.\n"
					+ "\n"
					+ " A perfect number is a positive integer that is equal to the sum of its proper positive divisors (excluding the number itself). \n"
					+ " A positive proper divisor divides a number without leaving any remainder.");
			System.out.println(
					"8. You are given an integer N you need to print all the Prime Numbers between 1 and N.\n" + "\n"
							+ "   Prime numbers are numbers that have only 2 factors: 1 and themselves. For example, the first 5 prime numbers are 2, 3, 5, 7, and 11.");
			System.out.println("9. Given two numbers N and X, Print largest multiple of X from 1 to N.\n" + "\n"
					+ "   Multiple :\n" + "   if A % B == 0, then\n" + "   A is multiple of B.");
			System.out.println(
					"10. You are given an integer N you need to print all the Armstrong Numbers between 1 to N. (N inclusive).\n"
							+ "\n"
							+ "   If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.\n"
							+ "\n" + "   For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).\n" + "\n"
							+ "   Note: All the test cases in this problem are limited to 3 digit numbers.");
			System.out.println(
					"11. You have a number N, you have to write a code to find odd index digit sum and even index digit sum from given number.\n"
							+ "   Note : Index is starting from 1 till count of digits in a number, and we consider this from right to left;");
			System.out.println(
					"12. You have a number N, you have to write a code to find odd index digit sum and even index digit sum from given number.\n"
							+ "Note : Index is starting from 1 till count of digits in a number, and we consider this from right to left;");
			System.out.println(
					"13. Given a number N, each time N gets divided by 2. How many times do we need to divide N by 2 in order to get 1 as the final result ?\n"
							+ "\n" + "   Note : Try to solve this question using a while loop for learning purposes.");

			// Question End
			System.out.print("\nWaiting for you input........:");
			int code_number = scanner.nextInt();
			switch (code_number) {
			case 1: {
				System.out.println("Please Enter the number.");
				int number = scanner.nextInt();
				for (int i = 1; i <= number; i++) {
					if (number % i == 0) {
						System.out.print(i + " ");
					}
				}

			}
				break;
			case 2: {
				System.out.println("Please Enter the number.");
				int number = scanner.nextInt();
				int count = 0;
				for (int i = 1; i <= number; i++) {
					if (number % i == 0) {
						count++;
					}

				}
				if (count == 2) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
				break;
			case 3: {
				System.out.println("Please Enter the first number.");
				int number_1 = scanner.nextInt();
				System.out.println("Please Enter the second number.");
				int number_2 = scanner.nextInt();

				int max = number_1 * number_2;

				for (int i = max; i >= 1; i--) {
					if (number_1 % i == 0 && number_2 % i == 0) {

						System.out.println(max / i);
					}
				}
			}
				break;
			case 4: {
				System.out.println("Please Enter the first number.");
				int number_1 = scanner.nextInt();
				System.out.println("Please Enter the second number.");
				int number_2 = scanner.nextInt();
				int max = number_1 * number_2;

				for (int i = max; i >= 1; i--) {
					if (number_1 % i == 0 && number_2 % i == 0) {
						System.out.println(i);
					}
				}
			}
				break;
			case 5: {
				System.out.println("Please enter the start point.");
				int start = scanner.nextInt();
				System.out.println("Please enter the End point.");
				int end = scanner.nextInt();
				System.out.println("Please enter the number that you want to remove.");
				int remove_from_start = scanner.nextInt();
				System.out.println("Please enter the second number that you want to remove.");
				int end_point = scanner.nextInt();
				for (int i = start; i <= end; i++) {
					if (i == remove_from_start || i == end_point) {

					} else {
						System.out.print(i + " ");
					}
				}

			}
				break;
			case 6: {
				System.out.println("Please enter the number.");
				int number = scanner.nextInt();
				int count = 0;
				for (int i = 1; i <= number; i++) {
					if (number % i == 0) {
						count++;
					}
				}
				System.out.println(count);
			}
				break;
			case 7: {
				System.out.println("Please enter the number of input that you want to give.");
				int input_number = scanner.nextInt();
				int number;
				int sum = 0;
				for (int i = 1; i <= input_number; i++) {
					System.out.println("Please enter the number.");
					number = scanner.nextInt();
					for (int j = 1; j < number; j++) {
						if (number % j == 0) {
							sum = sum + j;
						}
					}
					if (number == sum) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
					sum = 0;
				}

			}
				break;
			case 8: {
				System.out.println("Please enter the number.");
				int number = scanner.nextInt();
				int count = 0;
				for (int i = 1; i <= number; i++) {
					for (int j = 1; j <= i; j++) {
						if (i % j == 0) {
							count++;
							if (count == 3) {
								break;
							}
						}
					}
					if (count == 2) {
						System.out.println(i);
					}
					count = 0;
				}
			}
				break;
			case 9: {
				System.out.println("Please enter the number.");
				int N = scanner.nextInt();
				System.out.println("Please enter the second number.");
				int X = scanner.nextInt();
				for (int i = N; i >= 0; i--) {
					if (i % X == 0) {
						System.out.println(i);
						break;
					}
				}
			}
				break;
			case 10: {
				System.out.println("Please enter the number.");
				int divd = scanner.nextInt();
				System.out.println("Please enter the second number.");
				int first = scanner.nextInt();
				System.out.println("Please enter the third number.");
				int secand = scanner.nextInt();
				for (int i = first; i <= secand; i++) {
					if (i % divd == 0) {
						System.out.print(i);
						break;

					}
				}
			}
				break;
			case 11: {

			}
				break;
			case 12: {
				System.out.println("Please enter the number.");
				int number = scanner.nextInt();
				int number1;
				int odd = 0;
				int even = 0;

				for (int i = 1; i <= number + 10; i++) {
					number1 = number % 10;
					number = number / 10;
					if (i % 2 == 1) {
						odd = odd + number1;
					} else {
						even = even + number1;
					}
				}

				System.out.println("Sum of Odd Index Digit : " + odd);
				System.out.println("Sum of Even Index Digit : " + even);
			}
				break;
			case 13: {
				System.out.println("Please enter the number.");
				int input_number = scanner.nextInt();
				int count = 0;
				while (input_number > 1) {
					input_number = input_number / 2;
					count++;
				}
				System.out.println(count);
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
