package inheritance;

public class MultiLevelChildC extends MultiLevelParentB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelChildC c=new MultiLevelChildC();
		c.display();
		c.display2();
		c.display3();
	}
	public void display3() {
		System.out.println("Child C....");
	}
}
