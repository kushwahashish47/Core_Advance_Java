package in.co.practice;

public class StringBuffer1 {
	
	public static void main(String[]args) {
		StringBuffer sb = new StringBuffer("Vijay");
		sb.append("Dinanathchouhan");
		System.out.println("Length :" +sb.length());
		System.out.println("Capacity : "+ sb.capacity());
		System.out.println("Char at: " + sb.charAt(6));
		System.out.println("Index of "+ sb.indexOf("h"));
		System.out.println("Replace : " +sb.replace(0, 2, "v"));
		System.out.println("Reverse :" + sb.reverse() );
		
		
		
		
	}
	

}
