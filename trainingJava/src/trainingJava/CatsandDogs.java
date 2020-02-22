package trainingJava;

public class CatsandDogs {


	public static void main(String[] args)
	{
		Dog fido = new Dog();
		Cat maunzi = new Cat();
		
		fido.sleep();
		fido.setName("Oskar");
		maunzi.setName("Murkel");
		System.out.println("Die Katze " + maunzi.getName() + " schläft");
		maunzi.sleep();
		System.out.println("Der Hund " + fido.getName() + " kläfft");
		fido.bark();
		System.out.println(fido.getName() + " schläft auch");
		fido.sleep();
		System.out.println(maunzi.getName() + " wacht auf");
		maunzi.miau();
		System.out.println("Nun schläft die Katze " + maunzi.getName() + " wieder");
		maunzi.sleep();
	}
	
}	
