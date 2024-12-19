package Assignment11;

public class OffSeason extends Onseason{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OffSeason obj=new OffSeason();
		obj.discount(5000);

	}
	public void discount(int amount) {
		super.discount(3000);
		float discount_amt=amount*0.15f;
		float final_amt=amount-discount_amt;
		System.out.println("OffSeason-----------");
		System.out.println("Original Price : "+amount);
		System.out.println("Discount Amount : "+discount_amt);
		System.out.println("Payment Amount : "+final_amt);
	}
}
