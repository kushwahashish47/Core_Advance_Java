package in.co.oop;

public class AutomobileCall {
public static void main(String[] args) {
	Automobile a= new Automobile();
	a.setColor("White");
	a.setMake("Land Rover");
	a.setSpeed(300);
	System.out.println(a.getMake());
	System.out.println(a.getColor());
	System.out.println(a.getSpeed());
}
}
