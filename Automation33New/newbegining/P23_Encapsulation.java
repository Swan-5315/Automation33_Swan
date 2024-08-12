package newbegining;

class Authrntication
{
	private String username="contact@testing.com";
	public String get_username()
	{
		return username;
	}
	public void set_username(String username)
	{
		this.username=username;
	}	
	private String password="uhiuhku";
	public String get_password() {
		return password;
	}
	public void set_password(String password) {
		this.password = password;
	}
	
	private int age = 67;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class P23_Encapsulation {
	public static void main(String[] args) {
		Authrntication a1 = new Authrntication();
		a1.set_username("swanand@testing.com");
		System.out.println(a1.get_username());
		a1.set_password("swanand");
		System.out.println(a1.get_password());
		a1.setAge(34);
		System.out.println(a1.getAge());
	}

}
