class Voorbeeld{
	public static void main(String[] args){
		System.out.println("Hello world");
		Bank ing = new Bank();
		ing.naam = "ABN-AMRO";
		Bank tweedeBank = new Bank();
		tweedeBank.naam = "Triodos";
		tweedeBank.balans = 14;
		System.out.println(ing.balans);
	}
}

class Bank{
	String naam = "ING";
	static int balans;
}