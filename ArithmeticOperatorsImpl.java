package com.oper;

public class ArithmeticOperatorsImpl extends AbstractArithmeticOperators implements ArithmeticOperators{
	//byte
	public byte add(byte a, byte b){
		return (byte) (a + b);
	}
	
	public byte sub(byte a, byte b){
		return (byte)(a-b);
	}
	
	public byte mul(byte a,byte b){
		return (byte)(a*b);
	}
	
	public byte div(byte a,byte b){
		return (byte)(a/b);
	}
	
	public byte mod(byte a,byte b){
		return (byte)(a%b);
	}
	
	//short
	public short add(short a , short b){
		return (short) (a+b);
	}
	
	public short sub(short a, short b){
		return (short)(a-b);
	}
	
	public short mul(short a,short b){
		return (short)(a*b);
	}
	
	public short div(short a,short b){
		return (short)(a/b);
	}
	
	public short mod(short a,short b){
		return (short)(a%b);
	}
	
	
	//int
	public int add(int a , int b){
		return a+b;
	}
	
	public int sub(int a, int b){
		return a-b;
	}
	
	public int mul(int a,int b){
		return a*b;
	}
	
	public int div(int a,int b){
		return a/b;
	}
	
	public int mod(int a,int b){
		return a%b;
	}
	
	//double
	public double add(double a, double b){
		return a+b;
	}
	
	
	public double sub(double a, double b){
		return a-b;
	}
	
	public double mul(double a,double b){
		return a*b;
	}
	
	public double div(double a,double b){
		return a/b;
	}
	
	public double mod(double a,double b){
		return a%b;
	}
	
	
}