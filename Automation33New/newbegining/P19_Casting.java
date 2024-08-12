package newbegining;

public class P19_Casting {

	public static void main(String[] args) {
		//narrowing
		double wt1 = 78.90;
		int wt2 =(int) wt1;
		System.out.println(wt2);
		//widening
		
	int wt3 = 78;
	double wt4 = wt3;//implicitly
	System.out.println(wt4);
	
	double wt5=(double)wt3;//explicity
	System.out.println(wt5);
	
	byte wta = 34;
	long wtb = wta;//implicitly
	System.out.println(wtb);
	
	long wtc =(long) wta;//explicitly
	System.out.println(wtc);
	
	}

}
