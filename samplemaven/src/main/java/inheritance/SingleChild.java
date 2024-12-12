package inheritance;

public class SingleChild extends SingleParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleChild s=new SingleChild();
		s.display();
		s.display2();

	}
	public void display2() {
		System.out.println("This is the Child Class");
	}
}
