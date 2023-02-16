package in.co.oop;

public class Automobile {
	private String color;
	private int speed;
	private String make;
	public static final int NO_OF_GEARS= 5 ;
	
	public void setColor(String color) {
		this.color= color;	
	}
	public String getColor() {
		return color;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	
	public void setMake(String make) {
		this.make = make;
	}

	public String getMake() {
		return make;
	}
	
}
