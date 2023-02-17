package in.co.inheritance;

public class Triangle {
	private int base;
	private int height;
//	private double area;
	
	public void setBase(int base) {
		this.base = base;	
	}
	public int getBase() {
		return base;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	public double area() {
		 double area = 0.5 * getBase()*getHeight();
		return area;
	}
}
