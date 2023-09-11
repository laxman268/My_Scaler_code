package day_22_Beginner_1D_Array_2;

import java.util.Scanner;

public class Day_22_Beginner_1D_Array_2_all_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int once_again = 0;
		do {

			System.out.println("");
			System.out.println("Which code would you like to execute?\n\n");
            // Question
			System.out.println("1. ");
			System.out.println("2. ");
			System.out.println("3. ");
			System.out.println("4. ");
			System.out.println("5. ");
			System.out.println("6. ");
			System.out.println("7. ");
			System.out.println("8. ");
			System.out.println("9. ");
			System.out.println("10. ");
			System.out.println("11. ");
			System.out.println("12. ");
			System.out.println("13. ");
			System.out.println("14. ");
			System.out.println("15. ");
			// Question End
			System.out.print("\nWaiting for you input........:");
			int code_number = scanner.nextInt();
			switch (code_number) {
			case 1: {
				System.out.println("Hello " + 40);
				System.out.println(50 + " World !");

			}
				break;
			case 2: {

			}
				break;
			case 3: {

			}
				break;
			case 4: {

			}
				break;
			case 5: {

			}
				break;
			case 6: {

			}
				break;
			case 7: {

			}
				break;
			case 8: {

			}
				break;
			case 9: {

			}
				break;
			case 10: {

			}
				break;
			case 11: {

			}
				break;
			case 12: {

			}
				break;
			case 13: {

			}
				break;
			case 14: {

			}
				break;
			case 15: {

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
