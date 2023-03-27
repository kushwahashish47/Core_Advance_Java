package com.rays.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class Testhindi {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("com.rays.resourcebundle.app_hindi");
		ResourceBundle rba = ResourceBundle.getBundle("com.rays.resourcebundle.app",new Locale("hindi"));
		
		System.out.println(rb.getString("greeting"));
		System.out.println(rba.getString("greeting"));      // second way
		
	}
}
