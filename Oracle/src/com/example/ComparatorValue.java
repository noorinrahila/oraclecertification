package com.example;

public class ComparatorValue {
	public static void main(String[] args) {
		int x=0;
		while(x++< 10){
			System.out.println(x);
		}
		String message = x > 10 ? "greater than":"false";
		System.out.println(message+","+x);
	}

}
