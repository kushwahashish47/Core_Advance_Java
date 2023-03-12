package in.co.abstraction;

public class TestAbstr {
public static void main(String[] args) {
	
	RectAbstrChildCircle a = new RectAbstrChildCircle(); //can't make object of parent class when it is abstract,
																	// so we made child class object.
	a.setLength(40);
	a.setWidth(10);

	System.out.println(a.getlength());
	System.out.println(a.getWidth());
	System.out.println(a.area());
	
}
		
}
