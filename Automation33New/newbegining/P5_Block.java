package newbegining;

public class P5_Block {
	static
	{
		System.out.println("i am also a static block");
	}
	
	static void add()
	{
		System.out.println("i am static method");
	}
	
	void sub()
	{
		System.out.println("i am non static");
	}
	
	static
	{
		System.out.println("i am SSb i will get execute first automatically");
	}
	P5_Block()
	{
		System.out.println("i am constructor");
	}
	{
		System.out.println("i am IIB i will execute once object creation is done but before constructor");
	}

	public static void main(String[] args) {
		
		P5_Block u = new P5_Block();
		add();
		u.sub();
		
		
		

	}

}
