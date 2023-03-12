package in.co.java8;

 public interface DefaultNStaticmethod {
	 
	public default void dMethod() {
		System.out.println("Default Method");
	}
	public static void sMethod() {
		System.out.println("i am static ");
	}
	}