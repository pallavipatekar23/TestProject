package SampleProject;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x;

System.out.println("Enter No to check if its even or odd");

Scanner in = new Scanner (System.in);
x = in.nextInt();
 if(x%2 ==0)
 {
	 System.out.println("Its even no");
 }
 else {
	 System.out.println("Its odd no");
 }
	}

}
