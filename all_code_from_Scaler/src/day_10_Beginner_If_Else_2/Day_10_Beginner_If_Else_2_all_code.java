package day_10_Beginner_If_Else_2;

import java.util.Scanner;

public class Day_10_Beginner_If_Else_2_all_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int once_again = 0; 
		do {

			System.out.println("");
			System.out.println("Which code qwould you like to execute?\n\n");
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Write a program to input three numbers(A, B & C) from user and print the maximum element among A, B & C in each line.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= A <= 1000000
				 * 
				 * 1 <= B <= 1000000
				 * 
				 * 1 <= C <= 1000000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * First line is a single integer A.
				 * Second line is a single integer B.
				 * Third line is a single integer C.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * One line containing an integer as per the question.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 5 
				 * 6 
				 * 7
				 * 
				 * 1000 
				 * 10000 
				 * 100000
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 7
				 * 
				 * 100000
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Clearly, among 5, 6 and 7, 7 is maximum.
				 * 
				 * Clearly, among 1000, 10000 and 100000, 100000 is maximum.
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Write a program to input from user three numbers(A, B & C) representing side lengths of a triangle.
       			 * 
       			 * You have to print if the traingle is "equilateral", "scalene" or "isosceles".
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= A <= 100000
       			 * 
       			 * 1 <= B <= 100000
       			 * 
       			 * 1 <= C <= 100000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * One line containing three space separated integers A, B & C.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * One string either "equilateral", "scalene" or "isosceles".
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 5 6 7
				 * 
				 * 30 30 30
				 * 
				 * ================ Example Output:- ================
				 * 
				 * scalene
				 * 
				 * equilateral
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Since all sides are different, hence it's a scalene triangle.
				 * 
				 * Since all sides are same, hence it's a equilateral triangle.
				 */

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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Given age of a person, Categorise it based on age.
				 * Category is given below :
				 * if age is in range of 0 to 12 then category is "Child",
				 * Otherwise if age is in range of 13 to 19 then category is "Teenager",
				 * Otherwise if age is in range of 20 to 40 then category is "Young",
				 * Otherwise if age is in range of 41 to 60 then category is "Middle-Aged",
				 * Otherwise if age is more than 60 than category is "Senior-Citizen"
				 * 
				 * Note : Intention of this problem is to give you intuition of if-elseif, try to solve this problem using else-if.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 0 <= age <= 150
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * Single value denoting age of a person.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * According to category of age, print statement in single line.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input 1 :
				 * 48
				 * 
				 * Input 2 :
				 * 72
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output 1 :
				 * Middle-Aged
				 * 
				 * Output 2 :
				 * Senior-Citizen
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Explanation 1 :
				 * Age is 48, category for 48 is "Middle-Aged"
				 * 
				 * Explanation 2 :
				 * Age is 72, category for 72 is "Senior-Citizen"
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Given the number N, Categorise the number according to following condition :
				 * 1. Odd-Positive
				 * 2. Odd-Negative
				 * 3. Even-Positive
				 * 4. Even-Negative
				 * 
				 * Note : Intention of problem is to teach you Nested If-Else, so try to solve this problem using nested if-else
				 * 
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * -10000 <= N <= 10000 except 0
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * Take Number in single line.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print the statement, according to number N in single line.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input 1 :
				 * 15
				 * 
				 * Input 2 :
				 * -38
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output 1 :
				 * Odd-Positive
				 * 
				 * Output 2 :
				 * Even-Negative
				 * 
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Example Explanation 1 :
				 * N is 15, which is Odd and Positive.
				 * 
				 * Example Explanation 2 :
				 * N is -38, which is Even and Negative.
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Write a program that takes in a number N as input and does the following:
				 * 
				 * if N is a multiple of 3, print Fizz
				 * if N is a multiple of 5, print Buzz
				 * if N is a multiple of both 3 and 5, print FizzBuzz
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= N <= 1000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * There is only 1 single line in the input, which is the integer N.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print Fizz / Buzz / FizzBuzz depending on the value N.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 9
				 * 
				 * 15
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Fizz
				 * 
				 * FizzBuzz
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * 
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Given marks of a student M, if his/her marks >= 50 then the student has passed the exam otherwise failed. If a student passes the exam, print PASS and also the grade of student, grading system -
				 * 
				 * Marks are between [50,80] -> B
				 * Marks are between [81,100] -> A
				 * 
				 * But if the student fails the exam, then print FAIL.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= M <= 100
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * M means marks of student
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print PASS and Grade, if the student passes the exam otherwise print FAIL.
				 *
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 60
				 * 
				 * ================ Example Output:- ================
				 * 
				 * PASS B
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * M = 60
				 * Marks are greater than 50 that means the student has passed the exam and marks are in the range [50,70] hence the Grade is B.
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Write a program to input an integer(A) from user and print the Ath month of the year.
				 * 
				 * Months list: {January, February, March, April, May, June, July, August, September, October, November, December}
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= A <= 12
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * One line containing an integer integer A.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * One line containing the Ath month of the year.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 1
				 * 
				 * 6
				 * 
				 * ================ Example Output:- ================
				 * 
				 * January
				 * 
				 * June
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Clearly, January is the 1st month.
				 * 
				 * Clearly, June is the 6th month.
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Write a program to input from user an integer(n) representing the rating of a person on a platform.
				 * 
				 * You have to print the category of that person.
				 * 
				 * If the rating is greater than or equal to 2100 then that person is "grand master".
				 * If the rating is greater than or equal to 1900 then that person is "candidate master".
				 * If the rating is greater than or equal to 1600 then that person is "expert".
				 * If the rating is greater than or equal to 1400 then that person is "pupil".
				 * If the rating is smaller than 1400 then that person is "newbie".
				 * NOTE: Print all the chars of the category of the person in lowercase if rating is odd otherwise print in UPPERCASE
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1000 <= n <= 2500
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * One line containing an integern.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * A string representing the category of the person.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 1659
				 * 
				 * 2100
				 * 
				 * ================ Example Output:- ================
				 * 
				 * expert
				 * 
				 * GRAND MASTER
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Clearly, 1659 is odd and is in the range of expert.
				 * 
				 * Clearly, 2100 is even and is in the range of grand master.
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Write a program that asks the user to input a number N. If N is between 10 and 20, your program should ask the user to enter another number M and then:-
				 * Print the sum of the two numbers.
				 * If the sum is greater than equal to 100, your program should also print "That is a large sum!" on a new line.
				 * If N is not between 10 and 20, your program should print -1.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= N <= 100
				 * 1 <= M <= 100
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * The first line in the input is an integer N.
				 * If N is between 10 and 20 (both included), then the second line is there in the input containing another integer M.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * If N is not between 10 and 20, then output -1.
				 * If N is between 10 and 20, the first line of the output contains N + M.
				 * If N + M is greater than or equal to 100, the second line of the output contains That is a large sum!
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 5
				 * 
				 * 10
				 * 20
				 * 
				 * 15
				 * 20
				 * 
				 * ================ Example Output:- ================
				 * 
				 * -1
				 * 
				 * 30
				 * 
				 * 105
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Since the number is not between 10 and 20, -1 is printed.
				 *
				 * Since the first input N is 10, which is between [10,20] another number M is accepted. 
				 * The sum of N and M is 30. Just 30 is printed because this sum is not greater than 100.
				 * 
				 * Since the first input N is 15, which is between [10,20] another number M is accepted. 
				 * The sum of N and M is 105. Since this sum is greater than 100, the sum and the line "That is a large sum!" both are printed.
				 * 
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * You are given an integer A.
				 * 
				 * You have to tell how many days are there in the month denoted by A in a non-leap year.
				 * 
				 * Months are denoted as follows:
				 * 
				 * January : 1
				 * February : 2
				 * March : 3
				 * April : 4
				 * May : 5
				 * June : 6
				 * July : 7
				 * August : 8
				 * September : 9
				 * October : 10
				 * November : 11
				 * December : 12
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= A <= 12
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * The input contains a single integer A.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print a single integer denoting the number of days on a single line.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 1
				 * 
				 * 11
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 31
				 * 
				 * 30
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Number of days in January(1) in a non-leap year = 31.
				 * 
				 * Number of days in November(11) in a non-leap year = 30.
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Write a program to calculate the percentage (according to marks of a student) and grade (according to the percentage of a student). Five numbers(A, B, C, D & E) represent the marks of a student in 5 subjects which are out of 100. Print the percentage and the grade of the student.
				 * 
				 * If percentage >= 90% : Grade A
				 * If percentage >= 80% but <90 : Grade B
				 * If percentage >= 70% but <80: Grade C
				 * If percentage >= 60% but <70: Grade D
				 * If percentage >= 40% but <60: Grade E
				 * If percentage < 40%: Grade F
				 * 
				 * 
				 * NOTE: You have to take the lowest integer of the percentage. E.g. 90.8% will be treated as 90%.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * There will be five lines of inputs as following:
				 * The five lines contain the 5 subject marks of the student in numerical format.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * The first line indicates the percentage in integer format.
				 * The next line displays the grade in string format.
				 * 
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 50
				 * 60
				 * 70
				 * 80
				 * 90
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 70
				 * C
				 * 
				 * 				 
				 * ===================== Example Explanation:- =====================
				 * 
				 * 
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Mr. T got the Electricity bill of his house. He felt that the bill amount was too much. He come to you to understand the relation between amount and number of units with Electricity bill.
				 * 
				 * 
				 * Instructions are give on Electricity biil that :
				 * 1. For first 50 units Rs. 0.50/unit.
				 * 2. For next 100 units Rs. 0.75/unit.
				 * 3. For next 100 units Rs. 1.20/unit.
				 * 4. For above 250 units Rs. 1.50/unit.
				 * 5. An additional surcharge of 20% is added to the bill.
				 * 
				 * NOTE: As the electricity bill can have any real value (floating point), you have to tell the Integral value of the bill. For eg. Integral value of 2.91 is 2.
				 * 
				 * To avoid manual calculation again and again, You have to write a code which take number of Unit (suppose N) from user and print the amount.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 0 < N <= 100000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * Take an integer N from user
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print the amount for that much unit
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * N = 150
				 * 
				 * N = 4
				 * 
				 * N = 300
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 120
				 * 
				 * 2
				 * 
				 * 354
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * 
				 * For first 50 units, the bill is (Rs 0.5/unit) * (50 units) = Rs 25
				 * For next 100 units, the bill is (Rs 0.75/unit) * (100 units) = Rs 75
				 * 
				 * Bill amount without additional surcharge (25 + 75) = Rs 100
				 * Total Bill amount with additional surcharge = Rs (100 + 0.20 * 100) = Rs 120
				 * 
				 * 
				 * Bill without additional surcharge (Rs 0.5/unit) * (4 units) = Rs 2
				 * Total Bill amount with additional surcharge = Rs (2 + 0.20 * 2) = Rs 2.4
				 * Integral value of Bill amount = Rs 2
				 * 
				 * 
				 * For first 50 units, the bill is (Rs 0.5/unit) * (50 units) = Rs 25
				 * For next 100 units, the bill is (Rs 0.75/unit) * (100 units) = Rs 75
				 * For next 100 units, the bill is (Rs 1.20/unit) * (100 units) = Rs 120
				 * For the remaining 50 units, the bill is (Rs. 1.50/unit) * (50 units) = Rs 75
				 * 
				 * Bill amount without additional surcharge (25 + 75 + 120 + 75) = Rs 295
				 * Total Bill amount with additional surcharge = Rs (295 + 0.20 * 295) = Rs 354
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * In this exercise, you need to implement some rules from Pac-Man, the classic 1980s-era arcade-game.
				 * 
				 * You have to answer whether the Pac-Man loses or not.
				 * 
				 * Your are given the following integer inputs (0 / 1) one in each line:
				 * 
				 * 1. Does the Pac-Man have a power pellect active?
				 * 
				 * 2. Is the Pac-Man touching a ghost?
				 * 
				 * The Pac-Man loses if it is touching a ghost and does not have a power pellet active.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * There are 2 lines in the input.
				 * The first line indicates if the Pac-Man has a power pellet active (1 for yes, 0 for no)
				 * The second line indicates if the Pac-Man is touching a ghost (1 for yes, 0 for no)
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print 1 if the Pac-Man loses else 0.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 0
				 * 1
				 * 
				 * 0
				 * 0
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 1
				 * 
				 * 0
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * The power pellet is not active as it is 0 and the Pac-Man touches the ghost as well. So Pac-Man loses and hence the answer is 1.
				 * 
				 * The power pellet is not active as it is 0 and the Pac-Man do not touch the ghost as well. So Pac-Man wins and hence the answer is 0.
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * A programmer for a music company is developing a program to determine the highest level of certification for an album.
				 * The program needs to follow this table of thresholds for each certification level:
				 * 
				 * 
				 * Minimum albums sold Certification
				 * 500000 (5*105) gold
				 * 1000000 (106) platinum
				 * 10000000 (107) diamond
				 * 
				 * 
				 * Given the albums sold(N) as input, print the certification for the album.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= N <= 109
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * There is only 1 single line in the input, which is the integer denoting the no. of albums sold.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Output the certification either diamond, platinum or gold.
				 * If no certification, print None.
				 * 
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 50
				 * 
				 * 500000
				 * 
				 * ================ Example Output:- ================
				 * 
				 * None
				 * 
				 * gold
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Explanation 1:
				 * The albums sold (50) is less than all the three condition. So, There is no Certifications, print "None".
				 * Explanation 2:
				 * THe albums sold is greater than equal to (5*105) and less than the remaining thresholds.
				 * So, gold is the highest level of certification. print "gold".
				 * 
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * You are given a Bank account having N amount and you are asked to perform ADD(credit) or SUBTRACT(debit) operation of an amount X.
				 * 
				 * After the operation print the amount left in the Bank account. If the debit amount is greater than current balance print "Insufficient Funds"(without quotes) and the operation is skipped.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= N, X <= 105
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * First line contains a single integer N denoting the balance in bank account.
				 * 
				 * Next line contains two space separated integers Type and Amount(X).
				 * 
				 * If Type == 1, Perform ADD operation.
				 * If Type == 2, Perform SUBTRACT operation.
				 * 				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print Amount in the bank balance after the operation.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Example Input 1 :
				 * 1000
				 * 1 500
				 * 
				 * Example Input 2 :
				 * 1000
				 * 2 200
				 * 
				 * Example Input 3 :
				 * 1000
				 * 2 1500
				 * 
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Example Output 1 :
				 * 1500
				 * 
				 * Example Output 2 :
				 * 800
				 * 
				 * Example Output 3 :
				 * Insufficient Funds
				 * 
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Example 1 :
				 * Initially bank balance is 1000. 
				 * ADD 500, bank balance becomes 1500, print it.
				 * 
				 * Example 2 :
				 * Initially bank balance is 1000. 
				 * SUBTRACT 200, bank balance becomes 800, print it.
				 * 
				 * Example 3 :
				 * Initially bank balance is 1000. 
				 * SUBTRACT 1500, can't subtract since balance is only 1000, print "Insufficient Finds".
				 * 
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Given an integer A representing an year, Return 1 if it is a leap year else return 0.
				 * 
				 * A year is leap year if the following conditions are satisfied:
				 * Year is multiple of 400.
				 * Else the year is multiple of 4 and not multiple of 100.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= A <= 109
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * First and only argument is an integer A
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Return 1 if it is a leap year else return 0
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * A = 2020
				 * 
				 * A = 1999
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 1
				 * 
				 * 0
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * 
				 * 
				 *  2020 is a leap year as it is a multiple of 4 and not a multiple of 100.
				 *  
				 *  1999 is not a leap year.
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Mr. ST is playing a game. There is a buket and it have 3 slips.
				 * Target is that you have to check all the slips and show him the slip with max number.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * -1000000 <= N1, N2, & N3 <= 1000000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * First line : N1 Integer
				 * Second line : N2 Integer
				 * Third line : N3 Integer
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print Largest number between N1, N2 and N3
				 * i.e. if num is largest then print "num is largest number".
				 * 
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input 1 :
				 * 190
				 * 176
				 * 201
				 * 
				 * Input 2 :
				 * -43
				 * -23
				 * 1
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output 1 :
				 * 201 is largest number
				 * 
				 * Output 2 :
				 * 1 is largest number
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Explanation 1 :
				 * 201 is maximum among 190, 176 and 201
				 * 
				 * Explanation 2 :
				 * 1 is maximum among -43, -23 and 1
				 */
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
