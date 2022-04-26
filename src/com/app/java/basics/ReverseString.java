package com.app.java.basics;

public class ReverseString {
	public static void main(String... args) {
		String originalString = "abcde";

		System.out.println("Original String: " + originalString);
		System.out.println("Reversed String: " + reverseString(originalString));
	}

	public static String reverseString(String originalString) {
		char ar[] = originalString.toCharArray();
		char temp;
		for (int i = 0, j = ar.length - 1; i < (ar.length / 2); i++, j--) {
			temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
		}
		return new String(ar);
	}

	public static String reverseAString(String s){
		char c[] = s.toCharArray();
		char temp;
		for (int i = 0; i <c.length/2 ; i++) {

			temp=c[i];
			c[i]=c[c.length-1-i];
			c[c.length-1-i] = temp;
		}
		return new String(c);
	}
}