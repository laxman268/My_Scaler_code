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
