package in.co.inheritance;

public class Triangle {
	private int base;
	private int height;
	private double area;
	
	public void setBase(int base) {
		this.base = base;	
	}
	public int getBase() {
		return base;
	}
	public int heigth() {
		return height;
	}
	public double area() {
		area = 1/2 * base *height;
		return area;
	}
}
