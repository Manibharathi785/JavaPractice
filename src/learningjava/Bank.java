package learningjava;

public abstract class Bank {

	public void cusName(String name) {
		System.out.println("Customer Name : " + name);
	}

	public void accNo(int num) {
		System.out.println("Account Numbefr : " + num);
	}

	public void accType(String type) {
		System.out.println("Account Type : " + type);
	}

	abstract void bal(int bal);

	abstract void atmPin(int pin);

	public static void main(String[] args) {

	}

	

}
