package in.co.constructor;

public class ConsOverloading {

	private int length;
	private int width;
	//private double area;
	
	public ConsOverloading() {					//constructor having more than 1 constructor in a class is known as CO
	System.out.println("Default C ");
    }
	public ConsOverloading (int length ,int width) {
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