package com.example.demo.util;

import org.springframework.stereotype.Service;

@Service
public class Calc {

	public int add(int num1,int num2) {
		return num1 + num2;
	}
	
	public int subtraction(int num1,int num2) {
		return num1 - num2;
	}
	
	public int Multiplication(int num1,int num2) {
		return num1 * num2;
	}
	
	public int Division(int num1,int num2) {
		return num1 / num2;
	}
}
