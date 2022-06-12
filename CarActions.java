package week1.day2;

public class CarActions {
	public static void main(String[] args) {
		CarActions obj = new CarActions();
		obj.applyBreak();
		obj.applyGear();
		obj.switchOnAc();
		obj.applyAccelerator();
	}

	public void applyBreak () {
		System.out.println("Applied Break");
	}
	
	public void applyGear() {
		System.out.println("Applied Gear");
	}
    public void switchOnAc () {
    	System.out.println("AC IS ON");
    }
    public void applyAccelerator() {
    	System.out.println("Accelerated");
    }
}


