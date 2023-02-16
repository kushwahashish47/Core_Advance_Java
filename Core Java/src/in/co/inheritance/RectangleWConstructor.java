package in.co.inheritance;

public class RectangleWConstructor {
	private int length;
	
	public RectangleWConstructor() {
	System.out.println("Def");
    }

public RectangleWConstructor (int length) {
	this.length=length;
}
public int getLength() {
	return length;
}
}
