package day_17_Beginner_Functions_1;

import java.util.Scanner;

public class Day_17_Beginner_Functions_1_all_code {

	private static double output;
	private static int output2;
	private static int output3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int once_again = 0;
		do {

			System.out.println("");
			System.out.println("Which code would you like to execute?\n\n");
            // Question
			System.out.println("1. Given a number N, return factorial of N.\n"
					+ "\n"
					+ "Required Information for factorial :\n"
					+ "n! = n * (n-1) * (n-2) * . . . . . . * 3 * 2 * 1.\n"
					+ "\n"
					+ "for eg. 5! = 5 * 4 * 3 * 2 * 1 = 120.\n"
					+ "\n"
					+ "Corner Case :\n"
					+ "0! = 1");
			System.out.println("2. You are given a function that takes an integer argument A. Return 1 if A is a perfect square otherwise return 0.\n"
					+ "\n"
					+ "   A perfect square is an integer that is the square of an integer. For example 16 is perfect square as it is the square of an integer 4 (42 = 16)");
			System.out.println("3. GMultiply the numbers\n"
					+ "Given two numbers A & B. Return their product.");
			System.out.println("4. Given a number A. Return square of the number.");
			System.out.println("5. Given two integers A and B, where A is divisible by B.\n"
					+ "\n"
					+ "Print the value of quotient, when A is divided by B.\n"
					+ "\n"
					+ "Note: It is not necessary that A is completely divisible by B");
			System.out.println("6. Given an integer A, find the floor value of real number A / 200.\n"
					+ "\n"
					+ "Floor value of a real number X is the greatest integer less than or equal to X.");
			System.out.println("7. Given an integer A, find the ceil value of real number A / 200.\n"
					+ "\n"
					+ "Ceil value of a real number X is the smallest integer value that is greater than or equal to X.");
			System.out.println("8. Given the temperature of a day in Degrees Celsius, convert this given temperature from Celsius to Fahrenheit. Complete the function to do so. Round the output up to 2 decimal places\n"
					+ "\n"
					+ "Note1:\n"
					+ "\n"
					+ "Python : Use round(ans,2) to round up ans to two decimals\n"
					+ "\n"
					+ "Java : Use Math.round(val*100)/100d to round upto two decimals\n"
					+ "\n"
					+ "Note2:\n"
					+ "\n"
					+ "You need not take input in this problem, you need to only implement the function provided.");
			// Question End
			System.out.print("\nWaiting for you input........:");
			int code_number = scanner.nextInt();
			switch (code_number) {
			case 1: {
				System.out.println("Please enter the number.");
				int number= scanner.nextInt();
				int fact=factorial(number);
				System.out.println(fact);

			}
				break;
			case 2: {
				System.out.println("Please enter the number.");
				int number= scanner.nextInt();
				int output=perfect_square(number);
				if(output==1) {
					System.out.println("Yes this number can make a perfect square.");
				}else {
					System.out.println("No it is not.");
				}
				
			}
				break;
			case 3: {
				System.out.println("Please enter the number that you want to multiply.");
				int number= scanner.nextInt();
				int number1= scanner.nextInt();
				int output=multply(number,number1);
				System.out.println(output);
			}
				break;
			case 4: {
					System.out.println("Plase enter the two number for devide first divident then deviser.");
					double number= scanner.nextDouble();
					double number1= scanner.nextDouble();
					double output=divisible(number,number1);
					System.out.println(output);
			}
				break;
			case 5: {
				System.out.println("Please enter the number.");
				int number= scanner.nextInt();
				output2 = floor_value(number);
				System.out.println(output2);
			}
				break;
			case 6: {
				System.out.println("Please enter the number.");
				int number= scanner.nextInt();
				output3 = ceil_value(number);
				System.out.println(output3);
			}
				break;
			case 7: {
				System.out.println("Please enter the number.");
				double number= scanner.nextInt();
				output = Round_value(number);
				System.out.println(output);

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
	
	


	    public static int factorial(int A) {
	        int factorial=1;
	        for(int i = A;i>=1 ; i--){
	            factorial=factorial*i;
	        }
	        
	        System.out.println("The factorial of "+A+" is = "+factorial+".");
	        return factorial;
	    }
	    public static int perfect_square(int A) {
	    	int value=0;
	        for(int i=1;i<=A;i++){
	            if(A==i*i){
	                value=1;
	                break;
	            }
	            if(A<i*i){
	                value=0;
	                break;
	            }

	            
	        }
	        return value;
	    }
	    
	    public static int multply(int A,int B) {
	    	int multiply=A*B;
	        return multiply;	
	    }
	
	    public static double divisible(double A,double B) {
	    	 double quotient=A/B;
	         return quotient;
	    }
	    
	    public static int floor_value(int A) {

	    	 double number = (double)A;
	         double number1=(double)Math.floor(number/200);
	         int floores=(int)number1;
	         return floores;
	    }
	    
	    public static int ceil_value(int A) {
	    	double number=(double)A;
	        double number2 = (double)Math.ceil(number/200);
	        int number1=(int)number2;
	        return number1;
	    }
	    
	    public static double Round_value(double a) {
	    	double Fahrenheit=(a*9/5)+32;
	        double Fahrenheit1 = Math.round(Fahrenheit*100)/100.0;
	        return Fahrenheit1;
	    }
	    
	    
	    
	    
}
