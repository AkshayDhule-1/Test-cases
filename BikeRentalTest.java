public class BikeRentalTest {
	public static void main(String[] args) {
		
		Engine engine = new Engine("4Cylinger","Petrol",600,true);	
		Gear gear = new Gear(5, "1Up4Down");
		Brake brake = new Brake("Hydraullic",true);
			
		Bike bike = new Bike("Kawasaki Ninja","SuperBike",50,60,1,engine,gear,brake);
		
		
		float totalRent = bike.rent();
		
		System.out.println("Total Rent is "+totalRent);
	}
}


class Vehicle{
	
}

class Bike extends Vehicle
{ //Bike is A vehicle
	
	String bikeName;
	String bikeType;//SuperBike ot Normal bike
	int kmTravel;
	int usedTime;
	int fuelUsed;
	
	Engine engine;	//Bike HasA engine
	Gear gear;
	Brake brake;
	
	
	
	public Bike(String bikeName, String bikeType, int kmTravel, int usedTime, int fuelUsed, Engine engine, Gear gear,
			Brake brake) {
		super();
		this.bikeName = bikeName;
		this.bikeType = bikeType;
		this.kmTravel = kmTravel;
		this.usedTime = usedTime;
		this.fuelUsed = fuelUsed;
		this.engine = engine;
		this.gear = gear;
		this.brake = brake;
	}


	@Override
	public String toString() {
		return "Bike [bikeName=" + bikeName + ", bikeType=" + bikeType + ", kmTravel=" + kmTravel + ", usedTime="
				+ usedTime + ", fuelUsed=" + fuelUsed + ", engine=" + engine + ", gear=" + gear + ", Brake=" + brake
				+ "]";
	}
	
	
	float rent() {
		int totalFare =0;
		
//		totalFare = 
		if(bikeType=="Superbike") {
			totalFare = totalFare + 50;
		}
		
		totalFare = totalFare + (2 * usedTime) + (20* kmTravel) + (fuelUsed * 20) ;

		
		return totalFare;
	}
	
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public String getBikeType() {
		return bikeType;
	}
	public void setBikeType(String bikeType) {
		this.bikeType = bikeType;
	}
	public int getKmTravel() {
		return kmTravel;
	}
	public void setKmTravel(int kmTravel) {
		this.kmTravel = kmTravel;
	}
	public int getUsedTime() {
		return usedTime;
	}
	public void setUsedTime(int usedTime) {
		this.usedTime = usedTime;
	}
	public int getFuelUsed() {
		return fuelUsed;
	}
	public void setFuelUsed(int fuelUsed) {
		this.fuelUsed = fuelUsed;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Gear getGear() {
		return gear;
	}
	public void setGear(Gear gear) {
		this.gear = gear;
	}
	public Brake get_break() {
		return brake;
	}
	public void set_break(Brake brake) {
		this.brake = brake;
	}
	
	
	
}

class Engine {
	String engineType; // v2, V4, single Cylinder, 2 Cylinder
	String fuelType; //Petrol or Diesel
	int engineSize; // in CC
	boolean isLiquidCool;
	
	
	
	public Engine(String engineType, String fuelType, int engineSize, boolean isLiquidCool) {
		super();
		this.engineType = engineType;
		this.fuelType = fuelType;
		this.engineSize = engineSize;
		this.isLiquidCool = isLiquidCool;
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", fuelType=" + fuelType + ", engineSize=" + engineSize
				+ ", isLiquidCool=" + isLiquidCool + "]";
	}
	
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}
	public boolean isLiquidCool() {
		return isLiquidCool;
	}
	public void setLiquidCool(boolean isLiquidCool) {
		this.isLiquidCool = isLiquidCool;
	}
	
	
	
}

class Brake{
	String brakeType;// Power, Hyudrollic
	boolean isABSAvailable;
	
	
	
	public Brake(String brakeType, boolean isABSAvailable) {
		super();
		this.brakeType = brakeType;
		this.isABSAvailable = isABSAvailable;
	}
	
	
	@Override
	public String toString() {
		return "Brake [brakeType=" + brakeType + ", isABSAvailable=" + isABSAvailable + "]";
	}
	
	
	
	public String getBrakeType() {
		return brakeType;
	}
	public void setBrakeType(String brakeType) {
		this.brakeType = brakeType;
	}
	public boolean isABSAvailable() {
		return isABSAvailable;
	}
	public void setABSAvailable(boolean isABSAvailable) {
		this.isABSAvailable = isABSAvailable;
	}
	

	
}
class Gear{
	int numberOfGears;//1-5
	String gearType; //1 UP all down, 
	
	
	
	public Gear(int numberOfGears, String gearType) {
		super();
		this.numberOfGears = numberOfGears;
		this.gearType = gearType;
	}


	@Override
	public String toString() {
		return "Gear [numberOfGears=" + numberOfGears + ", gearType=" + gearType + "]";
	}
	
	
	public int getNumberOfGears() {
		return numberOfGears;
	}
	public void setNumberOfGears(int numberOfGears) {
		this.numberOfGears = numberOfGears;
	}
	public String getGearType() {
		return gearType;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	 
}	
