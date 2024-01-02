package day_16_Beginner_Iterations_Patterns;

import java.util.Scanner;

public class Day_16_Beginner_Iterations_Patterns_all_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int once_again = 0;
		do {

			System.out.println("");
			System.out.println("Which code would you like to execute?\n\n");
			// Question
			System.out.println("1. Given an integer N, print N stars in a single line.\n\n*****\n\n");
			System.out.println("2. Given two integers N and M as inputs, print a rectangle of N * M stars.\n\n****\n"
					+ "****\n"
					+ "****\n\n");
			System.out.println("3. Take an integer N as input, print the corresponding stair pattern for N.\n"
					+ "\n"
					+ "   For example if N = 4 then stair pattern will be like:\n"
					+ "*\n"
					+ "**\n"
					+ "***\n"
					+ "****");
			System.out.println("4. Given an integer N, print the corresponding Inverted Half Pyramid pattern for N.\n"
					+ "\n"
					+ "For example if N = 4 then pattern will be like:"
					+ "\n****\n"
					+ "***\n"
					+ "**\n"
					+ "*");
			System.out.println("5. Take an integer N as input, print the corresponding pattern for N.\n"
					+ "\n"
					+ "For example if N = 5 then pattern will be like:"
					+ "\n********** // 0 spaces\n"
					+ "\n"
					+ "****__**** // 2 spaces\n"
					+ "\n"
					+ "***____*** // 4 spaces\n"
					+ "\n"
					+ "**______** // 6 spaces\n"
					+ "\n"
					+ "*________* // 8 spaces");
			System.out.println("6. Take an integer N as input, print the corresponding pattern for N.\n"
					+ "\n"
					+ "For example if N = 5 then pattern will be like:"
					+ "\n*________* // 8 spaces\n"
					+ "\n"
					+ "**______** // 6 spaces\n"
					+ "\n"
					+ "***____*** // 4 spaces\n"
					+ "\n"
					+ "****__**** // 2 spaces\n"
					+ "\n"
					+ "********** // 0 spaces");
			System.out.println("7. Take an integer N as input, print the corresponding pattern for N.\n"
					+ "\n"
					+ "For example if N = 5 then pattern will be like:"
					+ "\n____*\n"
					+ "___**\n"
					+ "__***\n"
					+ "_****\n"
					+ "*****");
			
			System.out.println("8. Take an integer N as input, print the corresponding pattern for N.\n"
					+ "\n"
					+ "For example if N = 4 then pattern will be like:"
					+ "\n1\n"
					+ "1 2\n"
					+ "1 2 3\n"
					+ "1 2 3 4");
			System.out.println("9. Take an integer N as input, print the corresponding Numeric Inverted Half Pyramid pattern for N.\n"
					+ "\n"
					+ "For example if N = 4 then pattern will be like:"
					+ "\n1 2 3 4\n"
					+ "1 2 3\n"
					+ "1 2\n"
					+ "1");
			System.out.println("10. Take an integer N as input, print the corresponding pattern for N.\n"
					+ "\n"
					+ "For example if N = 5 then pattern will be like:");
			System.out.println("11. Print a pattern consisting of N rows, where each row contains an asterisk (*) at the beginning and end of the line, with N-2 spaces in between.\n"
					+ "\n"
					+ "The Pattern should look like:\n"
					+ "\n"
					+ "*<N-2 Spaces>*\n"
					+ "\n"
					+ "Print the above pattern for a total of N Rows.\n"
					+ "\n"
					+ "Refer Example ouput, for better clarification.1\n"
					+ "\n1_\n"
					+ "1_3\n"
					+ "1_3_\n"
					+ "1_3_5");
			System.out.println("Print a pattern consisting of N rows, where each row contains an asterisk (*) at the beginning and end of the line, with N-2 spaces in between.\n"
					+ "\n"
					+ "The Pattern should look like:\n"
					+ "\n"
					+ "*<N-2 Spaces>*\n"
					+ "\n"
					+ "Print the above pattern for a total of N Rows.\n"
					+ "\n"
					+ "Refer Example ouput, for better clarification.");

			// Question End
			System.out.print("\nWaiting for you input........:");
			int code_number = scanner.nextInt();
			switch (code_number) {
			case 1: {
				System.out.println("Enter the number.");
				int count_of_star = scanner.nextInt();
				for (int i = 1; i <= count_of_star; i++) {
					System.out.print("*");
				}
			}

				break;
			case 2: {
				System.out.println("Enter the length.");
				int lenght_of_star= scanner.nextInt();
				System.out.println("Enter the brdth.");
		        int brdth_of_star= scanner.nextInt();
		         for (int i=1; i<=lenght_of_star;i++){
		             for (int j=1;j<=brdth_of_star;j++){
		                 System.out.print("*");
		             }
		             System.out.println("");
		         }
			}
				break;
			case 3: {
				System.out.println("Enter the number.");
				 int lenght_of_star= scanner.nextInt();
		         for (int i=1; i<=lenght_of_star;i++){
		             for (int j=1;j<=i;j++){
		                 System.out.print("*");
		             }
		             System.out.println("");
		         }
			}
				break;
			case 4: {
				System.out.println("Enter the number.");
				int lenght_of_star= scanner.nextInt();
		         for (int i=1; i<=lenght_of_star;i++){
		             for (int j=lenght_of_star;j>=i-lenght_of_star+lenght_of_star;j--){
		                 System.out.print("*");
		             }
		             System.out.println("");
		         }
			}
				break;
			case 5: {
				System.out.println("Enter the number.");
				 int number_of_star = scanner.nextInt();
					for(int i=1;i<=number_of_star;i++) {
						for(int j=number_of_star;j>=1;j--) {
							if(j<i) {
								System.out.print(" ");
							}else {
								System.out.print("*");
							}
							
						}
						for(int j=1;j<=number_of_star;j++) {
							if(j<i) {
								System.out.print(" ");
							}else {
								System.out.print("*");
							}
							
						}
						
						System.out.println("");
					}
			}
				break;
			case 6: {
				System.out.println("Enter the number.");
				 int number_of_star = scanner.nextInt();
					for(int i=1;i<=number_of_star;i++) {
						for(int j=1;j<=number_of_star;j++) {
							if(j>i) {
								System.out.print(" ");
							}else {
								System.out.print("*");
							}
							
						}
						for(int j=number_of_star;j>=1;j--) {
							if(j>i) {
								System.out.print(" ");
							}else {
								System.out.print("*");
							}
							
						}
						
						System.out.println("");
					} 
			}
				break;
			case 7: {
				System.out.println("Enter the number.");
				int number = scanner.nextInt();
		        for(int i=1; i<=number;i++){
		            for (int j=number;j>=1;j--){
		                if (j>i){
		                    System.out.print(" ");
		                }else{
		                    System.out.print("*");
		                }
		                
		            }
		            System.out.println();
		        }
			}
				break;
			case 8: {
				System.out.println("Enter the number.");
				int number = scanner.nextInt();
		        for(int i=1; i<=number;i++){
		            for (int j=1;j<=number;j++){
		                if (j<i){
		                    System.out.print(" ");
		                }else{
		                    System.out.print("*");
		                }
		                
		            }
		            System.out.println();
		        }
			}
				break;
			case 9: {
				System.out.println("Enter the number.");
				int number = scanner.nextInt();
		        for(int i=1; i<=number;i++){
		            for (int j=1;j<=number;j++){   
		                if(j<i){
		                            System.out.print(j+" ");  
		                }else if(j==i){
		                    System.out.print(j); 
		                } 
		            }
		            System.out.println();
		        } 
			}
				break;
			case 10: {
				System.out.println("Enter the number.");
				int number = scanner.nextInt();
		        for(int i=number; i>=1;i--){
		            for (int j=1;j<=i;j++){   
		                if(j==i){
		                            System.out.print(j);  
		                }else{
		                    System.out.print(j+" ");  
		                }      
		            }
		            System.out.println();
		        } 
			}
				break;
			case 11: {
				System.out.println("Enter the number.");
				  int number = scanner.nextInt();
			        for(int i=1; i<=number;i++){
			            for (int j=1;j<=i;j++){
			                if (j%2!=0 && j<=i){
			                    System.out.print(j);
			                }else{
			                    System.out.print(" ");
			                }
			                
			            }
			            System.out.println();
			        }
			}
				break;
			case 12: {
				System.out.println("Enter the number.");
				 int number = scanner.nextInt();
			        for(int i=1; i<=number;i++){
			            for (int j=1;j<=number;j++){
			                if (j==1 || j==number){
			                    System.out.print("*");
			                }else{
			                    System.out.print(" ");
			                }
			                
			            }
			            System.out.println();
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
