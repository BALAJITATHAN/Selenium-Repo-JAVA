package week1.day1;

public class Car {
	public void driveCar()
	{
		System.out.println("u r driving a car");
	}
	public void applyBrake() {
		System.out.println("u r applyg brake");
	}
	public void soundHorn() {
		System.out.println("Horn soundly");
	}
	public void isPuncture() {
		System.out.println("Puncture");
	}
	public static void main(String[]args) {
		Car rollsRoyce=new Car();
		rollsRoyce.driveCar();
		rollsRoyce.applyBrake();
		rollsRoyce.soundHorn();
		rollsRoyce.isPuncture();
	}
}
