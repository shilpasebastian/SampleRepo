package aggregation;

public class AggregationChild {
	String city;
	String state;
	AggregationPsrent ref;//Aggregation
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregationPsrent p=new AggregationPsrent("Anu",27,10);
		AggregationChild a=new AggregationChild("Ernakulam","Kerala",p);
		a.display();
		

	}
	public AggregationChild(String city,String state,AggregationPsrent ref) {
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	public void display() {
		System.out.println("City:"+city);
		System.out.println("State:"+state);
		System.out.println("Name:"+ref.name);
		System.out.println("Age:"+ref.age);
		
	}

}
