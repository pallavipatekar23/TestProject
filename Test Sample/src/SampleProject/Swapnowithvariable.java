package SampleProject;

import java.util.Scanner;

public class Swapnowithvariable {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//int a = 2;
//int b = 9;
//int c;
//
//System.out.println("first no" + a);
//System.out.println("srcond no"+ b);
//
//c = b;
//b=a;
//System.out.println("first no" + c);
//System.out.println("first no" + b);
//	}
	public static void main(String[] args) {
		int x,y,z;
		Scanner in = new Scanner (System.in);
		System.out.println("enter value for X and Y");
		x = in.nextInt();
		y = in.nextInt();
		System.out.println("values before swap" +x + "and" +y);
		
		z = y;
		y= x;
		x=z;
		
		System.out.println("values after swap" +x + "and" +y);
		
			
	}

}
