package oopmh;

public class SubCarClass extends CarClass {

	private float chargeINB;
	private String color;
	public SubCarClass() {
		super();
	}
	
	public  SubCarClass(String manu ,String model, String key, int CC, float fuel, float charge, String color) {
		super(manu, model, key, CC, fuel);
		chargeINB=charge;
		this.color=color;
	}
	
	public  SubCarClass(String manu ,String model, String key, int CC, float fuel,int manufacturerYear, float charge, String color) {
		super(manu, model, key, CC, fuel, manufacturerYear);
		chargeINB=charge;
		this.color=color;
	}
	
	public float getChargeINB() {
		return chargeINB;
	}
	public void setChargeINB(float chargeINB) {
		this.chargeINB = chargeINB;
	}
	public String getColor() {
		return color;
	}
	
	public void printinfo() {
		super.printinfo();
		System.out.println("Charge in Battery :"+getChargeINB());
		System.out.println("Color of Car :"+getColor());
	}
	
}
