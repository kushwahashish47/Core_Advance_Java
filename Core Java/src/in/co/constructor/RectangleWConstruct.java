package in.co.constructor;

public class RectangleWConstruct {
	
	private int length;
	private int width;
	//private double area;
	
	public RectangleWConstruct() {
	System.out.println("Default C ");
    }
	public RectangleWConstruct (int length ,int width) {
	this.length=length;
	this.width = width;
}
	public int getLength() {
	return length;
}
	public int getWidth() {
		return width;
}
	public double area () {
    double area = getLength()*getWidth();
    return area;
	}
	
}
