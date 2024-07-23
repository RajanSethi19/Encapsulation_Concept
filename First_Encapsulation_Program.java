package Encapsulation_concept;

public class First_Encapsulation_Program {
	private int phoneNumber;

	public void setphoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;

	}

	public int getphoneNumber() {

		return phoneNumber;
	}

	public static void main(String[] args) {

		First_Encapsulation_Program f = new First_Encapsulation_Program();
		f.setphoneNumber(999646);

		System.out.println(f.getphoneNumber());
	}

}
