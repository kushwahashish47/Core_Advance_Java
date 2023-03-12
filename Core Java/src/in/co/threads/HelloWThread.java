package in.co.threads;

public class HelloWThread {
	private String name = null;
	
	public HelloWThread(String n) {
		this.name = n;
		
	}
	public void run () {
		for(int i =0;i<500;i++)
		{
			System.out.println(i +name );
		}
	}
}
