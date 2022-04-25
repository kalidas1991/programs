package com.app.java.basics;

public class FibonacciSeries {
	public static void main(String[] args) {

		int n = 10;
		generateFibonacciSeries(n);
	}

	public static void generateFibonacciSeries(int n) {
		int first = 0; // first number of series
		int second = 1; // second number of series
		int result;

		System.out.print("FibonacciSeries: " + first + " " + second + " ");
		for (int i = 0; i < n; i++) {
			result = first + second;
			first = second;
			second = result;
			System.out.print(result + " ");
		}
	}
}
