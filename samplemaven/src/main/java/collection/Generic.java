package collection;

import java.util.ArrayList;
import java.util.List;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> d=new ArrayList<String>();//List is interface
		//also ArrayList<String> d=new ArrayList<String> //ArrayList is class
		d.add("Black");
		d.add("White");
		d.add("Green");
		d.add("Red");
		d.add("Yellow");
		d.add("Green");
		System.out.println(d);
		d.set(1, "Blue");
		System.out.println(d);
		System.out.println(d.indexOf("Green"));
		System.out.println(d.lastIndexOf("Green"));
		d.remove(5);
		System.out.println(d);
		System.out.println(d.get(3));
		System.out.println(d.contains("Purple"));

	}

}
