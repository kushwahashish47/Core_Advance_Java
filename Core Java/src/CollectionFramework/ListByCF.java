package CollectionFramework;

import java.util.ArrayList;

public class ListByCF {
	public static void main(String[] args) {
		ArrayList names = new ArrayList();
		for(int i = 1;i<=10;i++) {
			names.add("No =" +i);
		}
	 System.out.println("Names : "+ names.size());
	 Object o = names.get(4);
	 String name =(String)o;
	 //String name = (String)names.get(0);
	System.out.println("First name is = "+ name);
	 
	 
	

	}

}
