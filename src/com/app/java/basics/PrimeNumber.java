package com.app.java.basics;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 11;
		System.out.println(isPrimeNumber(n) ? n + " is prime number." : n + " is not prime number.");
		n = 12;
		System.out.println(isPrimeNumber(n) ? n + " is prime number." : n + " is not prime number.");
		n = 13;
		System.out.println(isPrimeNumber(n) ? n + " is prime number." : n + " is not prime number.");
		n = 14;
		System.out.println(isPrimeNumber(n) ? n + " is prime number." : n + " is not prime number.");
	}

	public static boolean isPrimeNumber(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
		public static boolean checkPrime(int n){
		//edge case
		if(n<=1) {
			return false;
		}
		//2 is the only even prime number
		for (int i = 2; i <Math.sqrt(n) ; i++) {
			if(n%i==0)
				return false;
		}
		//return success
		return true;
	}
}
