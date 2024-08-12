package newbegining;
class Tcparent
{
	void jvm()
	{
		System.out.println("i am tcparent jvm");
	}
	void mvp()
	{
		System.out.println("i am tcparent mvp");
	}
}

public class P21_ClassTC extends Tcparent {
	void lop()
	{
		System.out.println("i am classtc lop");
	}
	void mop()
	{
		System.out.println("i am classtc mop");
	}

	public static void main(String[] args) {
		//Tcparent t1 =	(Tcparent)new P21_ClassTC();//explicit
		Tcparent t1 =	new P21_ClassTC();//implicit
		t1.jvm();
		
		t1.mvp();
		P21_ClassTC t2 =(P21_ClassTC) new Tcparent();//domncasting only explicitly
		
		
	
	

	}

}
