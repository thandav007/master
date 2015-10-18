package com.aaa.service;

public class Main {
	
	public static void main(String[] args){
		
		System.out.println("WELCOME");
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();
	}
	
	public static void displayGreeting(){
		
		System.out.println("HELLO DER");
		System.out.println("THIS APP SHOWS SALES DATA");
	}

}
