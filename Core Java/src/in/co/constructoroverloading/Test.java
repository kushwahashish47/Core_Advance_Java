

package in.co.constructoroverloading;

public class Test {
	public static void main(String[] args) {           // output is not clear, do it
		
	
		Person p =  new Person();
		Person p1 = new Person("ak","gk");	
		Person p2 = new Person("sf","jk","indore");
		
		System.out.println(p);
		System.out.println(p1.getName());
		System.out.println(p2);    
}
}