package q2project_truthlaolaureano;
import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		try{
		System.out.print("Please input a number: ");     
		int num1 = Integer.parseInt(sc.nextLine());
		if (num1 > 100){
			throw new IllegalArgumentException("An IllegalArgumentException occured.");
		}
		
		System.out.print("Please input another number: ");
		int num2 = Integer.parseInt(sc.nextLine());
		if (num2 > 100){
			throw new IllegalArgumentException("An IllegalArgumentException occured.");
		}
		int sum = num1 + num2;
		System.out.printf("The sum of the two numbers is %d.%n", sum);
		}
		catch(NumberFormatException e) {
			System.out.println("A NumberFormatException occurred.");
		}
	}
}
	
