package basic;

public class HelloWorld {
	
	public void welcomeMessage() {//code changes from dev1
		System.out.println("Hello Everyone, Welcome to DevOps Training!!!");
	}

	public static void main(String[] args) {
		HelloWorld obj = new HelloWorld();
		obj.welcomeMessage();

	}
	
	public void add(int a, int b) {
		int result = a + b;
		System.out.println("sum of two numbers = " + result);
	 }

	//ch1
	//ch2
	
	
	//cc1
	//cc2
	
	//this codes is added in b1 branch
	public void sub(int a, int b) {
		int result = a - b;
		System.out.println("difference of two numbers = " + result);
	 }
}
