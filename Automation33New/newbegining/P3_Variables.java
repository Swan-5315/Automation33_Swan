package newbegining;

public class P3_Variables {
	
	int a=69;
	
	void add()
	{
		int a=10;
		
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		int a = 20;
		System.out.println(a);
		P3_Variables X = new P3_Variables();
		X.add();
		X.a=23;
		System.out.println(X.a);
		
	}

}
