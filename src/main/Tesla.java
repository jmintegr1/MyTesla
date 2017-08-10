
package main;

public class Tesla {
	
	String productLine, autopilot, touchdash; 
	int BatteryPowerRange, speed, tires, Radio;
	
	public Tesla() { 
		productLine = "modelS"; 
		autopilot = "advanced technologies"; 
		touchdash = "Touch screen dashboard";
		BatteryPowerRange = 315;
		speed = 155;
		tires = 4;
		
	}
	
	public Tesla(String productLine, String autopilot, String touchdash) {
		this.productLine = productLine;
		this.autopilot = autopilot;
		
	}

	public Tesla(String productLine, String autopilot, String touchdash, int batteryPowerRange) {
		this.productLine = productLine;
		this.autopilot = autopilot;
		this.touchdash = touchdash;
		BatteryPowerRange = batteryPowerRange;
	}
	// You called this constructor in the Application class
	public Tesla(String productLine, String autopilot, String touchdash, int batteryPowerRange, 
	int speed, int tires) {
		this.productLine = productLine;
		this.autopilot = autopilot;
		this.touchdash = touchdash;
		BatteryPowerRange = batteryPowerRange;
		this.speed = speed;
		this.tires = tires;
		
	}

	public String getProductLine() {
		return productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public String getAutopilot() {
		return autopilot;
	}

	public void setAutopilot(String autopilot) {
		this.autopilot = autopilot;
	}

	public String getTouchdash() {
		return touchdash;
	}

	public void setTouchdash(String touchdash) {
		this.touchdash = touchdash;
	}

	public int getBatteryPowerRange() {
		return BatteryPowerRange;
	}

	public void setBatteryPowerRange(int batteryPowerRange) {
		BatteryPowerRange = batteryPowerRange;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getTires() {
		return tires;
	}

	public void setTires(int tires) {
		this.tires = tires;
	}
	
		
		
}
