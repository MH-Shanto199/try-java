package moreObject;

import oopmh.*;

public class Object2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarClass aCar=new CarClass("MITSUBISHI", "lancer", "poiu", 2500, 15, 2013);
		SubCarClass aSubCar=new SubCarClass("NISSAN", "350z", "zsxc", 4000, 30, 2011, 12, "Red");
		AnotherSubCar carObject=new AnotherSubCar("PORSCHE", "CareeraGT", "nh12g", 4000, 40, 2012);
		aSubCar.printinfo();

		System.out.println("\n");
		System.out.println("\n");
		
		aCar.printinfo();

		System.out.println("\n");
		System.out.println("\n");
		
		carObject.printinfo();

		System.out.println("\n");
		System.out.println("\n");
	}

}
