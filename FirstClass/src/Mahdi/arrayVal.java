package Mahdi;

import java.util.Scanner;

public class arrayVal {

	static Scanner myScanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] towDArr=new int[2][4];
		prln("please give your input: ");
		for (int row = 0; row < 2; row++) {
			for (int column = 0; column < 4; column++) {
				pr("towDArr["+row+"]["+column+"] :");
				towDArr[row][column]=myScanner.nextInt();
			}
		}
		for (int row = 0; row < 2; row++) {
			for (int column = 0; column < 4; column++) {
				pr(towDArr[row][column]+"\t");
			}
			prln("\t");
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
