package superKeyword;

public class SuperVariableChild extends SuperVariableExample{
	String color="Red";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperVariableChild s=new SuperVariableChild();
		s.display();

	}
	public void display() {
		System.out.println(color);
		System.out.println(super.color);
	}

}
