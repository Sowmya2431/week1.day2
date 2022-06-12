package week1.day2;

public class TwoWheeler {
	public static void main(String[] args) {
		TwoWheeler obj = new TwoWheeler();
		int wheels = obj.noOfWheels;
		System.out.println(obj.noOfWheels);
		
		short mirrors = obj.noOfMirrors;
		System.out.println(obj.noOfMirrors);
		
		long chassisNumber2 = obj.chassisNumber;
		System.out.println(obj.chassisNumber);
		
		boolean punctured = obj.isPunctured;
		System.out.println(obj.isPunctured);
		
		String name = obj.bikeName;
		System.out.println(obj.bikeName);
		
		double km = obj.runningKM;
		System.out.println(obj.runningKM);
		
		
	}

	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 123456;
	boolean isPunctured = false;
	String bikeName = "Activa";
	double runningKM = 23456.678;
	
}
