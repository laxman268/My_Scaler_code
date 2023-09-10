package day_10_Beginner_If_Else_2;

import java.util.Scanner;

public class Day_10_Beginner_If_Else_2_all_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int once_again = 0;
		do {

			System.out.println("");
			System.out.println("Which code would you like to execute?\n\n");
			// Question
			System.out.println(
					"1. Write a program to input three numbers(A, B & C) from user and print the maximum element among A, B & C in each line.\n\n");
			System.out.println(
					"2. Write a program to input from user three numbers(A, B & C) representing side lengths of a triangle.\n"
							+ "\n"
							+ "   You have to print if the traingle is \"equilateral\", \"scalene\" or \"isosceles\".\n\n");
			System.out.println("3. Given age of a person, Categorise it based on age.\n"
					+ "   Category is given below :\n"
					+ "   if age is in range of 0 to 12 then category is \"Child\",\n"
					+ "   Otherwise if age is in range of 13 to 19 then category is \"Teenager\",\n"
					+ "   Otherwise if age is in range of 20 to 40 then category is \"Young\",\n"
					+ "   Otherwise if age is in range of 41 to 60 then category is \"Middle-Aged\",\n"
					+ "   Otherwise if age is more than 60 than category is \"Senior-Citizen\"\n" + "\n"
					+ "   Note : Intention of this problem is to give you intuition of if-elseif, try to solve this problem using else-if.\n\n");
			System.out.println("4. Given the number N, Categorise the number according to following condition :\n"
					+ "   1. Odd-Positive\n" + "   2. Odd-Negative\n" + "   3. Even-Positive\n"
					+ "   4. Even-Negative\n" + "\n"
					+ "   Note : Intention of problem is to teach you Nested If-Else, so try to solve this problem using nested if-else\n\n");
			System.out.println("5. Write a program that takes in a number N as input and does the following:\n" + "\n"
					+ "   if N is a multiple of 3, print Fizz\n" + "   if N is a multiple of 5, print Buzz\n"
					+ "   if N is a multiple of both 3 and 5, print FizzBuzz\n\n");
			System.out.println(
					"6. Given marks of a student M, if his/her marks >= 50 then the student has passed the exam otherwise failed. If a student passes the exam, print PASS and also the grade of student, grading system -\n"
							+ "\n" + "   Marks are between [50,80] -> B\n" + "   Marks are between [81,100] -> A\n"
							+ "\n" + "   But if the student fails the exam, then print FAIL.\n\n");
			System.out.println(
					"7. Write a program to input an integer(A) from user and print the Ath month of the year.\n" + "\n"
							+ "   Months list: {January, February, March, April, May, June, July, August, September, October, November, December}");
			System.out.println(
					"8. Write a program to input from user an integer(n) representing the rating of a person on a platform.\n"
							+ "\n" + "   You have to print the category of that person.\n" + "\n"
							+ "   If the rating is greater than or equal to 2100 then that person is \"grand master\".\n"
							+ "   If the rating is greater than or equal to 1900 then that person is \"candidate master\".\n"
							+ "   If the rating is greater than or equal to 1600 then that person is \"expert\".\n"
							+ "   If the rating is greater than or equal to 1400 then that person is \"pupil\".\n"
							+ "   If the rating is smaller than 1400 then that person is \"newbie\".\n"
							+ "   NOTE: Print all the chars of the category of the person in lowercase if rating is odd otherwise print in UPPERCASE");
			System.out.println(
					"9. Write a program that asks the user to input a number N. If N is between 10 and 20, your program should ask the user to enter another number M and then:-\n"
							+ "   Print the sum of the two numbers.\n"
							+ "   If the sum is greater than equal to 100, your program should also print \"That is a large sum!\" on a new line.\n"
							+ "   If N is not between 10 and 20, your program should print -1.");
			System.out.println("10. You are given an integer A.\n" + "\n"
					+ "   You have to tell how many days are there in the month denoted by A in a non-leap year.\n"
					+ "\n" + "   Months are denoted as follows:\n" + "\n" + "   January : 1\n" + "   February : 2\n"
					+ "   March : 3\n" + "   April : 4\n" + "   May : 5\n" + "   June : 6\n" + "   July : 7\n"
					+ "   August : 8\n" + "   September : 9\n" + "   October : 10\n" + "   November : 11\n"
					+ "   December : 12");
			System.out.println(
					"11. Write a program to calculate the percentage (according to marks of a student) and grade (according to the percentage of a student). Five numbers(A, B, C, D & E) represent the marks of a student in 5 subjects which are out of 100. Print the percentage and the grade of the student.\n"
							+ "\n" + "   If percentage >= 90% : Grade A\n"
							+ "   If percentage >= 80% but <90 : Grade B\n"
							+ "   If percentage >= 70% but <80: Grade C\n"
							+ "   If percentage >= 60% but <70: Grade D\n"
							+ "   If percentage >= 40% but <60: Grade E\n" + "   If percentage < 40%: Grade F");
			System.out.println(
					"12. Mr. T got the Electricity bill of his house. He felt that the bill amount was too much. He come to you to understand the relation between amount and number of units with Electricity bill.\n"
							+ "\n" + "\n" + "   Instructions are give on Electricity biil that :\n"
							+ "   1. For first 50 units Rs. 0.50/unit.\n" + "   2. For next 100 units Rs. 0.75/unit.\n"
							+ "   3. For next 100 units Rs. 1.20/unit.\n" + "   4. For above 250 units Rs. 1.50/unit.\n"
							+ "   5. An additional surcharge of 20% is added to the bill.\n" + "\n"
							+ "   NOTE: As the electricity bill can have any real value (floating point), you have to tell the Integral value of the bill. For eg. Integral value of 2.91 is 2.\n"
							+ "\n"
							+ "   To avoid manual calculation again and again, You have to write a code which take number of Unit (suppose N) from user and print the amount.");
			System.out.println(
					"13. In this exercise, you need to implement some rules from Pac-Man, the classic 1980s-era arcade-game.\n"
							+ "\n" + "   You have to answer whether the Pac-Man loses or not.\n" + "\n"
							+ "   Your are given the following integer inputs (0 / 1) one in each line:\n" + "\n"
							+ "   1. Does the Pac-Man have a power pellect active?\n" + "\n"
							+ "   2. Is the Pac-Man touching a ghost?\n" + "\n"
							+ "   The Pac-Man loses if it is touching a ghost and does not have a power pellet active.");
			System.out.println("14. A programmer for a music company is developing a program to determine the highest level of certification for an album.\n"
					+ "   The program needs to follow this table of thresholds for each certification level:\n"
					+ "\n"
					+ "\n"
					+ "   Minimum albums sold Certification\n"
					+ "   500000 (5*105) gold\n"
					+ "   1000000 (106) platinum\n"
					+ "   10000000 (107) diamond\n"
					+ "\n"
					+ "\n"
					+ "   Given the albums sold(N) as input, print the certification for the album.\n\n");
			System.out.println("15. You are given a Bank account having N amount and you are asked to perform ADD(credit) or SUBTRACT(debit) operation of an amount X.\n"
					+ "\n"
					+ "   After the operation print the amount left in the Bank account. If the debit amount is greater than current balance print \"Insufficient Funds\"(without quotes) and the operation is skipped.");
			System.out.println("16. Given an integer A representing an year, Return 1 if it is a leap year else return 0.\n"
					+ "\n"
					+ "   A year is leap year if the following conditions are satisfied:\n"
					+ "   Year is multiple of 400.\n"
					+ "   Else the year is multiple of 4 and not multiple of 100.");
			System.out.println("17. Mr. ST is playing a game. There is a buket and it have 3 slips.\n"
					+ "   Target is that you have to check all the slips and show him the slip with max number.");

			// Question END
			System.out.print("\nWaiting for you input........:");
			int code_number = scanner.nextInt();
			switch (code_number) {
			case 1: {
				System.out.println("To identify the maximum number please enter the Three value.");
				System.out.println("Please enter the first number.");
				long number1 = scanner.nextLong();
				System.out.println("Please enter the Second number.");
				long number2 = scanner.nextLong();
				System.out.println("Please enter the third number.");
				long number3 = scanner.nextLong();
				if (number1 > number2 && number1 > number3) {
					System.out.println("Number " + number1 + " is the biggest number.");
				} else if (number2 > number1 && number2 > number3) {
					System.out.println("Number " + number2 + " is the biggest number.");
				} else {
					System.out.println("Number " + number3 + " is the biggest number.");
				}

			}
				break;
			case 2: {

				System.out.println("Please enter the sides of the traingle.");
				System.out.println("Please enter the first side.");
				int number1 = scanner.nextInt();
				System.out.println("Please enter the Second side.");
				int number2 = scanner.nextInt();
				System.out.println("Please enter the third side.");
				int number3 = scanner.nextInt();
				if (number1 == number2 && number1 == number3) {
					System.out.println("equilateral");
				} else if (number1 == number2 || number1 == number3 || number2 == number3) {
					System.out.println("isosceles");
				} else {
					System.out.println("scalene");

				}
			}
				break;
			case 3: {
				System.out.println("Please enter the age of the user.");
				int age = scanner.nextInt();
				if (age <= 12) {
					System.out.println("Child");
				} else if (age > 12 && age < 19) {
					System.out.println("Teenager");
				} else if (age > 19 && age <= 40) {
					System.out.println("Young");
				} else if (age > 40 && age <= 60) {
					System.out.println("Middle-Aged");
				} else {
					System.out.println("Senior-Citizen");
				}

			}
				break;
			case 4: {
				System.out.println("Please enter the number.");
				int number = scanner.nextInt();
				if (number % 2 == 0 && number > 0) {
					System.out.println("Even-Positive");
				} else if (number % 2 == 0 && number < 0) {
					System.out.println("Even-Negative");
				} else if (number % 2 != 0 && number < 0) {
					System.out.println("Odd-Negative");
				} else {
					System.out.println("Odd-Positive");
				}
			}
				break;
			case 5: {
				System.out.println("Please enter the number.");
				int number = scanner.nextInt();
				if (number % 3 == 0) {
					System.out.print("Fizz");
				}
				if (number % 5 == 0) {
					System.out.print("Buzz");
				}

			}
				break;
			case 6: {
				System.out.println("Please enter the marks of the student.");
				int number = scanner.nextInt();
				if (number < 50) {
					System.out.println("FAIL");
				}
				if (number >= 50 && number <= 80) {
					System.out.println("PASS B");
				}
				if (number >= 81 && number <= 100) {
					System.out.println("PASS A");
				}
			}
				break;
			case 7: {
				System.out.println("Please enter the month in digits.");
				int month = scanner.nextInt();
				if (month == 1) {
					System.out.println("January");
				} else if (month == 2) {
					System.out.println("February");
				} else if (month == 3) {
					System.out.println("March");
				} else if (month == 4) {
					System.out.println("April");
				} else if (month == 5) {
					System.out.println("May");
				} else if (month == 6) {
					System.out.println("June");
				} else if (month == 7) {
					System.out.println("July");
				} else if (month == 8) {
					System.out.println("August");
				} else if (month == 9) {
					System.out.println("September");
				} else if (month == 10) {
					System.out.println("October");
				} else if (month == 11) {
					System.out.println("November");
				} else if (month == 12) {
					System.out.println("December");
				}
			}
				break;
			case 8: {
				System.out.println("Please enter the amount.");
				int Number = scanner.nextInt();
				if (Number <= 1400 && Number % 2 == 1) {
					System.out.println("newbie");
				} else if (Number <= 1400 && Number % 2 == 0) {
					System.out.println("NEWBIE");
				} else if (Number > 1400 && Number <= 1599 && Number % 2 == 0) {
					System.out.println("PUPIL");
				} else if (Number > 1400 && Number <= 1599 && Number % 2 == 1) {
					System.out.println("pupil");
				} else if (Number > 1600 && Number <= 1899 && Number % 2 == 0) {
					System.out.println("EXPERT");
				} else if (Number > 1600 && Number <= 1899 && Number % 2 == 1) {
					System.out.println("expert");
				} else if (Number > 1900 && Number <= 2099 && Number % 2 == 0) {
					System.out.println("CANDIDATE MASTER");
				} else if (Number > 1900 && Number <= 2099 && Number % 2 == 1) {
					System.out.println("candidate master");
				} else if (Number % 2 == 0) {
					System.out.println("GRAND MASTER");
				} else {
					System.out.println("grand master");
				}

			}
				break;
			case 9: {
				System.out.println("Please enter the number.");
				int number1 = scanner.nextInt();
				if (number1 >= 10 && number1 <= 20) {
					System.out.println("Please enter the number again.");
					int number2 = scanner.nextInt();
					int sum = number1 + number2;
					if (number1 >= 10 && number1 <= 20 && sum <= 100) {
						System.out.println(sum);
					} else {
						System.out.println(sum + "\nThat is a large sum!");
					}

				} else {
					System.out.println(-1);
				}
			}
				break;
			case 10: {
				System.out.println("Please enter the month in digits.");
				int month = scanner.nextInt();
				if (month == 1) {
					System.out.println("31");
				} else if (month == 2) {
					System.out.println("28");
				} else if (month == 3) {
					System.out.println("31");
				} else if (month == 4) {
					System.out.println("30");
				} else if (month == 5) {
					System.out.println("31");
				} else if (month == 6) {
					System.out.println("30");
				} else if (month == 7) {
					System.out.println("31");
				} else if (month == 8) {
					System.out.println("31");
				} else if (month == 9) {
					System.out.println("30");
				} else if (month == 10) {
					System.out.println("31");
				} else if (month == 11) {
					System.out.println("30");
				} else if (month == 12) {
					System.out.println("31");
				}
			}
				break;
			case 11: {
				System.out.println("Please enter the first number.");
				int Number1 = scanner.nextInt();
				System.out.println("Please enter the second number.");
				int Number2 = scanner.nextInt();
				System.out.println("Please enter the third number.");
				int Number3 = scanner.nextInt();
				System.out.println("Please enter the fourth number.");
				int Number4 = scanner.nextInt();
				System.out.println("Please enter the fiveth number.");
				int Number5 = scanner.nextInt();

				int Number = (Number1 + Number2 + Number3 + Number4 + Number5) / 5;
				if (Number < 40) {
					System.out.println(Number + "\nF");
				} else if (Number > 40 && Number < 59) {
					System.out.println(Number + "\nE");
				} else if (Number >= 60 && Number < 69) {
					System.out.println(Number + "\nD");
				} else if (Number >= 70 && Number < 79) {
					System.out.println(Number + "\nC");
				} else if (Number >= 80 && Number < 89) {
					System.out.println(Number + "\nB");
				} else {
					System.out.println(Number + "\nA");
				}

			}
				break;
			case 12: {
				System.out.println("Please enter the total number of UNITS.");
				double units = scanner.nextDouble();
				double amount = 0.0;

				if (units <= 50) {
					amount = units * 0.50;
				} else if (units <= 150) {
					amount = 50 * 0.50 + (units - 50) * 0.75;
				} else if (units <= 250) {
					amount = 50 * 0.50 + 100 * 0.75 + (units - 150) * 1.20;
				} else {
					amount = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (units - 250) * 1.50;
				}

				double surcharge = amount * 0.20;
				double totalAmount = amount + surcharge;

				System.out.println("The total bill is = " + (int) totalAmount);

			}
				break;
			case 13: {
				System.out.println("Did PacMan hit the power pellet.");
				int Pac_man_power_pellet = scanner.nextInt();
				System.out.println("Did PacMan touching the gost.");
				int Pac_man_touching_goust = scanner.nextInt();
				if (Pac_man_power_pellet == 0 && Pac_man_touching_goust == 1) {
					System.out.println("PacMan killed the goust.");
				} else if (Pac_man_power_pellet == 0 && Pac_man_touching_goust == 0) {
					System.out.println("PacMan died.");
				} else if (Pac_man_power_pellet == 1 && Pac_man_touching_goust == 1) {
					System.out.println("PacMan died.");
				} else {
					System.out.println("PacMan died.");

				}

			}
				break;
			case 14: {
				System.out.println("Please enter the number.");
				long number1=scanner.nextLong();
		        if (number1<500000 ){
		            System.out.println("None");
		        }else if (number1>=500000 && number1<1000000 ){
		            System.out.println("gold");
		        }else if (number1>=1000000 && number1<10000000 ){
		            System.out.println("platinum");
		        }else{
		            System.out.println("diamond");
		        }

			}
				break;
			case 15: {
				System.out.println("Please enter the amount.");
				int amount = scanner.nextInt();
				System.out.println("Please enter the task that you want to perform.");
		        int operation = scanner.nextInt();
		        System.out.println("Please enter the amount.");
		        int operationAmount = scanner.nextInt();
		        if (amount>=operationAmount){
		            if (operation==1){
		                amount= amount+operationAmount;
		                System.out.println(amount);
		            }else{
		                amount= amount-operationAmount;
		                System.out.println(amount);
		            }
		        }else{
		            System.out.println("Insufficient Funds");
		        }
		        
			}
				break;
			case 16: {
				System.out.println("Please enter the year.");
				 int year=scanner.nextInt();
			        if(year%4==0){
			            System.out.println("This year is not lepare.");
			        }else{
			            System.out.println("This year is lepare.");
			        }
			}
				break;
			case 17: {
				System.out.println("Please enter the first number.");
				int number1 = scanner.nextInt();
				System.out.println("Please enter the Second number.");
		        int number2 = scanner.nextInt();
		        System.out.println("Please enter the third number.");
		        int number3 = scanner.nextInt();
		        if (number1>number2 && number1>number3){
		            System.out.println(number1+" is largest number");
		        }else if (number2>number1 && number2>number3){
		            System.out.println(number1+" is largest number");
		        }else  {
		            System.out.println(number3+" is largest number");
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
