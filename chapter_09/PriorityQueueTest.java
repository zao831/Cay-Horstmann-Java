package chapter_09;

import java.util.*;

/*
 * Cay S. Horstmann
 * Core Java Volume 1. Fundamentals
 * 10th Edition
 * Page 446
 * Demonstration to use queue by priority
 */

public class PriorityQueueTest {

	public static void main(String[] args) {

		PriorityQueue<GregorianCalendar> pq = new PriorityQueue<>();

		pq.add(new GregorianCalendar(1906, Calendar.DECEMBER, 9)); // G. Hopper
		pq.add(new GregorianCalendar(1815, Calendar.DECEMBER, 10)); // A. Lovelace
		pq.add(new GregorianCalendar(1903, Calendar.DECEMBER, 3)); // J. von Neumann
		pq.add(new GregorianCalendar(1910, Calendar.JUNE, 22)); // K. Zuse

		System.out.println("Iterating over elements...");

		for (GregorianCalendar date : pq)
			System.out.println(date.get(Calendar.YEAR));
		System.out.println("\nRemoving elements...");
		while (!pq.isEmpty())
			System.out.println(pq.remove().get(Calendar.YEAR));

		if (pq.isEmpty())
			System.out.println("\nQueue is empty");
		else
			for (GregorianCalendar date : pq)
				System.out.println(date);

	}
}