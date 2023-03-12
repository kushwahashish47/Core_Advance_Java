package in.co.threads;

public class TestHelloWThread {

	public static void main(String[] args) {
		HelloWThread h1 =new HelloWThread("Gopal");
		HelloWThread h2 =new HelloWThread("Ram");
		h1.run();
		h2.run();
	
	}
}
