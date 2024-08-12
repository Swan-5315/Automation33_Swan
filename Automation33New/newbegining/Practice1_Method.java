package newbegining;

public class Practice1_Method {
	
	static void login()
	{
		System.out.println("Plz enter ur login id in statis method");
	}
	 void login(int a)
	{
		System.out.println("i am first overloaded method of login");
	}
	
	void login(int a, int b)
	{
		System.out.println("i am non static method");
	}
	
	Practice1_Method()
	{
		System.out.println("i am constructor");
	}
	Practice1_Method(String a)
	{
		System.out.println("i am constructor overloaded");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice1_Method L = new Practice1_Method();
		new Practice1_Method("Swan");
		login();
		L.login(8, 9);
		System.out.println("i am main method");
		L.login(8);
		

	}

}
