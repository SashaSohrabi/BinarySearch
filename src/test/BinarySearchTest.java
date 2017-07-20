package com.binarySearch.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BinarySearchTest {

	int search = 3;
	private BinarySearch binary_search;

	@Before
	public void setup() {
		System.out.println("Setup");
		binary_search = new BinarySearch();
	}

	@Test
	public void binarySearchInSortedArray() {
		System.out.println("Binary search in sorted array");
		int[] array = new int[]{1, 3, 4, 5, 6, 9, 10, 15};
		boolean result = binary_search.binarySearch(array, search);
		assertTrue(result);
	}

	@Test
	public void binarySearchInNonSortedArray() {
		System.out.println("Binary search in non sorted array");
		int[] array = new int[]{5, 6, 9, 10, 15, 1, 3, 4};
		boolean result = binary_search.binarySearch(array, search);
		assertTrue(result);
	}

	@After
	public void teardown() {
		System.out.println("Teardown");
		search = 0;
	}

}
