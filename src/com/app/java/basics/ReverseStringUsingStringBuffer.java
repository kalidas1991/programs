package com.app.java.basics;

public class ReverseStringUsingStringBuffer {
	public static void main(String... args) {
		String originalString = "abcde";
		StringBuffer sb = new StringBuffer(originalString);

		System.out.println("Original String: " + originalString);
		System.out.println("Reversed String: " + sb.reverse());
	}
}