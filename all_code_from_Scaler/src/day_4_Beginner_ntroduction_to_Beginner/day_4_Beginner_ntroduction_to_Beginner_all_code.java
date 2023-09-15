package day_4_Beginner_ntroduction_to_Beginner;

import java.util.*;

public class day_4_Beginner_ntroduction_to_Beginner_all_code {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int once_again;

		do {

			System.out.println("");
			System.out.println("Which code would you like to execute?\n\n");
			System.out.println("1. Print the first five letters of the English alphabet i.e. A, B, C, D and E.");
			System.out.println("2. Perform the following operations on 6 and 3 and print their respective outputs in different lines.");
			System.out.println("3. Print the following pattern in output 1");
			System.out.println("4. Print the following pattern in output 2");
			System.out.println("5. Print \"Hello World !\" in the output.");
			System.out.println("6. Print the following Pattern in Output 3");
			System.out.println("7. Print the following Pattern in Output 4");
			System.out.println("8. Print the following Pattern in Output 5");
			System.out.println("9. Print the following Pattern in Output 6");
			System.out.println("10. Print following message in text.");
			System.out.println("\n\n");

			int code_number = sc.nextInt();
			switch (code_number) {
			case 1: {

				/* =====================
				 * Problem Description:-
				 * =====================
				 * 
				 * Print the first five letters of the English alphabet i.e. A, B, C, D and E.
				 * 
				 * ===============
				 * OutPut Format:-
				 * ===============
				 * 
				 * Print the characters in separate lines.
				 * 
				 * ================
				 * Example Output:-
				 * ================
				 * 
				 *  A
				 *	B 
				 *	C
				 *	D
				 *	E
				 * 
				 * 
				 *
				 */

				System.out.println("A");
				System.out.println("B");
				System.out.println("C");
				System.out.println("D");
				System.out.println("E");

			}
				break;

			case 2: {

				/* =====================
				 * Problem Description:-
				 * =====================
				 * 
				 * Perform the following operations on 6 and 3 and print their respective
				 * outputs in different lines. 1. Addition 2. Subtraction 3. Multiplication 4.
				 * Division
				 * 
				 * ===============
				 * Output Format:-
				 * ===============
				 * 
				 * Print the output of 6+3, 6-3, 6*3, 6/3 in separate lines.
				 * 
				 * ================
				 * Example Output:-
				 * ================
				 * 
				 * 	9
				 *	3
				 *	18
				 *	2
				 *	
				 *	=====================
				 *	Example Explanation:-
				 *  =====================
				 *  
				 *	6 + 3 = 9
				 *	6 - 3 = 3
				 *	6 * 3 = 18
				 *	6 / 3 = 2
				 */
				
				System.out.println("when we add 6 and 3 we will get = " + (6 + 3));
				System.out.println("when we sub 6 and 3 we will get = " + (6 - 3));
				System.out.println("when we mult 6 and 3 we will get = " + (6 * 3));
				System.out.println("when we devide 6 and 3 we will get = " + (6 / 3));
			}
				break;

			case 3: {
				/* =====================
				 * Problem Description:-
				 * =====================
				 * 
				 * Print the following pattern in output *****
				 * **** 
				 * *** 
				 * ** 
				 * *
				 *
				 * ===============
				 * Output Format:-
				 * ===============
				 * 
				 * Print the following pattern in 5 lines with 5, 4, 3, 2, 1 stars in each line
				 *
				 * *****  
				 * ****  
				 * ***  
				 * **  
				 * *
				 *
				 * ================
				 * Example Output:-
				 * ================
				 * 
				 * *****  
				 * ***  
				 * **  
				 * *  
				 *
				 *
				 */

				System.out.println("*****");
				System.out.println("****");
				System.out.println("***");
				System.out.println("**");
				System.out.println("*");
			}
				break;

			case 4: {
				/* ====================
				 * Problem Description
				 * ====================
				 * 
				 * Print the following pattern in output
				 * 
				 * =============
				 * Output Format
				 * =============
				 * 
				 * Print the following pattern in 5 lines with 4 spaces and 1 star, 3 spaces and 2 stars, 2 spaces and 3 stars, 1 spaces and 4 stars, 0 spaces and 5 stars in respectively lines
				 * 
				 * 
				 *		 *
				 *	    **
				 *     ***
				 *    ****
				 *   *****
				 *   
				 * ============== 
				 * Example Output
				 * ==============
				 *
				 *      *
			     *	   **
			     *	  ***
			     *	 ****
			     *	*****
				 *
				 */
				System.out.println("    *");
				System.out.println("   **");
				System.out.println("  ***");
				System.out.println(" ****");
				System.out.println("*****");
			}
				break;

			case 5: {
				
				/*
				 * =====================
				 * Problem Description:-
				 * =====================
				 * 
				 * Print "Hello World !" in the output. 
				 * 
				 * ===============
				 * Output Format:-
				 * ===============
				 * 
				 * Print in a single line "Hello World !"
				 * 
				 * ================ 
				 * Example Output:-
				 * ================
				 * Hello World !
				 *	
				 * Note - You don't have to print "" in the output
				 * 
				 */

				System.out.println("Hello World !");
			}
				break;

			case 6: {
				/* =====================
				 * Problem Description:-
				 * =====================
				 * 
				 * 
				 * 
				 * ===============
				 * Output Format:-
				 * ===============
				 * 
				 * 
				 * 
				 * ================ 
				 * Example Output:-
				 * ================
				 * 
				 * 
				 */
				System.out.println("******");
				System.out.println("*");
				System.out.println("*");
				System.out.println("*");
				System.out.println("******");

			}
				break;

			case 7: {
				/* =====================
				 * Problem Description:-
				 * =====================
				 * 
				 * 
				 * 
				 * ===============
				 * Output Format:-
				 * ===============
				 * 
				 * 
				 * 
				 * ================ 
				 * Example Output:-
				 * ================
				 * 
				 * 
				 */

				System.out.println("******");
				System.out.println("*    *");
				System.out.println("*    *");
				System.out.println("*    *");
				System.out.println("******");
			}
				break;

			case 8: {
				/*Problem Description
				/* =====================
				 * Problem Description:-
				 * =====================
				 * 
				 * 
				 * 
				 * ===============
				 * Output Format:-
				 * ===============
				 * 
				 * 
				 * 
				 * ================ 
				 * Example Output:-
				 * ================
				 * 
				 * 
				 */

				System.out.println("*****");
				System.out.println("   *");
				System.out.println("  *");
				System.out.println(" *");
				System.out.println("*****");
			}
				break;

			case 9: {
				/* =====================
				 * Problem Description:-
				 * =====================
				 * 
				 * 
				 * 
				 * ===============
				 * Output Format:-
				 * ===============
				 * 
				 * 
				 * 
				 * ================ 
				 * Example Output:-
				 * ================
				 * 
				 * 
				 */

				System.out.println("******");
				System.out.println("*");
				System.out.println("*");
				System.out.println("******");
				System.out.println("     *");
				System.out.println("     *");
				System.out.println("******");
			}
				break;
			case 10: {
				/* =====================
				 * Problem Description:-
				 * =====================
				 * 
				 * 
				 * 
				 * ===============
				 * Output Format:-
				 * ===============
				 * 
				 * 
				 * 
				 * ================ 
				 * Example Output:-
				 * ================
				 * 
				 * 
				 */
				System.out.println("Dear Compiler");
				System.out.println("----Never Give me bugs");
				System.out.println("----If bugs are there, please help me to fix It");
				System.out.println("----Thank You");

			}
				break;

			default: {
				System.out.println("Please enter the correct option......");
			}
			}
			System.out.println("\n\nWould you like to try again?..... 1/0");

			once_again = sc.nextInt();
			
		}while (once_again == 1);
		if (once_again == 1) {
		} else if (once_again == 0) {
			System.out.println("Thanks for using my test question......\n");
		} else {
			System.out.println("incorrcet option. Thanks for using my set question......");
		}

		sc.close();

		/*
		 * class Main { public static void main(String args[]) { // Your code goes here
		 * 
		 * 
		 * /* Rules: 1. To print we use: System.out.print() 2. End the statements with
		 * semi-colon (;) 3. Java is case sensitive Out and out are diff words in Java
		 * 4. To print text, we need to use double quotes (" ") 5. {}, (), [], " " ->
		 * all these come in pair
		 */

		// System.out.print(1234);

		// Quiz 1
		// System.out.print(10+20)
		// Error -> ; is missing

		// Quiz 2
		// System.Out.print(10+20);
		// Error -> O should be small in out

		// Quiz 3
		// System.out.print(10+20);
		// 30

		// Quiz 4
		// System.out.print(10*20);
		// 200

		// Quiz 5
		// System.out.print(5-10);
		// -5

		// Priyanshi
		// System.out.print("My name is Priyanshi.");

		// Hellooo!!

		// System.out.print("Hellooo!!");

		// Quiz 6
		// System.out.print("Priyanshi);
		// Error - " is missing at the end

		// Quiz 7
		// System.out.print("10+20");
		// 10+20

		// Quiz 8
		// System.out.prinT("10/20 world is ");
		// Error -> T should be in lowercase

		// Welcome Guys!!
		// My name is Priyanshi.

		// System.out.print("Welcome Guys!!");
		// System.out.print("My name is Priyanshi.");
		// Welcome Guys!!My name is Priyanshi.

		// Quiz 9
		// System.out.print(10);
		// System.out.print(20);
		// 1020

		// Quiz 10
		// System.out.print("Scaler");
		// System.out.print("Academy");
		// ScalerAcademy

		// System.out.println("Scaler");
		// System.out.println("Academy");

		// Scaler
		// Academy

		// System.out.print("Scaler");
		// System.out.println("Academy");
		// System.out.print(400);

		// ScalerAcademy
		// 400

		// Comments : statements which compiler will ignore

		// 1. Single line comment

		/*
		 * . . . This is a multi line comment . . .
		 * 
		 */

		// Quiz 11
		/*
		 * //System.out.println("Super"); System.out.println("Excited"); // Excited
		 */

		// Quiz 12
		// System.out.print("Hey There");
		// Hey There

		// Quiz 13
		// System.out.print("A");
		// System.out.println("B");
		// System.out.println("C");

		/*
		 * AB C
		 * 
		 * 
		 */

	}

}
