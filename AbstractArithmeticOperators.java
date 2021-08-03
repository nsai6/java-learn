package com.oper;


public abstract class AbstractArithmeticOperators implements ArithmeticOperators{
	
	//abstract double add(double a, double b);
	
	//float
	public float add(float a, float b){
		return a+b;
	}
	
	public float sub(float a, float b){
		return a-b;
	}
	
	public float mul(float a,float b){
		return a*b;
	}
	
	public float div(float a,float b){
		return a/b;
	}
	
	public float mod(float a,float b){
		return a%b;
	}
	
	
	
}