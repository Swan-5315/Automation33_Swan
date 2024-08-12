package newbegining;

public class P10_su {
	P10_su()
	{
		this("kjk");
		System.out.println("India");
	}
	P10_su(String name)
	{
		System.out.println("maharashtra");
	}
	P10_su(int a)
	{
		this();
		System.out.println("mumbai");
	}
	
	public static void main(String[] args) {
		System.out.println("hi i am swanand");
		new P10_su(12);
		
	}

}
