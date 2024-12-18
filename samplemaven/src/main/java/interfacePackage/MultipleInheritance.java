package interfacePackage;

public class MultipleInheritance implements Printable,Showable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance obj=new MultipleInheritance();
		obj.print();
		obj.show();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Showable Parent");
		
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printable Parent");
		
		
	}

}
