package day_9_Beginner_If_Else_1;

import java.util.Scanner;

public class Day_9_Beginner_If_Else_1_all_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int once_again = 0;
		do {

			System.out.println("");
			System.out.println("Which code would you like to execute?\n\n");
			// Question
			System.out.println(
					"1. Write a program to input an integer from user and print 1 if it is odd otherwise print 0.\n\n");
			System.out.println(
					"2. You are given 3 integer angles(in degrees) A, B and C of a triangle. You have to tell whether the triangle is valid or not.\n"
							+ "\n" + "   A triangle is valid if sum of its angles equals to 180.\n\n");
			System.out.println(
					"3. Write a program to input a number(A) from user and print 1 if it is positive, -1 if it is negative, 0 if it's neither positive nor negative.\n\n");
			System.out.println("4. Given a Number N. If number is divisible by 5,\n" + "print \"Divisible by 5\".\n"
					+ "Otherwise print \"Not divisible by 5\".\n\n");
			System.out.println("5. Given a Number N, according to situation of N print the output.\n"
					+ "Situations of N are :\n" + "if N is greater than 18, print \"N is Greater than 18\"\n"
					+ "Otherwise if N is less than 18, print \"N is smaller than 18\"\n"
					+ "Otherwise Print \"N is equal to 18\".\n\n");
			System.out.println("6. Given temperature of person, analyse the situation of person and give him advice.\n"
					+ "   Situations and advice related with temperature are :\n"
					+ "   1. temp is in range of [85.0 to 91.0] then advice is \"Serious Hypothermia\".\n"
					+ "   2. temp is in range of (91.0 to 95.0) then advice is \"Mild Hypothermia\".\n"
					+ "   3. temp is in range of [95.0 to 98.0] then advice is \"Normal Temperature\".\n"
					+ "   4. temp if in range of (98.0 to 100.0] then advice is \"Mild Fever\".\n"
					+ "   5. temp if in range of (100.0 to 105.0] then advice is \"High Fever\".\n\n");
			System.out.println(
					"7. Write a program to input two numbers(A & B) from user and print the maximum element among A & B in each line.\n\n");
			System.out.println(
					"8. Given two Numbers N and X. If N is divisible by X print \"Yes\" otherwise print \"No\"\n\n");
			System.out.println("9. Given runs scored by a batsman, find if he has scored a century or not.\n"
					+ "   If he has scored a century print \"Century!!!\" otherwise print \"Better luck next time!\".\n\n");
			System.out.println(
					"10. Write a program to input two numbers(A & B) from user and print the minimum element among A & B in each line.\n\n");
			System.out.println("11. You are given the Cost Price C and Selling Price S of a Product. You have to tell whether there is a Profit or Loss. Also, calculate total profit or loss.\n\n");
			System.out.println("12. Exams are near and Rahul is worried whether he will be allowed to take the exams or not. A student is not allowed to take the exams if his/her\n attendance is less than 75%. But Rahul is a little weak in math, so he wants your help to tell him whether he will be able to give exams or not.\n You are given the total number of classes held (T) and number of classes attended by Rahul (N), print YES or NO.\n\n");
			System.out.println("13. You have been given a dataset for marks of 2 subjects, scored by students of classes ClassA and ClassB. You now want to compare the performances of \nclass A and class B by finding out the average performance of the classes. Write a program to find if class A performed better. Print True is Class A\n is strictly better else return False.\n\n");
			System.out.println("14. Take an integer A as input. You have to tell whether A is divible by both 5 and 11 or not.\n\n");
			System.out.println("15. Write a program that takes the age of the user as input and tells them if they're old enough to ride a roller coaster. The minimum age to ride the roller coaster in this question is 13.\n\n");
			System.out.println("16. Check whether a given number is positive-odd, positive-even, negative-odd OR negative-even.\n"
					+ "   Write a code to figure out the Situation.\n"
					+ "   Take a number N from user and print the Situation Of Number.\n"
					+ "   if positive-odd : print -> \"Number is Positive and Odd\"\n"
					+ "   if positive-even : print -> \"Number is Positive and Even\"\n"
					+ "   if negative-odd : print -> \"Number is Negative and Odd\"\n"
					+ "   if negative-even : print -> \"Number is Negative and Even\n\n");
			System.out.println("17. A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years. Ask user for their name and year of service and print whether they should recieve bonus or not.\n\n");
			// question END
			System.out.print("\nWaiting for you input........:");
			int code_number = scanner.nextInt();
			switch (code_number) {
			case 1: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Write a program to input an integer from user and print 1 if it is odd otherwise print 0.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= N <= 1000000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * One line containing an integer N.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print either 1 or 0 as per the question.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 5
				 * 
				 * 1000
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 1
				 * 
				 * 0
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Clearly, 5 is odd.
				 * 
				 * Clearly, 1000 is even.
				 */
				System.out.println("Please enter the number.");
				double number = (scanner.nextInt()) % 2;
				if (number == 1) {
					System.out.println("Yes it is a Odd number. Sorry i forgot " + "1.");
				} else {
					System.out.println(
							"No it is not Odd number. You know what i have a good news for you. It is an Even number. Hahahahaha.....");
				}

			}
				break;
			case 2: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * You are given 3 integer angles(in degrees) A, B and C of a triangle. You have to tell whether the triangle is valid or not.
				 * 
				 * A triangle is valid if sum of its angles equals to 180.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= A, B, C <= 180
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * First line of the input contains an integer A.
				 * 
				 * Second line of the input contains an integer B.
				 * 
				 * Third line of the input contains an integer C.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print 1 if the triangle having given sides is valid, else print 0.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 60
 				 * 60
 				 * 60
 				 * 
 				 * 30
 				 * 40
 				 * 50
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 1
				 * 
				 * 0
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 *  Sum of angles = A + B + C = 60 + 60 + 60 = 180
 				 * Hence, the given triangle is valid.
 				 * 
 				 * Sum of angles = A + B + C = 30 + 40 + 50 = 120
 				 * As sum of angles is not equal to 180, the given triangle is not valid.
				 */

				System.out.println("So are you readddddddyyyyy. to enter the sides of the triangle.");
				System.out.println("So what is your favorite angle");
				int angle1 = scanner.nextInt();
				System.out.println("And next angle");
				int angle2 = scanner.nextInt();
				System.out.println("Waiting for the last angle.");
				int angle3 = scanner.nextInt();
				int triangleAngle = angle1 + angle2 + angle3;
				if (triangleAngle == 180) {
					System.out.println("You know what. Yes it is a triangle.");
				} else {
					System.out.println("Sorry dude it is not a triangle.");
				}
			}
				break;
			case 3: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Write a program to input a number(A) from user and print 1 if it is positive, -1 if it is negative, 0 if it's neither positive nor negative.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= A <= 1000000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * One line containing an integer A.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * One line each 0/1/-1 as per the question.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 50
				 * 
				 * -101
				 * 
				 * 0
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 1
				 * 
				 * -1
				 * 
				 * 0
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Clearly, 50 is positive.
				 * 
				 * Clearly, -101 is negative.
				 * 
				 * Clearly, 0 is neither positive nor negative.
				 */
				System.out.println("Sooooo, what is you favorite number.");
				int number = scanner.nextInt();
				if (number >= 1) {
					System.out.println(
							"Hmm I received the positive vibes for the and you also choose the positive number.");
				} else if (number == 0) {
					System.out.println(
							"Ooooo Hooo you naughty I know you like holes but you also showed that number which have hole. hahahaha......");
				} else {
					System.out.println("You need to do the meditation you have some negative vibes.");
				}
			}
				break;
			case 4: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Given a Number N. If number is divisible by 5,
				 * print "Divisible by 5".
				 * Otherwise print "Not divisible by 5".
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 0 <= N <= 100000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * In single line, take N in int variable.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print statement in single line accordingly.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input 1 :
				 * 135
				 * 
				 * Input 2 :
				 * 149
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output 1 :
				 * Divisible by 5
				 * 
				 * Output 2 :
				 * Not divisible by 5
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Explanation 1 :
				 * Input is 135, which is divisible by 5 that's why output is "Divisible by 5".
				 * 
				 * Explanation 2 :
				 * Input is 149, which is not divisible by 5 that's why output is "Not divisible by 5". Note : We have to print output without double quotes("").
				 */
				System.out.println("Enter the number that you want to Test.");
				double number = (scanner.nextInt()) % 5;
				if (number == 0) {
					System.out.println("Divisible by 5");
				} else {
					System.out.println("Not divisible by 5");
				}

			}
				break;
			case 5: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Given a Number N, according to situation of N print the output.
                 * Situations of N are :
                 * if N is greater than 18, print "N is Greater than 18"
                 * Otherwise if N is less than 18, print "N is smaller than 18"
                 * Otherwise Print "N is equal to 18".
                 * 
                 * Note : Intention of this problem is to teach you use of else-if so try to solve it using else-if.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * -10000 <= N <= 10000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * Take value of N in an int variable
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print situation of N in single line accordingly.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input 1 :
                 * 29
                 * 
                 * Input 2 :
                 * 18
                 * 
                 * Input 3 :
                 * -45
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output 1 :
                 * N is Greater than 18
                 * 
                 * Output 2 :
                 * N is equal to 18
                 * 
                 * Output 3 :
                 * N is smaller than 18
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Explanation 1 :
                 * Input N is 29, which is greater than 18 That's why output is "N is Greater than 18"
                 * 
                 * Explanation 2 :
                 * Input N is 18, which is equal to 18 That's why output is "N is equal to 18"
                 * 
                 * Explanation 3 :
                 * Input N is -45, which is less than 18 That's why output is "N is smaller than 18"
				 */
				System.out.println("Hello dude. lets get started. So now enter the number.");
				int number = scanner.nextInt();
				if (number > 18) {
					System.out.println("N is Greater than 18");
				} else if (number == 18) {
					System.out.println("N is equal to 18");
				} else {
					System.out.println("N is smaller than 18");
				}
			}
				break;
			case 6: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Given temperature of person, analyse the situation of person and give him advice.
				 * Situations and advice related with temperature are :
				 * 1. temp is in range of [85.0 to 91.0] then advice is "Serious Hypothermia".
				 * 2. temp is in range of (91.0 to 95.0) then advice is "Mild Hypothermia".
				 * 3. temp is in range of [95.0 to 98.0] then advice is "Normal Temperature".
				 * 4. temp if in range of (98.0 to 100.0] then advice is "Mild Fever".
				 * 5. temp if in range of (100.0 to 105.0] then advice is "High Fever".
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 85.0 <= temp <= 105.0
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * In single line, given temp. as an input.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * According to situation of temp, print the advice
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input 1 :
				 * 97.6
				 * 
				 * Input 2 :
				 * 90.3
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output 1 :
				 * Normal Temperature
				 * 
				 * Output 2 :
				 * Serious Hypothermia
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * xplanation 1 :
				 * Temp is 97.6, that means advice is "Normal Temperature"
				 * 
				 * Explanation 2 :
				 * Temp is 90.3, that means advice is "Serious Hypothermia"
				 */
				System.out.println("Please Enter the Temperature.");
				double number = scanner.nextDouble();
				if (number <= 91.0) {
					System.out.println("Serious Hypothermia");
				} else if (number >= 91.0 && number <= 94.9) {
					System.out.println("Mild Hypothermia");
				} else if (number >= 95.0 && number <= 97.9) {
					System.out.println("Normal Temperature");
				} else if (number >= 98.0 && number <= 100) {
					System.out.println("Mild Fever");
				} else {
					System.out.println("High Fever");
				}

			}
				break;
			case 7: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Write a program to input two numbers(A & B) from user and print the maximum element among A & B in each line.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= A <= 1000000
				 * 
				 * 1 <= B <= 1000000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * First line is a single integer A.
				 * Second line is a single integer B.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * One line containing the greater integer A or B.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 5 
				 * 6
				 * 
				 * 1000 
				 * 10000
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 6
				 * 
				 * 10000
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * 
				 * Clearly, among 5 and 6, 6 is maximum.
				 * 
				 * Clearly, among 1000 and 10000, 10000 is maximum.
				 */
				System.out.println("Please enter the first number.");
				int number = scanner.nextInt();
				System.out.println("Now enter the secand number.");
				int number1 = scanner.nextInt();
				if (number > number1) {
					System.out.println(number);
				} else {
					System.out.println(number1);
				}
			}
				break;
			case 8: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Given two Numbers N and X. If N is divisible by X print "Yes" otherwise print "No"
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 0 <= N <= 100000
				 * 1 <= X <= 100000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * First value denoting N.
				 * Second value denoting X.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print Yes or No
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input 1 :
				 * 13 5
				 * 
				 * Input 2 :
				 * 15 5
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output 1 :
				 * No
				 * 
				 * Output 2 :
				 * Yes
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Explanation 1 :
				 * 13 is not divisible by 5 so ans is No.
				 * 
				 * Explanation 2 :
				 * 15 is divisible by 5 so ans if Yes.
				 */
				System.out.println("Please enter the first number");
				int number = scanner.nextInt();
				System.out.println("Please enter the secand number");
				int number1 = scanner.nextInt();
				int A = number % number1;
				if (A == 0) {
					System.out.println("Yes " + number + " is divisible by " + number1);
				} else {
					System.out.println("No " + number + " is not divisible by " + number1);
				}

			}
				break;
			case 9: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Given runs scored by a batsman, find if he has scored a century or not.
				 * If he has scored a century print "Century!!!" otherwise print "Better luck next time!".
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 0 <= runs <= 1000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * Single value denoting runs.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print Century!!! or Better luck next time! according to runs given.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input 1 :
				 * 108
				 * 
				 * Input 2 :
				 * 42
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output 1 :
				 * Century!!!
				 * 
				 * Output 2 :
				 * Better luck next time!
				 * 
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Explanation 1 :
				 * runs = 108, so ans is Century!!!
				 * 
				 * Explanation 2 :
				 * runs = 42, so ans is Better luck next time!
				 * 
				 */
				System.out.println("Please enter the score");
				int Number = scanner.nextInt();
				if (Number >= 100) {
					System.out.println("Century!!!");
				} else {
					System.out.println("Better luck next time!");
				}
			}
				break;
			case 10: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Write a program to input two numbers(A & B) from user and print the minimum element among A & B in each line.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= A <= 1000000
				 * 
				 * 1 <= B <= 1000000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * First line is a single integer A.
				 * Second line is a single integer B.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * One line containing an integer as per the question.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 5 
				 * 6
				 * 
				 * 1000 
				 * 10000
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 5
				 * 
				 * 1000
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Clearly, among 5 and 6, 5 is minimum.
				 * 
				 * Clearly, among 1000 and 10000, 1000 is minimum.				 * 
				 */
				System.out.println("Please enter the first number.");
				int Number1 = scanner.nextInt();
				System.out.println("Please enter the secand number.");
				int Number2 = scanner.nextInt();
				if (Number1 > Number2) {
					System.out.println("Number Secand is smaller as compare to first. = " + Number2);
				} else {
					System.out.println("Number first is smaller as compare to Secand. = " + Number1);
				}

			}
				break;
			case 11: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * You are given the Cost Price C and Selling Price S of a Product. You have to tell whether there is a Profit or Loss. Also, calculate total profit or loss.

				 * NOTE: It is guaranteed that Cost Price and Selling Price are not equal.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= C, S <= 109
				 * 
				 * C ≠ S
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * First line of the input contains a single integer C.
				 * 
				 * Second line of the input contains a single integer S.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print two integers in separate lines.
				 * 
				 * First integer denotes whether there is a profit or loss. If there is a profit, print 1, else print -1.
				 * 
				 * Second integer is a non-negative integer denoting the absolute value of total profit or loss.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 2
				 * 4
				 * 
				 * 4
				 * 1
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 1
				 * 2
				 * 
				 * -1
				 * 3
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * 
				 *  Cost Price = 2
 				 * Selling Price = 4
 				 * As Cost Price < Selling Price, there is a profit.
 				 * Total Profit = Selling Price - Cost Price = 4 - 2 = 2
 				 * 
 				 * Cost Price = 4
 				 * Selling Price = 1
 				 * As Cost Price > Selling Price, there is a loss.
 				 * Total Loss = Cost Price - Selling Price = 4 - 1 = 3 

				 */
				System.out.println("Please enter the cost price.");
				long Cost_price= scanner.nextLong();
				System.out.println("Please enter the salling price.");
		        long Selling_price= scanner.nextLong();
		        if (Cost_price<Selling_price){
		            System.out.print("You are in profit of rupee = ");
		            System.out.println(Selling_price-Cost_price);
		        }else{
		        	System.out.print("You are in lose of rupee = ");
		            System.out.println(Cost_price-Selling_price);
		        }
			}
				break;
			case 12: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Exams are near and Rahul is worried whether he will be allowed to take the exams or not. A student is not allowed to take the exams if his/her attendance is less than 75%. But Rahul is a little weak in math, so he wants your help to tell him whether he will be able to give exams or not. You are given the total number of classes held (T) and number of classes attended by Rahul (N), print YES or NO.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= T <= 1000
				 * 1 <= N <= 1000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * First line is T means total classes.
				 * Second line is N means classes attended by Rahul.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print YES if Rahul’s attendance is >= 75% , otherwise print NO
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 150
				 * 100
				 * 
				 * ================ Example Output:- ================
				 * 
				 * NO
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * T = 150
				 * N = 100
				 * 
				 * Attendance = (100 / 150) * 100 = 66.66%
				 * Attendance is less than 75%, so the output is NO.
				 */
				System.out.println("Please enter the number of classes.");
				double number_of_classes= scanner.nextDouble();
				System.out.println("Please enter the attended classes my the user.");
		        double class_attended = scanner.nextDouble();
		        double attendance = (class_attended/number_of_classes)*100;
		        if (attendance>=75){
		            System.out.println("YES");
		        }else{
		            System.out.println("NO");
		        }
			}
				break;
			case 13: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * You have been given a dataset for marks of 2 subjects, scored by students of classes ClassA and ClassB. You now want to compare the performances of class A and class B by finding out the average performance of the classes. Write a program to find if class A performed better. Print True is Class A is strictly better else return False.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * There are 4 lines in the input.
				 * The first and second lines are marks of subjects for Class A.
				 * The third and fourth lines are marks of subjects for Class B.
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * Print True if class A is strictly better else False.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * 80
				 * 27
				 * 54
				 * 61
				 * 
				 * 54
				 * 61
				 * 80
				 * 27
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * False
				 * 
				 * True
				 * 
				 * ================ Example Output:- ================
				 * 
				 * The average marks of class A is (80 + 27)/2 = 53.5, and the average of class B is (54 + 61)/2 = 57.5, so class B's average
				 * is better hence False is printed.
				 * 
				 * The average marks of class A is(54 + 61)/2 = 57.5, and the average of class B is(80 + 27)/2 = 53.5, so class B's average
				 * is better hence True is printed.
				 * 
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * 
				 */
				System.out .println("Please enter the first number for first calcuating.");
				System.out .println("Enter the value of A1.");
				 double A1= scanner.nextInt();
				 System.out .println("Enter the value of A2.");
			        double A2= scanner.nextInt();
			        double A3=A1+A2;
			       System.out .println("The sum of A1 and A2 is = "+A3);
			       System.out.println("Now enter the value for B1.");
			        double B1= scanner.nextInt();
			        System.out.println("Now enter the value for B2.");
			        double B2= scanner.nextInt();
			        double B3=B1+B2;
			        System.out .println("The sum of A1 and A2 is = "+B3);
			        if(A3>B3){
			            System.out.println("A value is bigger then B.");
			        }else{
			            System.out.println("B value is bigger then A.");
			        }
			}
				break;
			case 14: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Take an integer A as input. You have to tell whether A is divible by both 5 and 11 or not.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= A <= 109
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * The input contains a single integer A.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print 1 if A is divisible by both 5 and 11, else print 0.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 55
				 * 
				 * 22
				 * 
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 1
				 * 
				 * 0
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 *  55 is divisible by both 5 (5 * 11 = 55) and 11 (11 * 5 = 55).
				 *  
				 *  22 is divisble by 11 (11 * 2 = 22),but it is not divisible by 5.
				 */
				System.out .println("Please enter the number that you want to check.");
				 double number=scanner.nextDouble();
			        if(number%5==0 && number%11==0){
			            System.out.println("Yes your number is 5 and 11.");
			        }else{
			            System.out.println("No your number is 5 and 11");
			        }
			}
				break;
			case 15: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Write a program that takes the age of the user as input and tells them if they're old enough to ride a roller coaster. The minimum age to ride the roller coaster in this question is 13.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * There is only 1 single line in the input, which is the age of the user.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print the following if user can ride the roller coaster:
				 * You can ride the roller coaster!
				 * Print the following if user can't ride the roller coaster:
				 * You can't ride the roller coaster.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 9
				 * 
				 * 13
				 * 
				 * ================ Example Output:- ================
				 * 
				 * You can't ride the roller coaster.
				 * 
				 * You can ride the roller coaster!
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * 
				 */
				System.out.println("Please enter your age");
				int age= scanner.nextInt();
		        if(age>=13){
		            System.out.println("You can ride the roller coaster!");
		        }else{
		            System.out.println("You can't ride the roller coaster.");
		        }
			}
				break;
			case 16: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Check whether a given number is positive-odd, positive-even, negative-odd OR negative-even.
				 * Write a code to figure out the Situation.
				 * Take a number N from user and print the Situation Of Number.
				 * if positive-odd : print -> "Number is Positive and Odd"
				 * if positive-even : print -> "Number is Positive and Even"
				 * if negative-odd : print -> "Number is Negative and Odd"
				 * if negative-even : print -> "Number is Negative and Even"
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * -1000000 <= N <= 1000000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * Take a number N from user.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print the Situation Of Number according to condition.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input 1 :
				 * 198
				 * 
				 * Input 2 :
				 * -167
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output 1 :
				 * Number is Positive and Even
				 * 
				 * Output 2 :
				 * Number is Negative and Odd
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Explanation 1 :
				 * 198 is greater than 0 so it is a positive number and 198 % 2 == 0 so it is an even number.
				 * 
				 * Explanation 2 :
				 * -167 is smaller than 0 so it is a negative number and -167 % 2 != 0 so it is an odd number.
				 */
				System.out.println("Please enter the number.");
				int num=scanner.nextInt();
		        if(num>0 && 0==num%2){
		            System.out.println("Number is Positive and Even");
		        }else if(num>0 && 1==num%2){
		            System.out.println("Number is Positive and Odd");
		        }else if(num<0 && 0==num%2){
		            System.out.println("Number is Negative and Even");
		        }else if(num<0 && -1==num%2){
		            System.out.println("Number is Negative and Odd");
		        }
			}
				break;
			case 17: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years. Ask user for their name and year of service and print whether they should recieve bonus or not.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= years of service <= 100
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * First line contains name of the employee
				 * Second line contains the years of service
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print whether or not the employee will recieve bonus. 
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Mukesh 
				 * 6
				 * 
				 * Shalini 
				 * 4
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Yes Mukesh will recieve bonus.
				 * 
				 * No Shalini will not recieve bonus.
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Since the years of service of Mukesh are more than 5, he will recieve bonus.
				 * 
				 * Since the years of service of Shalini are less than 5, she will not recieve bonus.
				 */
				String name=scanner.nextLine();
		        int year=scanner.nextInt();
		        if(year>5){
		            System.out.println("Yes "+name+" will recieve bonus.");
		             
		        }else{
		            System.out.println("No "+name+" will not recieve bonus.");
		        }
			}
				break;
			case 18: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Given a Number N, print the answer according to the following rules-
				 * If N is divisible by 3 print Rock
				 * If N is divisible by 5 print star
				 * If N is divisible by both 3 and 5 print Rockstar
				 * Note : You are allowed to use only if condition. Don’t use else or else-if condition. This constraint is provided for learning purposes.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= N <= 1000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * The value of N.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print the appropriate message according to the value of N.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 15

				 * 
				 * ================ Example Output:- ================
				 * 
				 * Rockstar 
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * N = 15
				 * 
				 * 15 is divisible by both 3 and 5 , so the output is Rockstar.
				 */
				System.out.println("Please enter the number.");
				int number=scanner.nextInt();
		        if(0==number%3){
		            System.out.print("Rock");
		        }
		        if(0==number%5){
		            System.out.print("star");
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
