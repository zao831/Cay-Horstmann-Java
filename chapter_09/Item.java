package chapter_09;

import java.util.*;

/*
 * Cay S. Horstmann
 * Core Java Volume 1. Fundamentals
 * 10th Edition
 * Page 442
 * Product description and his by catalog number
 * Executable TreeSetTest.java
 */

public class Item implements Comparable<Item> {

	private String description;
	private int partNumber;

	/**
	 * Constructs a product object
	 * 
	 * @param aDescription
	 *            - product description
	 * @param aPartNumber
	 *            - by catalog number
	 */

	public Item(String aDescription, int aPartNumber) {
		description = aDescription;
		partNumber = aPartNumber;
	}

	/**
	 * Gets a description of this product
	 * 
	 * @return description of product
	 */

	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return "[description = " + description + ", partNumber = " + partNumber + "]";
	}
	
	public boolean euqals(Object otherObject) {
		if (this == otherObject) return true;
		if(otherObject == null) return false;
		if(getClass() != otherObject.getClass()) return false;
		Item other = (Item) otherObject;
		return Objects.equals(description, other.description) && partNumber == other.partNumber;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(description, partNumber);
	}

	@Override
	public int compareTo(Item other) {
		int diff = Integer.compare(partNumber, other.partNumber);
		return diff != 0 ? diff : description.compareTo(other.description);
	}
}