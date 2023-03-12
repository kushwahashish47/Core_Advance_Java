package in.co.threads;

public class TestHelloThread {
	public static void main(String[] args) {
		
		HelloThread t1 = new HelloThread("Gopal");
		HelloThread t2 = new HelloThread("Shyam");
	

	  t1.start();
	  t2.start();											          //check the output is desired or not 
	  for(int j = 0;j<50;j++) {											// compare w previous case
		  System.out.println("main");
	  }
	}
}
