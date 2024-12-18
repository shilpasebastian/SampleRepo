package abstraction;

public class AbstractionChild extends AbstractionParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionChild obj=new AbstractionChild();
		obj.add();
		obj.display();

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=10;
		int b=15;
		int sum=a+b;
		System.out.println("Sum"+sum);
		
	}

}
