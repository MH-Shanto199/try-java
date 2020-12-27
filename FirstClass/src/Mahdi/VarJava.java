package Mahdi;

import java.util.Scanner;

public class VarJava {
	
	static Scanner myScanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Please give us a number to be multiplied by 1000");
		num = myScanner.nextInt();
		int result=multiplied(num);
		System.out.println(result);
		
	}
	static public int multiplied(int firstval) {
		firstval*=100;
		return firstval;
	}
}
