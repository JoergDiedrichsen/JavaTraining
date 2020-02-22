package ooptraining;

public class BankAccounting {

	public static void main(String[] args) {

		AccountHolder[] accountHolders = new AccountHolder[3];
				
		accountHolders[0] = new AccountHolder("Thomas","Müller", 45, 20000F);
		accountHolders[1] = new AccountHolder("Elisabeth","Schabranski", 19, 80000F);
		accountHolders[2]= new AccountHolder("Peter","Dödel", 26, 10000F);

		for(AccountHolder name : accountHolders ) {
			System.out.print(name.getFirstName() + " " + name.getLastName() + " ");
			if( name.isEligibleForCreditCard() == true) {
				System.out.print("darf eine Kreditkarte bekommen");
			}
			else {
				System.out.print("darf keine Kreditkarte bekommen");
			}
			System.out.println(" und ist " + name.getAge() + "Jahre alt.");
		}
	}

}
