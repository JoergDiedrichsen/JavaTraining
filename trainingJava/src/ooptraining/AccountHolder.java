package ooptraining;

public class AccountHolder extends Person {
	// Constructor
	
	public AccountHolder(String firstName, String lastName, int age, float accountBalance) {
		super(firstName, lastName, age);
		this.accountBalance = accountBalance;
		setEligibleForCreditCard();
	}

	// Attibutes
	private float accountBalance;
	private boolean eligibleForCreditCard;

	// Getter and Setters
	public float getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}

	public boolean isEligibleForCreditCard() {
		return eligibleForCreditCard;
	}
	
	// Methods
	public void setEligibleForCreditCard() {
		if(accountBalance >= 20000.00F && getAge() >=25)
			eligibleForCreditCard = true;
		else
			eligibleForCreditCard = false;
	}

}
