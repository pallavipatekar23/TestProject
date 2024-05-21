package SampleProject;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int passingmarks = 35;
int actualmarks;

Scanner in = new Scanner (System.in);

System.out.println("Enter marks:");
actualmarks = in.nextInt();
if (actualmarks > passingmarks)

	System.out.println(" Congratulations you are pass");

else

	System.out.println("You are fail");

	}

}
