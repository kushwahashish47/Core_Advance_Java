package in.co.inheritance;

public class Test extends Rectangle{
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setLength(150);
		r.setWidth(100);
		
		System.out.println("area is: " + r.area());
			
	}
	

}
