package day_13_Beginner_Iterations_Loop_1;

import java.util.Scanner;

public class Day_13_Beginner_Iterations_Loop_1_all_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int once_again = 0;
		do {

			System.out.println("");
			System.out.println("Which code would you like to execute?\n\n");
			// Question
			System.out.println("1. Write a program to print all Natural numbers from 1 to N where you have to take N as input from usern\n\n");
			System.out.println("2. Write a program to print all Natural numbers from N to 1 where you have to take N as input from user\n\n");
			System.out.println("3. Write a program to print all even numbers from 1 to N where you have to take N as input from the user.\n"
					+ "   Note: Use while-loop OR for-loop, according to session flow.\n\n");
			System.out.println("4. Given an integer input N, print all multiples of 4 less than or equal to N.\n\n");
			System.out.println("5. Given a number N, print the last digit of Number.\n\n");
			System.out.println("6. Given a number N, Print all digits of number (from right to left) in new line.\n\n");
			System.out.println("7. Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user\n\n");
			System.out.println("8. Write a program to print all even numbers from N to 0 where you have to take N as input from the user.\n\n");
			System.out.println("9. Write a program to print all odd numbers from 1 to N where you have to take N as input from user. Here N is inclusive.\n\n");
			System.out.println("10. Take an integer A as input. You have to print the sum of all odd numbers in the range [1, A].\n\n");
			System.out.println("11. You are given a positive integer A. You have to print the sum of all even numbers in the range [1, A].\n\n");
			System.out.println("12. Take a number A as input, print its multiplication table having the first 10 multiples.\n\n");

			// Question End
			System.out.print("\nWaiting for you input........:");
			int code_number = scanner.nextInt();
			switch (code_number) {
			case 1: {
				System.out.println("Please enter the number till where you want to check the Natural number.");
				int number = scanner.nextInt();
		        int i=1;
		        while(i<=number){
		            System.out.print(i+" ");
		            i++;
		        }

			}
				break;
			case 2: {
				System.out.println("Please enter the number till where you want to check the Natural number.");
				int number = scanner.nextInt();
		        int i=1;
		        while(i<=number){
		            System.out.print(number+" ");
		            number--;
		        }

			}
				break;
			case 3: {
				System.out.println("Please enter the number.");
				int number= scanner.nextInt();
			       int i=1;
			       while(i<=number){
			           if(i%2==0){
			               System.out.print(i+" ");
			               
			           }
			           i++;
			       } 
			}
				break;
			case 4: {
				System.out.println("Please enter the number.");
				 int number= scanner.nextInt();
			        int i=1;
			        while(i<=number){
			            if(i%4==0){
			                System.out.print(i+" ");
			            }
			            i++;
			        }
			}
				break;
			case 5: {
				System.out.println("Please enter the number.");
				int number = scanner.nextInt();
		        number =number%10;
		        System.out.println(number);

			}
				break;
			case 6: {
				System.out.println("Please enter the number.");
				int number = scanner.nextInt();
		        
		        if (number==0){
		        System.out.println(number);
		        }
		        else if(number<0){
		            number=number-2*number;
		        }
		        while(number!=0){

		            System.out.println(number%10);
		            number=number/10;
		            
		        }
			}
				break;
			case 7: {
				System.out.println("Please enter the number.");
				int number = scanner.nextInt();
		        int i=0,d=0;

		        while(i<=number){
		            d=d+i;
		            i++;
		        }
		        System.out.println(d);

			}
				break;
			case 8: {
				System.out.println("Please enter the number.");
				int number =scanner.nextInt();

		        while (number>=0){
		            if(number%2==0){
		                System.out.print(number+" ");
		            }
		            number--;
		        }

			}
				break;
			case 9: {
				System.out.println("Please enter the number.");
				int number =scanner.nextInt();
		        int i=0;

		        while (i<=number){
		            if(i%2==1){
		                System.out.print(i+" ");
		            }
		            i++;
		        }
			}
				break;
			case 10: {
				System.out.println("Please enter the number.");
				int number =scanner.nextInt();
		        int i=0,d=0;

		        while (i<=number){
		            if(i%2==1){
		                d=d+i;
		            }
		            i++;
		        }
		        System.out.println(d);
			}
				break;
			case 11: {
				System.out.println("Please enter the number.");
				 int number =scanner.nextInt();
			        int i=0,d=0;

			        while (i<=number){
			            if(i%2==0){
			                d=d+i;
			            }
			            i++;
			        }
			        System.out.println(d);
			        

			}
				break;
			case 12: {
				System.out.println("Please enter the number.");
				int number= scanner.nextInt();
		        int i=1;
		         while(i<=10){
		             System.out.println(number+" * "+i+" = "+number*i);
		             i++;
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
