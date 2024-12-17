package SampleProject;

public class Pallavi1 {

	public static void main(String[] args) {
		String s = "Pallavi Bapu Patekar" ;
		String[] splitname = s.split(" ");
		System.out.println(splitname[0]);
		System.out.println(splitname[2]);
		System.out.println(splitname[1]);
		
		String s1 = "Aditya Prakash Gupte Prakash Anita" ;
		String[] splitstring = s1.split("Prakash");
		System.out.println(splitstring[0].trim());
		System.out.println(splitstring[1].trim());
		System.out.println(splitstring[2].trim());
		
		
	}

}
