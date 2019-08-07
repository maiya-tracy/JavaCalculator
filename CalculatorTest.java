package com.maiya.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
//		Calculator c = new Calculator();
//		c.setOperandOne(10.5);
//		c.setOperation("+");
//		c.setOperandTwo(5.2);
//		c.performOperation();
//		c.getResults(); //15.7

		Calculator c2 = new Calculator();

		c2.performOperation(10.5);

		c2.performOperation("+");

		c2.performOperation(5.2);

		c2.performOperation("*");

		c2.performOperation(10.0);

		c2.performOperation("=");

		c2.getResults();

//		Calculator c1 = new Calculator(10.5,"-",5.2);
//		c1.performOperation();
//		c1.getResults();

	}

}
