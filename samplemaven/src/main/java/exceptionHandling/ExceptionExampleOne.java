package exceptionHandling;

public class ExceptionExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		try {
		int c=a/b;
		}
		catch(Exception e) {
			b=5;
			int d=a/b;
			System.out.println(d);
			System.out.println(e);
		}
		finally {
			System.out.println("End of the Program");
		}
		//if we don't write catch then the exception automatically display and also finally sysout display

	}

}
