package newbegining;
//example of method overloading using super keyword
class Police
{
	void a1()
	{
		System.out.println("i am parent method");
	}
}

public class P7_prac extends Police {
	
	void a1()
	{
		super.a1();
		System.out.println("i am child method");
	}

	public static void main(String[] args) {
		P7_prac o= new P7_prac();
		o.a1();
	}

}
