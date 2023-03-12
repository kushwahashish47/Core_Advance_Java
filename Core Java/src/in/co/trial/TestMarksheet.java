package in.co.trial;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheet {

	public static void main(String[] args) {
		ArrayList m = new ArrayList();

		// Add marksheets
		m.add(new Marksheet("A2", "Suraj", 90));
		m.add(new Marksheet("A3", "Ankush", 80));
		m.add(new Marksheet("A1", "Saurabh", 95));
		m.add(new Marksheet("A5", "Rishi", 89));
		m.add(new Marksheet("A4", "Zuber", 89));
		m.add(new Marksheet("A0", "Amit", 91));

		// Print all elements of list
		System.out.println("**Actual List**");
		for (Object o : m) {
			System.out.println(o);
		}

		// Sort elements in natural order using Comparable.
		Collections.sort(m);

		// Print all elements
		System.out.println("\n**Sorted List Natural Ordering**");
		for (Object o : m) {
			System.out.println(o);
		}

		// Sort elements by Name in ascending order using Comparator
		OrderByName cName = new OrderByName();
		Collections.sort(m, cName);

		System.out.println("\n**Sorted By Name Comparator**");
		for (Object o : m) {
			System.out.println(o);
		}

		// Sort elements by Name in descending order using Comparator
		OrderByNameDesc cDecName = new OrderByNameDesc();
		Collections.sort(m, cDecName);

		System.out.println("\n**Sorted By desc Name Comparator**");
		for (Object o : m) {
			System.out.println(o);
		}

		// Sort elements by Marks in descending order using Comparator
		OrderByMarksDesc cMarks = new OrderByMarksDesc();
		Collections.sort(m, cMarks);

		System.out.println("\n**Sorted By desc Marks Comparator**");
		for (Object o : m) {
			System.out.println(o);
		}

	

	}

}
