package in.co.inheritance;

public class Circle {
	private static final float PI = 3.14f;
	private int radius;
	//private double area;
	
	public void setRadius(int radius){
		this.radius = radius;
		}
	public int getRadius() {
		return radius;
		
	}
	public double area () {
		 double area = PI*getRadius()*getRadius();
		return area;
	}
}
