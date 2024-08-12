package newbegining;

public class P25_Throwkeyword {

	public static void main(String[] args) throws ArithmeticException, NullPointerException {
		
		int age = 8;
		if(age>10)
		{
			System.out.println("minor");
		}
		else
		{
			throw new ArithmeticException("Exception is valid");
		}
	}
}


