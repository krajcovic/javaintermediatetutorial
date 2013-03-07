/**
 * 
 */
package cz.java.tutorial2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author "Dusan Krajcovic"
 * 
 */
public class Bucky {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// tutorial01();
		// tutorial04();
		tutorial06();
		// tutorial08();
	}

	private static void tutorial08() {

	}

	private static void tutorial06() {

		String[] things = { "apples", "noobs", "pwnge", "bacon", "goATS" };
		List<String> list = new LinkedList<String>();
		for (String x : things)
			list.add(x);

		String[] things2 = { "sausage", "baocn", "goats", "harrypotter" };
		List<String> list2 = new LinkedList<>();
		for (String x : things2)
			list2.add(x);

		list.addAll(list2);
		list2 = null;

		printMe(list);
		removeStuff(list, 2, 5);
		printMe(list);
		reverseMe(list);

	}

	private static void reverseMe(List<String> list) {
		ListIterator<String> it = list.listIterator(list.size());
		while (it.hasPrevious()) {
			System.out.printf("%s ", it.previous());
		}

	}

	private static void removeStuff(List<String> list, int i, int j) {

		list.subList(i, j).clear();

	}

	private static void printMe(List<String> list) {
		for (String string : list) {
			System.out.printf("%s ", string);
		}

		System.out.println();

	}

	private static void tutorial04() {
		String[] things = { "eggs", "lasers", "hats", "pie" };
		List<String> thingsList = new ArrayList<String>();

		// add arrayitems to list)
		for (String x : things) {
			thingsList.add(x);
		}

		String[] morethings = { "lasers", "hats" };
		List<String> morethingsList = new ArrayList<String>();

		for (String x : morethings) {
			morethingsList.add(x);
		}

		for (int i = 0; i < thingsList.size(); i++) {
			System.out.printf("%s ", thingsList.get(i));
		}

		editlist(thingsList, morethingsList);
		System.out.println();

		for (int i = 0; i < thingsList.size(); i++) {
			System.out.printf("%s ", thingsList.get(i));
		}

		System.out.println();

		for (int i = 0; i < morethingsList.size(); i++) {
			System.out.printf("%s ", morethingsList.get(i));
		}

	}

	private static void editlist(Collection<String> l1, Collection<String> l2) {
		Iterator<String> it = l1.iterator();
		while (it.hasNext()) {
			if (l2.contains(it.next())) {
				it.remove();
			}
		}

	}

	private static void tutorial01() {
		ArrayList<String> words = new ArrayList<>();
		words.add("funk");
		words.add("chunk");
		words.add("furry");
		words.add("baconator");

		for (String w : words) {
			if (w.startsWith("fu")) {
				System.out.println(w + " starts with fu");
			}
		}

		for (String w : words) {
			if (w.endsWith("unk")) {
				System.out.println(w + " ends with enk");
			}
		}
	}
}
