package com.oper;

import com.oper.ArithmeticOperatorsImpl;
import com.oper.ArithmeticOperators;
import com.oper.AbstractArithmeticOperators;

class TestArithmeticOperators{
	public static void main(String args[]){
		
		//created object assign to interface class
		ArithmeticOperators ao = new ArithmeticOperatorsImpl();
		
		//created object assign to abstract class
		AbstractArithmeticOperators ao1 = new ArithmeticOperatorsImpl();
		
		//created object assign to impl class
		ArithmeticOperatorsImpl ao2 = new ArithmeticOperatorsImpl();
		
		byte b1 = 127;
		byte b2 = 2;
		
		System.out.println("The Byte addtion results is "+(byte) ao2.add(b1, b2));
		System.out.println("The Byte substraction results is "+(byte) ao2.sub(b1, b2));
		System.out.println("The Byte multiplication results is "+(byte) ao2.mul(b1, b2));
		System.out.println("The Byte devision results is "+(byte) ao2.div(b1, b2));
		System.out.println("The Byte modulis results is "+(byte) ao2.mod(b1, b2));
		
		
		short s1 = 56;
		short s2 = 56;
		
		System.out.println("The short addtion results is "+(short) ao2.add(s1, s2));
		System.out.println("The short substraction results is "+(short) ao2.sub(s1, s2));
		System.out.println("The short multiplication results is "+(short) ao2.mul(s1, s2));
		System.out.println("The shortdevision results is "+(short) ao2.div(s1, s2));
		System.out.println("The short modulis results is "+(short) ao2.mod(s1, s2));
		
		int i1=30;
		int i2=40;
		
		System.out.println("The int addtion results is "+ao2.add(i1, i2));
		System.out.println("The int substraction results is "+ao2.sub(i1, i2));
		System.out.println("The int multiplication results is "+ao2.mul(i1, i2));
		System.out.println("The int devision results is "+ao2.div(i1, i2));
		System.out.println("The int modulis results is "+ao2.mod(i1, i2));
		
		
		
		float f1=50.50f;
		float f2=60.20f;
		
		System.out.println("The float addtion results is "+(float) ao2.add(f1, f2));
		System.out.println("The float substraction results is "+(float) ao2.sub(f1, f2));
		System.out.println("The float multiplication results is "+(float) ao2.mul(f1, f2));
		System.out.println("The float devision results is "+(float) ao2.div(f1, f2));
		System.out.println("The float modulis results is "+(float) ao2.mod(f1, f2));
		

		
		System.out.println("The double addtion results is "+ao2.add(30.000, 56.900));
		System.out.println("The double substraction results is "+ao2.sub(30.000, 56.900));
		System.out.println("The double multiplication results is "+ao2.mul(30.000, 56.900));
		System.out.println("The double devision results is "+ao2.div(30.000, 56.900));
		System.out.println("The double modulis results is "+ao2.mod(30.000, 56.900));
		
	}
}