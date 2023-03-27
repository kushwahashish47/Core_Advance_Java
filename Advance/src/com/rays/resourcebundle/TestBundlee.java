package com.rays.resourcebundle;

import java.util.ResourceBundle;

public class TestBundlee {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("com.rays.resourcebundle.app");
		String value = rb.getString("greeting");
		
		System.out.println(value);
		System.out.println(rb.getString("greeting"));   
		
		System.out.println(rb.getString("url"));
		System.out.println(rb.getString("driver"));
		System.out.println(rb.getString("username"));
		System.out.println(rb.getString("password"));
	}
}
