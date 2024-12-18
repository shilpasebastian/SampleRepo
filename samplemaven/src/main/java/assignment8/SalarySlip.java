package assignment8;

public class SalarySlip extends SalaryCalculation{
	double total_amt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalarySlip obj=new SalarySlip();
		obj.bascicPay(args);
		obj.calculation(obj.basicpay);
		obj.totalSalary();
		obj.displaySalary();
	}
	public void totalSalary() {
		total_amt=basicpay+hra-pf-deduction+bonus;		
	}
	public void displaySalary() {
		System.out.println("Basic Pay="+basicpay);
		System.out.println("Deduction="+deduction);
		System.out.println("HRA="+hra);
		System.out.println("PF="+pf);
		System.out.println("Bounus="+bonus);
		System.out.println("Total Salary="+total_amt);
	}

}
