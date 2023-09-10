package day_14_Beginner_Iterations_Loop_2;

import java.util.Scanner;

public class day_14_Beginner_Iterations_Loop_2_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int once_again = 0;
		do {

			System.out.println("");
			System.out.println("Which code would you like to execute?\n\n");
			// Question
			System.out.println(
					"1. Write a program to print all Natural numbers from 1 to N where you have to take N as input from user\n\n");
			System.out.println(
					"2. Write a program to print all odd numbers from 1 to N where you have to take N as input from user. Here N is inclusive.\n\n");
			System.out.println("3. Given two numbers A & B, print all the numbers from A to B in a single line\n\n");
			System.out.println(
					"4. You take a number of test cases, denoted by T as input.For each test case, you should take integers N as input. Your task is to calculate and print the sum of the digits of the given number N.\n\n");
			System.out.println("5. Given a number N, print reversed of N.\n" + "\n"
					+ "   Note : Create new reverse number, instead of printing number from right to left.\n\n");
			System.out.println("6. Take T (number of test cases) as input.\n"
					+ "   For each test case, take integer N as input and Print the last digit of that number.\n\n");
			System.out.println("7. Take T (number of test cases) as input.\n"
					+ "   For each test case, take integer N as input and Print the sum of digits of that number.");
			System.out.println("8. Take T (number of test cases) as input.\n"
					+ "   For each test case, take integer N as input and Check whether that number is Palindromic / Not Palindromic.\n"
					+ "\n"
					+ "   Note : A palindrome integer is an integer X for which reverse(X) = X where reverse(X) is X with its digits reversed. For e.g., reverse(123) = 321. Note : There will be no zeros at the start of a number.");
			System.out.println(
					"9. You are given an integer A as input and you need to determine whether it is a palindrome or not.\n"
							+ "   A palindrome integer is one whose digits, when reversed, result in the same number.\n"
							+ "   For example, 121 is a palindrome because its reverse is also 121, but 123 is not a palindrome because its reverse is 321.\n"
							+ "\n" + "   Note: The given integer will not have any leading zeros.");
			System.out.println(
					"10. Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user");
			System.out.println("11. You are given two integers A and B. You have to find the value of AB.\n" + "\n"
					+ "   NOTE: The value of AB will always be less than or equal to 109.");
			System.out.println(
					"12. Take a number A as input, print its multiplication table having the first 10 multiples.");
			System.out.println(
					"13. Take an integer A as input. You have to print the sum of all odd numbers in the range [1, A].");
			System.out.println(
					"14. You are given a positive integer A. You have to print the sum of all even numbers in the range [1, A].");
			System.out.println(
					"15. You have a number N, you have to write a code to find odd digit sum and even digit sum from given number and print it.");
			System.out.println(
					"16. Write a program that asks the user to input a number T, indicating the number of test cases.\n"
							+ "   Then, for each test case, ask for input a number N and print the first and last digits of N.");
			System.out.println(
					"17. You have been provided with a bank account that has an initial balance of N amount. You are now required to perform two operations on this account, namely, ADD and SUBTRACT.\n"
							+ "\n"
							+ "   ADD operation: This operation increases the account balance by a certain amount and you are expected to print the updated balance after each ADD operation.\n"
							+ "   SUBTRACT operation: This operation decreases the account balance by a certain amount and you are again expected to print the updated balance after each SUBTRACT operation.\n"
							+ "   However, if the amount you are trying to subtract (i.e., debit) from the account balance is greater than the current balance, you should print \"Insufficient Funds\" (without quotes) instead of the updated balance. In this case, the operation should be skipped, and the account balance should remain unchanged.\n"
							+ "\n" + "   Note :\n"
							+ "   Initial Amount N and Amount that is given are larger numbers.");
			System.out.println("18. Take an input of a number A from the user. Print all perfect squares less than or equal to A.\n"
					+ "   Note - Perfect squares are integers whose square root is an integer. (For Example: 16 is perfect square as √16 = 4, or 42 = 16)");
			System.out.println("19. Take T (number of test cases) as input. For each test case, take integer N as input and Print first 10 continuous multiples of N.");
			System.out.println("20. Take T (number of test cases) as input.\n"
					+ "   For each test case, take integer N as input and Print the count of digits of that number.\n"
					+ "\n"
					+ "   Note: No of digits for number 0 is considered as 1.");

			// Question End
			System.out.print("\nWaiting for you input........:");
			int code_number = scanner.nextInt();
			switch (code_number) {
			case 1: {
				System.out.println("Please enter the number.");

				int n = scanner.nextInt();
				for (int i = 1; i <= n; i++) {
					System.out.print(i + " ");
				}

			}
				break;
			case 2: {
				System.out.println("Please enter the number.");
				int number = scanner.nextInt();
				for (int i = 1; i <= number; i++) {
					if (i % 2 == 1) {
						System.out.print(i + " ");
					}
				}

			}
				break;
			case 3: {
				System.out.println("Please enter the number from where you want to start");
				int number1 = scanner.nextInt();
				System.out.println("Please enter the number from where you want to End");
				int number2 = scanner.nextInt();
				for (int i = number1; i <= number2; i++) {
					System.out.print(i + " ");
				}
			}
				break;
			case 4: {
				System.out.println("Please enter the number of test cases you want to do.");
				int Number = scanner.nextInt();
				int sum = 0;
				int Number1 = 0;

				for (int i = 1; i <= Number; i++) {
					System.out.println("Please enter the Next number.");
					Number1 = scanner.nextInt();
					while (Number1 > 0) {
						sum = sum + (Number1 % 10);
						Number1 = (int) Number1 / 10;
					}
					System.out.println(sum);
					sum = 0;

				}
			}
				break;
			case 5: {
				System.out.println("Please enter the number.");
				int number = scanner.nextInt();
				int reverse_number = 0;
				int temp = 0;
				int value = 0;

				if (number == 0) {
					System.out.println(reverse_number);
				}
				if (number < 0) {
					value = number;
					temp = number * -1;
				}
				while (number > 0 || temp > 0) {

					if (number > 0) {
						reverse_number = reverse_number * 10 + number % 10;
						number = number / 10;
					} else {
						reverse_number = reverse_number * 10 + temp % 10;
						temp = temp / 10;
					}

				}
				if (value < 0) {
					System.out.print(reverse_number * -1);
				} else {
					System.out.print(reverse_number);
				}

			}
				break;
			case 6: {
				System.out.println("Please enter the number of test cases you want to do.");
				int number_of_input = scanner.nextInt();
				int input_integer;
				for (int i = 1; i <= number_of_input; i++) {
					System.out.println("Please enter the Next number.");
					input_integer = scanner.nextInt();
					input_integer = input_integer % 10;
					System.out.println(input_integer);

				}
			}
				break;
			case 7: {
				System.out.println("Please enter the number of test cases you want to do.");
				int total_number_of_input = scanner.nextInt();
				int number = 0;
				int sum = 0;
				for (int counter = 1; counter <= total_number_of_input; counter++) {
					System.out.println("Please enter the Next number.");
					number = scanner.nextInt();
					while (number > 0) {
						sum = sum + number % 10;
						number = number / 10;
					}
					System.out.println(sum);
					sum = 0;
				}
			}
				break;
			case 8: {
				System.out.println("Please enter the number of test cases you want to do.");
				int total_number_of_input = scanner.nextInt();
				int number = 0;
				int temp;
				int reverse = 0;
				for (int counter = 1; counter <= total_number_of_input; counter++) {
					System.out.println("Please enter the Next number.");
					number = scanner.nextInt();
					temp = number;
					while (number > 0) {
						reverse = reverse * 10 + number % 10;
						number = number / 10;
					}
					if (reverse == temp) {
						System.out.println("Palindromic");
					} else {
						System.out.println("Not Palindromic");
					}
					reverse = 0;
				}
			}
				break;
			case 9: {
				System.out.println("Please enter the number.");
				int number = scanner.nextInt();
				int temp = number;
				int reverse = 0;
				while (number > 0) {
					reverse = reverse * 10 + number % 10;
					number = number / 10;
				}
				if (reverse == temp) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
				reverse = 0;
			}
				break;
			case 10: {
				System.out.println("Please enter the number.");
				int number = scanner.nextInt();
				int sum = 0;
				for (int count = 1; count <= number; count++) {
					sum = sum + count;
				}
				System.out.println(sum);

			}
				break;
			case 11: {
				System.out.println("Please enter the number.");
				int number = scanner.nextInt();
				System.out.println("Please enter the power.");
				int power = scanner.nextInt();
				int output_number = 1;
				for (int i = 1; i <= power; i++) {

					output_number = output_number * number;
				}
				System.out.print(output_number);
			}
				break;
			case 12: {
				System.out.println("Please enter the number for which you want to see the table.");
				int table = scanner.nextInt();
				for (int i = 1; i <= 10; i++) {
					System.out.println(table + " * " + i + " = " + (table * i));
				}
			}
				break;
			case 13: {
				System.out.println("Please enter the number.");
				int number = scanner.nextInt();
				int sum = 0;
				for (int i = 1; i <= number; i++) {
					if (i % 2 == 1) {
						sum = sum + i;
					}
				}
				System.out.println(sum);
			}
				break;
			case 14: {
				System.out.println("Please enter the number.");
				int number = scanner.nextInt();
				int sum = 0;
				for (int i = 1; i <= number; i++) {
					if (i % 2 == 0) {
						sum = sum + i;
					}
				}
				System.out.println(sum);
			}
				break;
			case 15: {
				System.out.println("Please enter the number.");
				int number = scanner.nextInt();
				int number1;
				int odd = 0;
				int even = 0;

				while (number > 0) {
					number1 = number % 10;
					number = number / 10;
					if (number1 % 2 == 1) {
						odd = odd + number1;
					} else {
						even = even + number1;
					}
				}
				System.out.println("Sum of Odd Digit : " + odd);
				System.out.println("Sum of Even Digit : " + even);
			}
				break;
			case 16: {
				System.out.println("Please enter the number of test cases you want to do.");
				int input_total_number = scanner.nextInt();
				int last_number = 0;
				int frunt_number = 0;
				int input_number;
				for (int i = 1; i <= input_total_number; i++) {
					System.out.println("Please enter the Next number.");
					input_number = scanner.nextInt();
					last_number = input_number % 10;
					if (input_number < 9) {
						frunt_number = input_number;
					} else {
						while (input_number > 9) {
							input_number = input_number / 10;
							frunt_number = input_number;
						}

					}
					System.out.println(frunt_number + " " + last_number);
					last_number = 0;
					frunt_number = 0;

				}
			}
				break;
			case 17: {
				System.out.println("Please enter your current balane.");
				long current_amount = scanner.nextLong();
				System.out.println("Please enter the number of test cases you want to do.");
				long number_of_inputs = scanner.nextLong();
				long amount, operation;
				for (long i = 1; i <= number_of_inputs; i++) {
					System.out.println("Please enter what opertation you want to perform.");

					operation = scanner.nextLong();
					System.out.println("Please enter the amount.");
					amount = scanner.nextLong();
					if (operation == 1) {
						current_amount = current_amount + amount;
						System.out.println(current_amount);
					} else if (operation == 2 && current_amount < amount) {
						System.out.println("Insufficient Funds");
					} else {
						current_amount = current_amount - amount;
						System.out.println(current_amount);
					}

				}
			}
				break;
			case 18: {
				System.out.println("Please enter the number");
				int input_number = scanner.nextInt();
		        int i=1;
		        while(i*i<=input_number){
		            System.out.print(i*i+" ");
		            i++;
		        }
			}
				break;
			case 19: {
				System.out.println("Please enter the number of test cases you want to do.");
				int total_number_intiger = scanner.nextInt();
		        int number;
		        for(int i=1;i<=total_number_intiger;i++){
		        	System.out.println("Please enter the number");
		            number=scanner.nextInt();
		            for (int j=1;j<=10;j++){
		                System.out.print(number*j+" ");
		            }
		            System.out.println("");
		        }
			}
				break;
			case 20: {
				System.out.println("Please enter the number of test cases you want to do.");
				 int total_number_of_input= scanner.nextInt();
			        int counter=0;
			        int number;
			        for(int i =1;i <= total_number_of_input ;i++){
			        	System.out.println("Please enter the number");
			             number= scanner.nextInt();
			             if(number==0){
			                 counter++;
			             }
			             while(number>0){
			                 number=number/10;
			                 counter++;
			             }
			             
			             System.out.println(counter);
			             counter=0;
			        }
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
//* * * * * * * * * * *