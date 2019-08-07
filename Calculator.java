package com.maiya.calculator;

public class Calculator {
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double result;

	public Calculator() {}
	
	public Calculator(double operandOne, String operation, double operandTwo) {
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
		this.operation = operation;
	}

	public void setOperandOne(double d) {
		this.operandOne = d;
	}

	public void setOperation(String string) {
		this.operation = string;
	}

	public void setOperandTwo(double d) {
		this.operandTwo = d;
	}

	public void performOperation() {
		switch (this.operation) {
		case "+":
			this.result = this.operandOne + this.operandTwo;
			break;
		case "-":
			this.result = this.operandOne - this.operandTwo;
			break;
		case "*":
			this.result = this.operandOne * this.operandTwo;
			break;
		case "/":
			this.result = this.operandOne / this.operandTwo;
			break;

		default:
			break;
		}
	}

	public void getResults() {
		System.out.println(this.result);
	}

}
