package telran.fibonacci.controller;

import telran.fibonacci.model.Fibonacci;

public class FibonacciAppl {

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci(8);
		int res = 0;
		for (Integer num : fibonacci) {
			res += num;
			System.out.println(num);
		}
		// TODO print sum of all numbers 1,1,2,3,5,8,13,21 = 54
		System.out.println(res);
	}

}
