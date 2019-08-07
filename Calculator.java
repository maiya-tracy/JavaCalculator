package com.maiya.calculator;

public class Calculator {
	private Double operandOne;
	private Double operandTwo;
	private String operation;
	private Double result;

	public Calculator() {
	}

	public Calculator(Double operandOne, String operation, Double operandTwo) {
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
		this.operation = operation;
	}

	public void performOperation(Double d) {
		if (this.operandOne == null) {
			this.operandOne = d;
		} else {
			this.operandTwo = d;
			this.operandOne = this.calculate(this.operandOne, this.operation, this.operandTwo);
			this.result = this.operandOne;
			this.operandTwo = null;
			this.operation = null;
		}
	}

	public void performOperation(String entry) {
		if (entry == "=") {
			if (this.operandOne != null) {
				if (this.operandTwo != null && this.operation != null) {
					this.result = this.calculate(this.operandOne, this.operation, this.operandTwo);
					
					this.operandOne = null;
					this.operandTwo = null;
					this.operation = null;
				}

			} else {
				this.result = this.operandOne;
			}
		} else {
			this.operation = entry;
		}
	}

	private Double calculate(Double Op1, String Op, Double Op2) {
		Double result = null;
		switch (Op) {
		case "+":
			result = Op1 + Op2;
			break;
		case "-":
			result = Op1 - Op2;
			break;
		case "*":
			result = Op1 * Op2;
			break;
		case "/":
			result = Op1 / Op2;
			break;

		default:
			break;
		}
		return result;
	}

	public void getResults() {
		System.out.println(this.result);
	}

}
