package Mahdi;

import java.util.Scanner;

public class condition {
	
	static Scanner myScanner=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prln("what is your name :");
		String myName=myScanner.nextLine();
		int lnth=myName.length();
		if(lnth<9) {
			prln(myName+" This name is not a good name");
		}else if(lnth>9) {
			prln(myName+" This name is too long");
		}else {
			prln(myName+" You are a lucky person");
		}
		
	}
	
	
//	created method
	static void prln(Object anyObject) {
		System.out.println(anyObject);
	}
	static void pr(Object anyObject) {
		System.out.print(anyObject);
	}
}
