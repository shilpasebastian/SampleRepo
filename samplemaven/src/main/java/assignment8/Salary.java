package assignment8;

public class Salary {
	int basicpay;
    int deduction;
	int bonus;
	public void bascicPay(String args[]) {
	basicpay=Integer.parseInt(args[0]);
	deduction=Integer.parseInt(args[1]);
	bonus=Integer.parseInt(args[2]);
	}
}
