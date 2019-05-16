package jeroit;

import java.util.Scanner;

public class Classwork_7 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number 1: ");
		Scanner number = new Scanner(System.in);
		double numa = number.nextDouble();
		System.out.println("Entered Number: "+ numa);
		
		System.out.println("Enter the number 2: ");
		Scanner console = new Scanner(System.in);
		double num = console.nextDouble();
		System.out.println("Entered Number: "+ num);
		
		System.out.println("Enter the number for Plue = 1 minus =2 multiple =3 divide = 4: ");
		Scanner numberb = new Scanner(System.in);
		int numb = numberb.nextInt();
		System.out.println("Entered Number: "+ numb);
		
		switch (numb) {
		case 1 :
			System.out.println("Plus ="+(num+numa));
			break;
		case 2 : 
			System.out.println("Minus =" +(num-numa) );
			break;
		case 3 : 
			System.out.println("Multiple =" +(num*numa));
			break;
		case 4 : 
			System.out.println("Divide =" + (numa/num));
			break;
		}
		
	}

}
