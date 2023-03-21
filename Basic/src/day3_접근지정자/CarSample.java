package day3_접근지정자;

public class CarSample {

	public static void main(String[] args) {
		int sm7_sp;
		int k7_sp;
		
		Car sm7 = new Car();
		Car k7 = new Car();
		
		sm7_sp = sm7.speedUp(20);
		k7_sp = k7.speedDown(30);
		System.out.println("sm7 speed = " + sm7_sp + " k7 speed = " + k7_sp);
		
		sm7_sp = sm7.speedUp(50);
		k7_sp = k7.speedDown(100);
		System.out.println("sm7 speed = " + sm7_sp + " k7 speed = " + k7_sp);
		
		sm7.setMaxSpeed(300);
		System.out.println("sm7 max speed = " + sm7.getMaxSpeed());
			

	}

}
