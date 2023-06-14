package learningjava;

public class BankDetails extends Bank {

	@Override
	void bal(int bal) {
		System.out.println("Balance Amount : " + bal);
	}

	@Override
	void atmPin(int pin) {
		System.out.println("ATM Pin : " + pin);
	}

	public static void main(String[] args) {	
		
		Bank bank = new BankDetails();
		bank.cusName("Arun");
		bank.accNo(123456);
		bank.accType("Savings");
		BankDetails bank1 = new BankDetails();
		bank1.atmPin(1234);
		bank1.bal(1050000);

	}

}
