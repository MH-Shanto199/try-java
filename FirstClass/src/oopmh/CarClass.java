package oopmh;

public class CarClass {
	
	//public variables
	public String manufacturerName;
	
	//private variables
	private String modelName;
	private String carkeyVal;
	private float fuelAmount;
	final private float fcps=0.02f;
	
	// default variables
	int engineCC;
	
	//protected
	protected int manufacturerYear; 
	
	public CarClass() {
		// TODO Auto-generated constructor stub
		manufacturerName=new String();
		modelName=new String();
		engineCC=0;
		fuelAmount=0;
		manufacturerYear=0;
	}
	
	public CarClass(String carName) {
		manufacturerName=new String(carName);
		modelName=new String();
		engineCC=0;
		fuelAmount=0;
		manufacturerYear=0;
	}
	
	public CarClass(String manu,String model,String key,int engineCC,float fuel) {
		manufacturerName=manu;
		modelName=model;
		carkeyVal=key;
		this.engineCC=engineCC;
		fuelAmount=fuel;
		manufacturerYear=0;
	}
	
	public  CarClass(String manu,String model,String key,int engineCC,float fuel,int manufacturerYear ) {
		this(manu, model, key, engineCC, fuel);
		this.manufacturerYear=manufacturerYear;
	}
	
	public float amountOfFuel() {
		return fuelAmount;
	}
	
	public String getmanufacturerName() {
		return manufacturerName;
	}
	
	public String getModelNm() {
		return modelName;
	}
	
	public void addfuel(float fuelAmount) {
		this.fuelAmount+=fuelAmount;
	}
	
	public void runFsec(int timeINsec) {
		float usedFuel=timeINsec*fcps;
		fuelAmount-=usedFuel;
	}
	
	public boolean matchPassword(String userInput) {
		return userInput.equals(carkeyVal); 
	}
	public void printinfo() {
		System.out.println("Manufacturer :"+manufacturerName);
		System.out.println("Model Name :"+getModelNm());
		System.out.println("Car Engine CC  :"+engineCC);
		System.out.println("Password Match :"+matchPassword("asdfas"));
		System.out.println("Amount of fuel  :"+amountOfFuel()+"L");
		addfuel(2);
		System.out.println("Amount of fuel after adding 2L :"+amountOfFuel()+"L");
		runFsec(60);
		System.out.println("Amount of fuel after Driving 60sec :"+amountOfFuel()+"L");
	}

}
