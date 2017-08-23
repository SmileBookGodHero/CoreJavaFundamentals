package com.lilei1998.environment;

/**
  *@version 2017-06-20
  *@author lilei
  */

public class Welcome {
	public static void main(String[] args) {
		String greeting = "Welcome to core Java!";
		System.out.println(greeting);
		for (int i = 0; i < greeting.length(); i++) {
			System.out.print("=");
		}
		System.out.println();
	}
}