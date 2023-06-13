package curs10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
		set.add("mov");
		set.add("alb");
		set.add("albastru");
		set.add("rosu");
		//set.add("rosu"); - obectul tip se nu permite valori duplicate
		
		System.out.println("=======================");
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		System.out.println("=======================");
		
		for(String element : set) {	
			System.out.println(element);
		}
		
		System.out.println("=======================");
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}	
		System.out.println("=======================");
		
		set.remove("alb");
		for(String element : set) {	
			System.out.println(element);
		}
		System.out.println("=======================");
		System.out.println(set.contains("negru"));
		System.out.println(set.contains("rosu"));
		
		System.out.println("=======================");
		set.clear();
		System.out.println(set.isEmpty());
		System.out.println(set.size());
	}

}
