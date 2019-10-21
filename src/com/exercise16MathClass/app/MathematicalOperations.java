package com.exercise16MathClass.app;
import java.lang.Math;
import java.util.Scanner;
public class MathematicalOperations {

	public static void main(String[] args)
	{
		double number = 3.5;
		double number2 = 5.5;
		double num=0;
		Scanner input = new Scanner(System.in);
		System.out.println(" e value"+Math.E);
		System.out.println(" pivalue"+Math.PI);
		System.out.println(" absulute value "+Math.abs(-2.15));
		System.out.println("the cube root of 27 is "+Math.cbrt(27));
		System.out.println("the round 0f 3.76 "+Math.round(3.76));
		System.out.println("the rond ceil of 3.76"+Math.ceil(3.76));
		System.out.println("the round foolr of 3.76   "+Math.floor(3.76));
		System.out.println("increment of 5 "+Math.incrementExact(5));
		System.out.println("decrement of 5 "+Math.decrementExact(5));
		System.out.println("power value of 3 is "+Math.exp(3));
		System.out.println(String.format("which is bigger? %.2f or %.4f: %.3f",number, number2, Math.max(number, number2)));
		System.out.println(String.format("which is smaller? %.2f or %.4f: %.3f",number, number2, Math.min(number, number2)));
		System.out.println("sin of 0 degrees is "+Math.sin(0));
		System.out.println("sin of PI/2 degrees is "+Math.sin(Math.PI/2));
		System.out.println("cos of 0 degrees is "+Math.cos(0));
		System.out.println("cos of PI/2 degrees is "+Math.cos(Math.PI/2));
		//System.out.println("input a number");
		//num = input.nextDouble();
		
		for (int i=0;i<5;i++)
		{
			System.out.println("input a number");
			num = input.nextDouble();
			System.out.println(" the square of "+num+"is "+Math.pow(num, 2));
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
