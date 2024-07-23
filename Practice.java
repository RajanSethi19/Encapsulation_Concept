package Encapsulation_concept;

public class Practice {

	private int phno;

	public void setphno(int phno) {
		this.phno = phno;
	}

	public int getphno() {
		return phno;
	}

	public static void main(String[] args) {
		Practice p= new Practice();
		p.setphno(999);
	System.out.println(p.getphno());
		

	}

}
