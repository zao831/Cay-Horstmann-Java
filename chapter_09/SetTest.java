package chapter_09;

import java.util.*;

/*
 * Cay S. Horstmann
 * Core Java Volume 1. Fundamentals
 * 10th Edition
 * Page 439
 * This program displays all the unique words 
 * entered into the set from the standard stream
 */

public class SetTest {

	public static void main(String[] args) {

		Set<String> words = new HashSet<>(); // The object of type HashSet implementing a hash set

		long totalTime = 0;

		try (Scanner in = new Scanner(System.in)) {
			while (in.hasNext()) {
				String word = in.next();
				long callTime = System.currentTimeMillis();
				words.add(word);
				callTime = System.currentTimeMillis() - callTime;
				totalTime += callTime;
			}
		}

		Iterator<String> iter = words.iterator();

		for (int i = 0; i <= 20 && iter.hasNext(); i++)
			System.out.println(iter.next());
		System.out.println("...");
		System.out.println(words.size() + " distinct words. " + totalTime + " milliseconds. ");

	}
}
