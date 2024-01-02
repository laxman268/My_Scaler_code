package all_code_from_Scaler;

import java.util.Scanner;

public class Class_five {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the value");
	        double number = sc.nextDouble();
	        sc.close();
	        if(number<=50){
	            System.out.println((int)((number*0.50)+((number*0.50)*20)/100));
	        }else if (number>50 && number<=150){
	            double number1=number-50;
	            System.out.println((int)((number*0.50+number1*0.75)+(((number*0.50)*20)/100)+(((number1*0.75)*20)/100)));
	        }else if (number>150 && number<=250){
	            double number1=number-50;
	            double number2=number-150;
	            System.out.println((number*0.50+number1*0.75+number2*1.20));
	        }else{
	            double number1=number-50;
	            double number2=number-150;
	            double number3=number-250;
	            System.out.println(number*0.50+number1*0.75+number2*1.20+number3*1.50);
	        }
	}

}
