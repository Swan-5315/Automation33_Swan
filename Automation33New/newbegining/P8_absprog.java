package newbegining;
abstract class GP
{
	abstract void m4();
	abstract void m5();
	
	static void m6()
	{
		System.out.println("i am m6");
	}
	
}
abstract class SP extends GP
{
	abstract void m2();
	abstract void m3();
	static void m7()
	{
		System.out.println("i am m7");
	}

}

public class P8_absprog extends SP {
	
	static void m1()
	{
		System.out.println("i am child class");
	}

	public static void main(String[] args) {
		m1();
		m7();
		P8_absprog O = new P8_absprog();
		O.m2();
		O.m3();
		O.m4();
		O.m5();
	}


	
	void m2() {
 
		System.out.println(" i am m2");
	}

	
	void m3() {
		// TODO Auto-generated method stub
		System.out.println(" i am m3");
	}
	
	void m4() {
		// TODO Auto-generated method stub
		System.out.println(" i am m4");
	}

	
	void m5() {
		// TODO Auto-generated method stub
		System.out.println(" i am m5");
	}

}
