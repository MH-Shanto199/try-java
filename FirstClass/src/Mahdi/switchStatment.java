package Mahdi;

import java.util.Scanner;

public class switchStatment {
	
	static Scanner myScanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prln("what is your name :");
		String myName=myScanner.nextLine();
		int lnth=myName.length();
		switch (lnth) {
			case 9:
				prln(" Welcome sir");
				break;
			case 8:
				prln(myName+" you are not the right person to enter");
				break;
			default:
				prln(myName+" Thank you !!!");
				break;
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
