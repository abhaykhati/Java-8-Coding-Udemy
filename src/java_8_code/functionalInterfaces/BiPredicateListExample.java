package java_8_code.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateListExample {

	private static void checkValueIfPresentInList(List<Integer> list, BiPredicate<Integer, List<Integer>> bip) {
		if (bip.test(5, list)) {
			System.out.println("success : List contains value");
		} else {
			System.out.println("failure: List don't contain value");
		}

	}

	public static void main(String[] args) {
		BiPredicate<Integer, List<Integer>> listPredicate = (x, y) -> {
			return y.contains(x);
		};

		List<Integer> list = new ArrayList<Integer>();
		list.add(22);
		list.add(24);
		list.add(5);
		list.add(7);
		list.add(8);
		list.add(55);

		checkValueIfPresentInList(list,listPredicate);

	}

}
