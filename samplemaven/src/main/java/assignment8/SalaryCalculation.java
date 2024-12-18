package assignment8;

public class SalaryCalculation extends Salary {
	double hra;
	double pf;
	public void calculation(int basic_pay) {
		hra=basic_pay*0.05f;
		pf=basic_pay*0.2f;		
	}
}
