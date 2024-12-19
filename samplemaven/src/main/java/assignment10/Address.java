package assignment10;

public class Address {
	String address;
	Student ref;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj_one=new Student("Ammu",20);
		Address obj_two=new Address("ABCD House,Aluva,Ernakulam,Kerala", obj_one);
		obj_two.display();

	}
	public Address(String address,Student ref) {
		this.address=address;
		this.ref=ref;
	}
	public void display() {
		System.out.println("Student Name : "+ref.name);
		System.out.println("Student RollNumber : "+ref.roll_no);
		System.out.println("Student Address : "+address);
	}

}
