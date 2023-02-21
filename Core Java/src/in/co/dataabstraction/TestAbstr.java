package in.co.dataabstraction;

public class TestAbstr {
public static void main(String[] args) {
	
	
	
	RectAbstrChildCircle a = new RectAbstrChildCircle();
	a.setLength(40);
	a.setWidth(10);
	a.area();
	System.out.println(a.getlength());
	System.out.println(a.getWidth());
	System.out.println(a.area());
	
}
		
}
