package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> fruits=new HashSet<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Banana");
		System.out.println(fruits);
		Set<String> fruits2=new HashSet<>();
		fruits.addAll(fruits2);
		System.out.println(fruits);
		System.out.println(fruits.contains("Apple"));
		System.out.println(fruits.containsAll(fruits2));
		System.out.println(fruits.isEmpty());
		fruits.remove("Orange");
		System.out.println(fruits);
		fruits.removeAll(fruits2);
		System.out.println(fruits);
		System.out.println(fruits.size());
		

	}

}
