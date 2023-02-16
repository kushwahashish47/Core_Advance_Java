package in.co.inheritance;

public class Rectangle {
	private int length;
	private int width;
	private int area;
	
	
	public void setLength(int length) {
	this.length = length;
	}
	
	public int getlength(){
		return length;
	}
	public int width() {
		return width;
	}
	public int area () {
		area = length*width;
		return area;
	}
}
