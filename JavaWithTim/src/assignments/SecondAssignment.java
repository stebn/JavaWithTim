package assignments;

public class SecondAssignment {

	public static void main(String[] args) {

		calcFeetAndInchesToCentimeters(100);
		System.out.println("This is a new branch!");

		calcFeetAndInchesToCentimeters(500);
		System.out.println("This is a 3rd branch with updated code");

	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		double cent;
		if (feet >= 0 || inches >= 0 || inches <= 12) {
			//cent = (feet * 30.48) + (inches * 2.54);
			cent = ((feet * 12) + inches) *2.54;
			System.out.println(cent + " cm");
			return cent;
		} else {
			System.out.println("Invalid");
			return -1;
		}
	}

	public static double calcFeetAndInchesToCentimeters(double inches) {
		if (inches < 0) {
			System.out.println("Invalid");
			return -1;
		}

		double feet = (int)inches / 12;
		double remainingInches = (int)inches % 12;
		System.out.println(feet + " ft " + remainingInches + " inches");
		return calcFeetAndInchesToCentimeters(feet, remainingInches);

	}
}
