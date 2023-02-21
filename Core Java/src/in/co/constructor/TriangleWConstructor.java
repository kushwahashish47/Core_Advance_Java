package in.co.constructor;

public class TriangleWConstructor {
	private int base;
	private int height;
	private double area;
	
	public TriangleWConstructor() {
		 System.out.println("Dafault constructor");
	}
	public void TriangleWConstrutor(int base , int height) {
		this.base = base;
		this.height = height;	
	}
	public int getHeight() {
		return height; 
	}
	public int getBase () {
		return base;
	}
	public  double area() {
		area =  0.5*getBase()*getHeight();
		return area;
	}
}
