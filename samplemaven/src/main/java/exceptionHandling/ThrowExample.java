package exceptionHandling;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=17;
		if(age>=18) {
			System.out.println("Eligible for Voting");
		}else {
			throw new ArithmeticException("Age Under 18");
		}

	}

}
