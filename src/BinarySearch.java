package com.binarySearch.java;

public class BinarySearch {


	public boolean binarySearch(int[] data, int key) {
		int low = 0;
		int high = data.length - 1;

		while (high >= low) {
			int middle = (low + high) / 2;
			if (data[middle] == key) {
				return true;
			}
			if (data[low] > data[high]) {

				if (data[low] < data[middle]) {

					if (key < data[middle] && key >= data[low]) {
						high = middle - 1;
					} else {
						low = middle + 1;
					}
				} else {
					if (key > data[middle] && key <= data[high]) {
						low = middle + 1;
					} else {
						high = middle - 1;
					}
				}
			} else {
				if (key < data[middle]) high = middle - 1;
				else if (key > data[middle]) low = middle + 1;
			}
		}

		return false;
	}
}