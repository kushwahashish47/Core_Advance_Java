package in.co.practice;

import java.util.Random;

public class RandomNumber {
	public static void main(String[]args)
	{
   //System.out.println("Random Number : " + Math.random()*100);	
   //}                                         2nd method described below. (Both method can't run simultaneously here)
		
		Random r=new Random(); 						 //click on both random word ,u will get something.
		int k =r.nextInt(10);
		for(int i=0; i<=r.nextInt();i++) {
			System.out.println(i);
		}
}}