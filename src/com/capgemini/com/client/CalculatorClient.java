package com.capgemini.com.client;

import com.capgemini.lamda.model.Calculator;

public interface CalculatorClient {
	public static void main(String[] args) {
		
		Calculator addition= (x,y) ->x+y;
				System.out.println(addition.calculate(23,32));
		Calculator subtraction=(x,y) -> x-y;
				System.out.println(subtraction.calculate(23,32));
		
	}

}
