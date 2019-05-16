package jeroit;

import java.util.Scanner;

public class Homework2_2 {

	public static void main (String [] args) {
	Scanner console = new Scanner(System.in);
			int radius = console.nextInt();
			System.out.println("Circle Radius: "+ radius);
			
	System.out.println ("The Area of a circle with a radius of "+ radius + " is " + ((radius*radius) *3.14));
	System.out.println ("The Circumfrence of a circle with a radius of " + radius +" is " + (2*radius*3.14 ));
	
	
	}
}
