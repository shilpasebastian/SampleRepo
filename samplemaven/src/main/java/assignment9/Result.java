package assignment9;

public class Result extends Addition{
	
	int result;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result obj=new Result();
		obj.display();

	}
	public void display() {
		result=super.additionCal();
		System.out.println("The Addition values are "+super.a+" and "+super.b);
		if(result%10==0) {
			System.out.println("The Result is "+result+" and it is divisible by 10");
		}else {
			System.out.println("The Result is "+result+" and it is not divisible by 10");
		}
	}
	

}
