package SampleProject;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x, y , fact =1;

System.out.println("Enter no to find factorial");

Scanner in = new Scanner (System.in);
x = in.nextInt();
if (x<0)
{
	System.out.println("No can not be in negative");
}
else {
	for (y = 1; y <= x; y++)
		fact = fact*y;
	
		System.out.println("factoral is :" + fact);
	
}
	}

}
