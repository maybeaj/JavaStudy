package day3_접근지정자;

public class Car {
	private int maxSpeed;
	public String brandName;
	public int speed;
	public static int prodNum;
	
	public int speedUp(int sp) {
		speed = speed + sp;
		return speed;
	}
	
	public int speedDown(int sp) {
		speed = speed - sp;
		return speed;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int sp) {
		maxSpeed = sp;
	}
	
}
