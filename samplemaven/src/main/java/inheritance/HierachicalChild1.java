package inheritance;

public class HierachicalChild1 extends HierachicalParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierachicalChild1 c1=new HierachicalChild1();
		c1.display();
		c1.display1();
	}
	public void display1() {
		System.out.println("Child Class B");
	}

}
