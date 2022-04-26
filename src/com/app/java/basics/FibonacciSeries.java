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

	public static void printFibonacciSeries(int n){
		if(n==0)
			System.out.println(n);
		int first  = 0;
		int second = 1;
		int result ;
		System.out.print(first+" "+second+" ");
		for (int i = 0; i < n; i++) {

			result=first+second;
			first=second;
			second=result;
			System.out.print(result+" ");
		}

	}
}
