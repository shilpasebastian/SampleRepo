package superKeyword;

public class SuperMethodChild extends SuperMethod{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethodChild s=new SuperMethodChild();
		s.display2();

	}
	public void display2() {
		System.out.println("Child Class");
		super.display();
	}
}
