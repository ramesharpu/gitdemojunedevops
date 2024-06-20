package basic;

public class HelloWorld {
	
	public void welcomeMessage() {
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

}
