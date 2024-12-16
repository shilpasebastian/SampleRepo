package superKeyword;

public class SuperConstructorChild extends SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructorChild s=new SuperConstructorChild();

	}
	public SuperConstructorChild() {
		super(5, 3);
		System.out.println("Child Class");
	}
}
