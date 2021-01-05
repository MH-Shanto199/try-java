package oopmh;

public class LearnObject {

	static private CarClass ourCar;
	static private  CarClass ourAnotherCar;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarClass thirdCarClass=new CarClass("MAZDA", "Axela", "hfhf", 1500, 20);
		SubCarClass ourSubCar=new SubCarClass("BMW", "7 Series", "gfgf", 3000, 25, 10, "gray");
		ourAnotherCar=new CarClass("Toyota", "Allion", "wasd", 1500, 30);
		ourCar=new CarClass("Honda", "Honda Accord" , "hnmh", 2500, 40);
		
//		ourcar print 
		ourCar.printinfo();
//		ourcar print 
		
		System.out.println("\n");
		System.out.println("\n");
		
//		Another car print 
		ourAnotherCar.printinfo();
//		Another car print 
		
		System.out.println("\n");
		System.out.println("\n");
		
//		third car ptint
		thirdCarClass.printinfo();
//		third car ptint

		System.out.println("\n");
		System.out.println("\n");
		
//		SubCarClass carClass class
		ourSubCar.printinfo();
//		SubCarClass carClass class
		
		
	}

}
