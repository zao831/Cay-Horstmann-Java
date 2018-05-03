package chapter_09;

/*
 * Cay S. Horstmann
 * Core Java Volume 1. Fundamentals
 * 10th Edition
 * Page 434
 * Operations with linked lists are demonstrated
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {
	
	public static void main(String[] args) {

		List<String> a = new LinkedList<>();
		a.add("Amy");
		a.add("Carl");
		a.add("Erica");
		
		System.out.println("Initial linked list \"a\": " + a + "\n");

		List<String> b = new LinkedList<>();
		b.add("Bob");
		b.add("Doug");
		b.add("Frances");
		b.add("Gloria");
		
		System.out.println("Initial linked list \"b\": " + b + "\n");

		// Combine words from linked lists a and b
		ListIterator<String> aIter = a.listIterator();
		Iterator<String> bIter = b.iterator();

		while (bIter.hasNext()) {
			if (aIter.hasNext())
				aIter.next();
			aIter.add(bIter.next());
		}

		System.out.println("Combine linked list \"a\" + \"b\": " + a + "\n");

		// Delete every second word from the linked list b
		bIter = b.iterator();

		while (bIter.hasNext()) {

			bIter.next(); // skip one item

			if (bIter.hasNext()) {
				bIter.next(); // go to the next item
				bIter.remove(); // delete this item
			}
		}

		System.out.println("Delete every second word from the linked list \"b\":" + b + "\n");

		// A delete operation group from a linked list a of all words that make up a
		// linked list b

		a.removeAll(b);

		System.out.println("Delete words that make up a linked list \"b\" from linked list \"a\": " + a);

	}
}
