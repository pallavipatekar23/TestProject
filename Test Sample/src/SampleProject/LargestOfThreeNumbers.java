package SampleProject;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,y,z;

System.out.println("Enter three no to find largest no");
Scanner in = new Scanner(System.in);

x = in.nextInt();
y = in.nextInt();
z = in.nextInt();

		if (x>y && x>z)
		System.out.println("x is largest");
	
		else if (y>x && y>z)
		System.out.println("y is largest");
		
		else if (z>x && z>y)
		System.out.println("z is largest");
		
		else
			System.out.println("Entered numbers are not distinct.");
	}

}
