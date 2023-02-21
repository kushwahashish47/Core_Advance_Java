package in.co.inheritance;

public class Rectangle extends Circle  {
	private int length;
	private int width;
	private double area;

	public void setLength(int length) {
	this.length = length;
	}
	public int getlength(){
		return length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double area () {
		area = getlength()*getWidth();
		return area;
	}
}
