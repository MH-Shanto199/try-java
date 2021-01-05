package moreObject;

import oopmh.CarClass;

public class AnotherSubCar extends CarClass implements CarInterFace {

	public AnotherSubCar() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	
	public AnotherSubCar(String carName) {
		super(carName);
	}
	
	public AnotherSubCar(String manu,String model,String key,int engineCC,float fuel) {
		super(manu, model, key, engineCC, fuel);
	}
	
	public  AnotherSubCar(String manu,String model,String key,int engineCC,float fuel,int manufacturerYear ) {
		this(manu, model, key, engineCC, fuel);
		this.manufacturerYear=manufacturerYear;
	}
	
	@Override
	public void driveCar(int drivInSec) {
		// TODO Auto-generated method stub
		runFsec(drivInSec);
	}


	@Override
	public void addfuelAmount(float amount) {
		// TODO Auto-generated method stub
		addfuel(amount);
	}
	
	@Override
	public int getMenuFYear() {
		// TODO Auto-generated method stub
		return manufacturerYear;
	}

	@Override
	public String getCarModelName() {
		// TODO Auto-generated method stub
		return getModelNm();
	}

	
}
