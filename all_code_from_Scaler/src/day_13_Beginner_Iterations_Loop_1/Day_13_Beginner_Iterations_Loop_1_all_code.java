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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Write a program to print all Natural numbers from 1 to N where you have to take N as input from user
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= N <= 1000000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * A single line representing N
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * N space separated integers from 1 to N.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 5
				 * 
				 * 10
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 1 2 3 4 5 
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * 1 2 3 4 5 6 7 8 9 10 
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Write a program to print all Natural numbers from N to 1 where you have to take N as input from user
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= N <= 10000000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * A single line representing N
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * N space separated integers from N to 1.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 5
				 * 
				 * 10
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 5 4 3 2 1 
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * 10 9 8 7 6 5 4 3 2 1 
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Write a program to print all even numbers from 1 to N where you have to take N as input from the user.
				 * Note: Use while-loop OR for-loop, according to session flow.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= N <= 1000000

				 * 
				 * ============== Input Format:- ==============
				 * 
				 * All even numbers from 1 to N are separated by spaces.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * All even numbers from 1 to N are separated by spaces.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input 1:
				 * 5
				 * 
				 * Input 2:
				 * 10
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 
				 * Output 1:
				 * 2 4 
				 * 
				 * Output 2:
				 * 2 4 6 8 10
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Sample 1:
				 * 2 4
				 * The even numbers between 1 to 5 are 2 and 4. So the numbers 2 and 4 are printed separated by space.
				 * 
				 * Output 2:
				 * 2 4 6 8 10
				 * The even numbers between 1 to 10 are 2, 4, 6, 8 and 10. So the numbers 2, 4, 6, 8, 10 are printed separated by space.
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Given an integer input N, print all multiples of 4 less than or equal to N.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= N <= 10000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * Single line containing an integer N.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Space separated integers representing multiples of 4 less than or equal to N.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 22
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 4 8 12 16 20
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * 1 * 4 = 4
				 * 2 * 4 = 8
				 * 3 * 4 = 12
				 * 4 * 4 = 16
				 * 5 * 4 = 20
				 * 
				 * All are multiples of 4 less than 22
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Given a number N, print the last digit of Number.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 0 <= N <= 1000000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * Number N in single line
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print last digit in single line
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input 1 :
				 * 1973
				 * 
				 * Input 2 :
				 * 530
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output 1 :
				 * 3
				 * 
				 * Output 2 :
				 * 0
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Explanation 1 :
				 * Last Digit of 1973 is 3.
				 * 
				 * Explanation 2 :
				 * Last Digit of 530 is 0.
				 */
				System.out.println("Please enter the number.");
				int number = scanner.nextInt();
		        number =number%10;
		        System.out.println(number);

			}
				break;
			case 6: {
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Given a number N, Print all digits of number (from right to left) in new line.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * -10000 <= N <= 10000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * Take N in single line
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print Digits of Number in new line
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input 1 :
				 * 2001
				 * 
				 * Input 2 :
				 * -6985
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output 1 :
				 * 1
				 * 0
				 * 0
				 * 2
				 * 
				 * Output 2 :
				 * 5
				 * 8
				 * 9
				 * 6
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Explanation 1 :
				 * N is 2001, digits from right to left are 1, 0, 0, 2.
				 * 
				 * Explanation 2 :
				 * N is -6985, N is in negative but digits of Number from right to left are 5, 8, 9, 6.
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= N <= 1000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * A single line representing N
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * A single integer showing sum of all Natural numbers from 1 to N
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 5
				 * 
				 * 10
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 15
				 * 
				 * 55
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * 
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Write a program to print all even numbers from N to 0 where you have to take N as input from the user.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= N <= 1000000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * A single line representing N.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * All even numbers from N to 0 are separated by spaces.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * Input 1:
				 * 5
				 * 
				 * Input 2:
				 * 10
				 * 
				 * ================ Example Output:- ================
				 * 
				 * Output 1:
				 * 4 2 0
				 * 
				 * Output 2:
				 * 10 8 6 4 2 0
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * Explanation 1:
				 * N = 5, all even numbers from 5 to 0 are : 4 2 0
				 * 
				 * Explanation 2:
				 * N = 10, all even numbers from 10 to 0 are : 10 8 6 4 2 0
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Write a program to print all odd numbers from 1 to N where you have to take N as input from user. Here N is inclusive.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= N <= 2000000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * A single line representing N
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * All odd numbers from 1 to N separated by spaces.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 5
				 * 
				 * 10
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 1 3 5 
				 * 
				 * 1 3 5 7 9 
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * 
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Take an integer A as input. You have to print the sum of all odd numbers in the range [1, A].
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= A <= 1000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * First and only line contains a single positive integer A.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print the required sum in a single line.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 1
				 * 
				 * 4
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 1
				 * 
				 * 4
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * For A = 1, 1 is the only odd number which lies in the range [1, 1].
				 * 
				 *  For A = 4, Odd numbers 1 and 3 lie in the range [1, 4]. Sum = 1 + 3 = 4. 
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * You are given a positive integer A. You have to print the sum of all even numbers in the range [1, A].
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= A <= 1000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * First and only line contains a single positive integer A.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print the required sum in a single line.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 1
				 * 
				 * 4
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 0
				 * 
				 * 6
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 *  For A = 1, there are no even number which lies in the range [1, 1].
				 *  
				 *  For A = 4, Even numbers 2 and 4 lie in the range [1, 4]. Sum = 2 + 4 = 6. 
				 */
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
				/*
				 * ===================== Problem Description:- =====================
				 * 
				 * Take a number A as input, print its multiplication table having the first 10 multiples.
				 * 
				 * ===================== Problem Constraints:- =====================
				 * 
				 * 1 <= A <= 1000
				 * 
				 * ============== Input Format:- ==============
				 * 
				 * First line contains a single integer A.
				 * 
				 * =============== Output Format:- ===============
				 * 
				 * Print 10 lines, ith line containing ith multiple.
				 * 
				 * =============== Example Input:- ===============
				 * 
				 * 2
				 * 
				 * 3
				 * 
				 * ================ Example Output:- ================
				 * 
				 * 2 * 1 = 2 
				 * 2 * 2 = 4 
				 * 2 * 3 = 6 
				 * 2 * 4 = 8 
				 * 2 * 5 = 10 
				 * 2 * 6 = 12 
				 * 2 * 7 = 14 
				 * 2 * 8 = 16 
				 * 2 * 9 = 18 
				 * 2 * 10 = 20 
				 * 
				 * ===================== Example Explanation:- =====================
				 * 
				 * For A = 2, First 10 multiples of 2 are 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 
				 */
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
