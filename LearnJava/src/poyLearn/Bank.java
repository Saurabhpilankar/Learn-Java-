package poyLearn;

public class Bank {

	public float rateOfInterest() {
		return 0;
	}
//runtime polymorphism
public static void main(String[] args) {
		Bank b;
		b = new SbiBank();
		b.rateOfInterest();
		b=new HDFCBank();
		b.rateOfInterest();
		}
}
