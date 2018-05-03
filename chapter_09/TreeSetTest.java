package chapter_09;

import java.util.*;

/*
 * Cay S. Horstmann
 * Core Java Volume 1. Fundamentals
 * 10th Edition
 * Page 442
 */

public class TreeSetTest {

	public static void main(String[] args) {

		SortedSet<Item> parts = new TreeSet<>();

		parts.add(new Item("Toaster", 1234));
		parts.add(new Item("Widget", 4562));
		parts.add(new Item("Modem", 9912));

		System.out.println(parts);

		NavigableSet<Item> sortByDescription = new TreeSet<>();

		sortByDescription.addAll(parts);

		System.out.println("\n" + sortByDescription);

	}
}