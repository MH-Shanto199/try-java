package oopmh;

public class CarClass {
	public String manufacturerName;
	private String modelName;
	private String carkeyVal;
	public int engineCC;
	private float fuelAmount;
	final private float fcps=0.02f;
	
	public CarClass() {
		// TODO Auto-generated constructor stub
		manufacturerName=new String();
		modelName=new String();
		engineCC=0;
		fuelAmount=0;
	}
	
	public CarClass(String carName) {
		manufacturerName=new String(carName);
		modelName=new String();
		engineCC=0;
		fuelAmount=0;
	}
	
	public CarClass(String manu,String model,String key,int engineCC,float fuel) {
		manufacturerName=manu;
		modelName=model;
		carkeyVal=key;
		this.engineCC=engineCC;
		fuelAmount=fuel;
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
}
