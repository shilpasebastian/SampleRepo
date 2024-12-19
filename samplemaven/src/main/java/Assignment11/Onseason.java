package Assignment11;

public class Onseason {
	public void discount(int amount) {
		float discount_amt=amount*0.4f;
		float final_amt=amount-discount_amt;
		System.out.println("OnSeason-----------");
		System.out.println("Original Price : "+amount);
		System.out.println("Discount Amount : "+discount_amt);
		System.out.println("Payment Amount : "+final_amt);
	}

}
