package in.co.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class P2 {
	public static void main(String[] args) {
		
		String[] players = {"dhoni","rahane","ashwin"};
		
		
		
		System.out.println(players);//withot tostring
		
		String st = Arrays.toString(players);
		System.out.println(st);
		
		
		Arrays.sort(players);
		System.out.println(players);
		
		String str = Arrays.toString(players);
		System.out.println(str);

		Collection<String> l = Arrays.asList(players);
		System.out.println(l);
	}

}
