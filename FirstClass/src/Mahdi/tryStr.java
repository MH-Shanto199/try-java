package Mahdi;

import java.util.Scanner;

public class tryStr {
	
	static Scanner myScanner=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prln("what is your name :");
		String myName=myScanner.nextLine();
		
		prln("The number of characters in your name is "+myName.length());
	}
	
	
//	created method
	static void prln(Object anyObject) {
		System.out.println(anyObject);
	}
	static void pr(Object anyObject) {
		System.out.print(anyObject);
	}
}
