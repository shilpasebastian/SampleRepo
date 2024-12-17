package polumorphism;

public class PolymorphismChild extends PolymorphismParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismChild p=new PolymorphismChild();
		p.display(10, 10);

	}
	public void display(int a,int b) {
		int sum=a+b;
		System.out.println("Child Sum="+sum);
		super.display(10, 15);
	}

}
