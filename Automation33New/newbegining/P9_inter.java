package newbegining;
interface Login
{
	void username();
	void password();
}

public class P9_inter implements Login {
	
	static void go_button()
	{
		System.out.println("click go to");
	}

	void submt()
	{
		System.out.println("click submit button");
	}
	public static void main(String[] args) {
		go_button();
		P9_inter Z = new P9_inter();
		Z.username();
		Z.password();
		Z.submt();
		
		
	}

	@Override
	public void username() {

		System.out.println("type a valid username");
	}

	@Override
	public void password() {

		System.out.println("type a valid password");

	}

}
