/**
 * <module name="JavadocType"/>
 */
package cz.java.tutorial2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

/**
 * @author "Dusan Krajcovic"
 * 
 */
public final class Bucky {

	/**
	 * Denied create this class.
	 */
	private Bucky() {

	}

	/**
	 * @param args
	 *            input optional arguments
	 */
	public static void main(final String[] args) {

		// tutorial01();
		// tutorial04();
		// tutorial06();
		// tutorial08();
		// tutorial09();
		// tutorial10();
		// tutorial12();
		// tutorial14();
		// tutorial15();
		// tutorial16();
		// tutorial17();
		tutorial18();
	}

	/**
	 * Generic return types.
	 */
	private static void tutorial18() {
		System.out.println(max(23, 41, 2));
		System.out.println(max("apples", "xbobs", "chicken"));
	}

	/**
	 * Return max objcet from input parameters.
	 * 
	 * @param <T>
	 *            comparable type.
	 * @param a
	 *            The first value.
	 * @param b
	 *            The second value.
	 * @param c
	 *            The thirst value.
	 * @return The maximal value.
	 */
	public static <T extends Comparable<T>> T max(final T a, final T b,
			final T c) {
		T m = a;

		if (b.compareTo(m) > 0) {
			m = b;
		}

		if (c.compareTo(m) > 0) {
			m = c;
		}

		return m;
	}

	/**
	 * Generic methods.
	 */
	@SuppressWarnings("unused")
	private static void tutorial17() {
		Integer[] iray = { 1, 2, 3, 4 };
		Character[] cray = { 'b', 'u', 'c', 'y' };

		printMe(iray);
		printMe(cray);
	}

	/**
	 * Print to console array of T's.
	 * 
	 * @param <T>
	 *            The generic type of array.
	 * @param array
	 *            The array for printing.
	 */
	public static <T> void printMe(final T[] array) {
		for (T t : array) {
			System.out.printf("%s ", t);
		}
		System.out.println();
	}

	/**
	 * HashSet.
	 */
	@SuppressWarnings("unused")
	private static void tutorial16() {
		String[] things = { "apple", "bob", "ham", "bob", "bacon" };
		List<String> list = Arrays.asList(things);

		System.out.printf("%s ", list);
		System.out.println();

		Set<String> set = new HashSet<>(list);
		System.out.printf("%s ", set);
	}

	/**
	 * Queue.
	 */
	@SuppressWarnings("unused")
	private static void tutorial15() {
		PriorityQueue<String> q = new PriorityQueue<>();

		q.offer("first");
		q.offer("second");
		q.offer("third");

		System.out.printf("%s ", q);
		System.out.println();

		System.out.printf("%s ", q.peek());
		System.out.println();

		q.poll();
		System.out.printf("%s ", q);
		System.out.println();
	}

	/**
	 * Stacks, push, pop.
	 */
	@SuppressWarnings("unused")
	private static void tutorial14() {
		Stack<String> stack = new Stack<String>();
		stack.push("bottom");
		printStack(stack);

		stack.push("second");
		printStack(stack);

		stack.push("third");
		printStack(stack);

		stack.pop();
		printStack(stack);

		stack.pop();
		printStack(stack);

		stack.pop();
		printStack(stack);
	}

	/**
	 * Print to system out strings from stack.
	 * 
	 * @param stack
	 *            The stack contains strings.
	 */
	private static void printStack(final Stack<String> stack) {

		System.out.printf("%s TOP", stack);
		System.out.println();

	}

	/**
	 * addAll. frequency, disjoint.
	 */
	@SuppressWarnings("unused")
	private static void tutorial12() {

		// convert stuff array to list
		String[] stuff = { "apples", "beef", "corn", "ham" };
		List<String> list1 = Arrays.asList(stuff);

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("youtube");
		list2.add("google");
		list2.add("digg");

		System.out.printf("%s ", list2);
		System.out.println();

		Collections.addAll(list2, stuff);
		System.out.printf("%s ", list2);
		System.out.println();

		System.out.println(Collections.frequency(list2, "digg"));

		boolean tof = Collections.disjoint(list1, list2);
		System.out.println(tof);
	}

	/**
	 * Methods reverese and copy. Collections methods fill.
	 */
	@SuppressWarnings("unused")
	private static void tutorial10() {
		// create an array and convert to lsit
		Character[] ray = { 'p', 'w', 'n' };
		List<Character> list = Arrays.asList(ray);
		System.out.println("List is : ");
		output(list);

		// reverse and print out the lsit
		Collections.reverse(list);
		System.out.println("After reverse : ");
		output(list);

		// create new array and new lsti
		Character[] newRay = new Character[3];
		List<Character> listCopy = Arrays.asList(newRay);

		// copy contents of list into lsitcopy
		Collections.copy(listCopy, list);
		System.out.println("Copy of list : ");
		output(listCopy);

		// fill collections with crap
		Collections.fill(list, 'X');
		System.out.println("After filling the lsti : ");
		output(list);

	}

	/**
	 * Print data from list.
	 * 
	 * @param list
	 *            The list which will be displayed.
	 */
	private static void output(final List<Character> list) {
		for (Character character : list) {
			System.out.printf("%s ", character);
		}

		System.out.println();
	}

	/**
	 * Collections method sort.
	 */
	@SuppressWarnings("unused")
	private static void tutorial09() {

		String[] crap = { "aples", "lemons", "geese", "bacon", "youtube" };
		List<String> l1 = Arrays.asList(crap);

		Collections.sort(l1);
		System.out.printf("%s\n", l1);

		Collections.sort(l1, Collections.reverseOrder());
		System.out.printf("%s\n", l1);

	}

	/**
	 * Converting lists to arrays.
	 */
	@SuppressWarnings("unused")
	private static void tutorial08() {
		String[] stuff = { "babies", "watermelong", "melons", "fudge" };
		LinkedList<String> thelist = new LinkedList<String>(
				Arrays.asList(stuff));

		thelist.add("pumpinkinf");
		thelist.addFirst("fistthing");

		// convert back to an array
		stuff = thelist.toArray(new String[thelist.size()]);

		for (String string : stuff) {
			System.out.printf("%s ", string);
		}
	}

	/**
	 * LinkedList.
	 */
	@SuppressWarnings("unused")
	private static void tutorial06() {

		String[] things = { "apples", "noobs", "pwnge", "bacon", "goATS" };
		List<String> list = new LinkedList<String>();
		for (String x : things) {
			list.add(x);
		}

		String[] things2 = { "sausage", "baocn", "goats", "harrypotter" };
		List<String> list2 = new LinkedList<>();
		for (String x : things2) {
			list2.add(x);
		}

		list.addAll(list2);
		list2 = null;

		printMe(list);
		removeStuff(list, 2, 5);
		printMe(list);
		reverseMe(list);

	}

	/**
	 * Print to console strings from list in reverse order.
	 * 
	 * @param list
	 *            with data
	 */
	private static void reverseMe(final List<String> list) {
		ListIterator<String> it = list.listIterator(list.size());
		while (it.hasPrevious()) {
			System.out.printf("%s ", it.previous());
		}

	}

	/**
	 * Remove stuff from list from to.
	 * 
	 * @param list
	 *            with strings
	 * @param from
	 *            remove from
	 * @param to
	 *            remove to
	 */
	private static void removeStuff(final List<String> list, final int from,
			final int to) {

		list.subList(from, to).clear();

	}

	/**
	 * Print to standards console a strings from list.
	 * 
	 * @param list
	 *            with strings.
	 */
	private static void printMe(final List<String> list) {
		for (String string : list) {
			System.out.printf("%s ", string);
		}

		System.out.println();

	}

	/**
	 * Introduction to collections.
	 */
	@SuppressWarnings("unused")
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

	/**
	 * Remove strings from l1 if are in l2.
	 * 
	 * @param l1
	 *            The checked list with strings.
	 * @param l2
	 *            The control list with strings.
	 */
	private static void editlist(final Collection<String> l1,
			final Collection<String> l2) {
		Iterator<String> it = l1.iterator();
		while (it.hasNext()) {
			if (l2.contains(it.next())) {
				it.remove();
			}
		}

	}

	/**
	 * Common string methods.
	 */
	@SuppressWarnings("unused")
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
