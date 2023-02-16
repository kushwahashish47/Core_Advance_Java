package in.co.inheritance;

public class ShapeeCall {
	public static void main(String[] args) {
		Shapee S1 = new Shapee();
		Shapee S2 = new Shapee("white", 150);
	
	System.out.println(S2.getColor());
	System.out.println(S2.getBorderWidth());
	}	


}
