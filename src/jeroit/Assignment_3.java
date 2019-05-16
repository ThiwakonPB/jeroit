package jeroit;

import java.util.Scanner;

public class Assignment_3
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console =new Scanner(System.in);
			System.out.println("Enter a Number:");
			int user_input = console.nextInt();
				System.out.println("Entered NUMBER:" + user_input);
				
				if (user_input % 2 ==0) {
					System.out.println("This number is Even");
				}
				
				else {
					System.out.println("This number is Odd");
				}
	}

}
