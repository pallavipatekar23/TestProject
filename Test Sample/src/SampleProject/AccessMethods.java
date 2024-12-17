package SampleProject;

public class AccessMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessMethods d = new AccessMethods();
		String name = getData();
		System.out.println(name);
		int i =d.getData1();
		System.out.println(i);
		ArraySplit p = new ArraySplit();
		p.getUserData(); // getting this method from ArraySplit
	}
	
	public static String getData()
	{
		System.out.println("Hello");
		return "pallavi";
	}
	public int getData1()
	{
		//System.out.println("Hello");
		return 123;
	}

}
