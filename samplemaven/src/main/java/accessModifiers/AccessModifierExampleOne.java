package accessModifiers;

public class AccessModifierExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifierExampleOne a=new AccessModifierExampleOne();
		a.display();
		a.displayOne();
		a.displayTwo();
		a.displayThree();

	}
	public void displayOne() {
		System.out.println("Public Method....");
	}
	private void displayTwo() {
		System.out.println("Private Method...");
	}
	protected void displayThree() {
		System.out.println("Protected Method...");
	}
	void display() {
		System.out.println("Default Method...");
	}

}
