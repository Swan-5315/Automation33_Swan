package newbegining;
interface Fb_log
{
	void build();
	void validcred();
}
interface Fb_logingateway extends Fb_log
{
	void smoke();
	void sanity();
}

public class P9_Inexm implements Fb_logingateway  {
	
	static void test()
	{
		System.out.println("do step by step testing");
	}
	void regression()
	{
		System.out.println("regression testing");
	}
	

	public static void main(String[] args) {
		test();
		P9_Inexm G = new P9_Inexm();
		G.build();
		G.regression();
		G.sanity();
		G.smoke();
		G.validcred();
		
		
	}
	@Override
	public void build() {
		System.out.println("test the build is correctly getting load or not");
	}
	@Override
	public void validcred() {
		System.out.println("validate the credentials");
		
	}
	@Override
	public void smoke() {
		// TODO Auto-generated method stub
		System.out.println("do smoke testing all the needy button and links should be clickable");

	}
	@Override
	public void sanity() {
		// TODO Auto-generated method stub
		System.out.println("test the sanity");

	}

}
