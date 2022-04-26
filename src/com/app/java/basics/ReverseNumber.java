package com.app.java.basics;

public class ReverseNumber {
	public static void main(String... args) {
		int number = 12345;
		System.out.println("Original number: " + number);
		System.out.println("Reversed number: " + reverseNumber(number));
	}

	public static int reverseNumber(int number) {
		int reverse = 0;
		int remainder;

		while (number > 0) {
			remainder = number % 10;
			number = number / 10;
			reverse = reverse * 10 + remainder;
		}
		return reverse;
	}

	public static long  reverseANumber(long number){

		if(number<0){
			return 0;
		}
		int rem=0;
		long result=0;
		while(number>0){
			long n = number%10;
			result=result*10+n;
			number/=10;
		}
		return result;
	}

}
