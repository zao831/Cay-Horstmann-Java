package chapter_09;

import java.util.*;

/*
 * Cay S. Horstmann
 * Core Java Volume 1. Fundamentals
 * 10th Edition
 * Page 448
 * Demonstration of the use mapping with keys 
 * of type String and values of type Employee
 */

public class MapTest {
	
	public static void main(String[] args) {
		
		Map<String, Employee> staff = new HashMap<>();
		
		staff.put("144-25-5464", new Employee("Amy Lee"));
		staff.put("567-24-2546", new Employee("Harry Hacker"));
		staff.put("157-62-7935", new Employee("Gary Cooper"));
		staff.put("456-62-5527", new Employee("Francesca Cruz"));
		
		//
		staff.remove("567-24-2546");
		
		//
		staff.put("456-62-55-27", new Employee("Francesca Miller"));
		
		//
		System.out.println(staff.get("157-62-7935"));
		
		//
		for (Map.Entry<String, Employee> entry : staff.entrySet()) {
			String key = entry.getKey();
			Employee value = entry.getValue();
			System.out.println("key = " + key + ", value = " + value);
		}		
	}
}