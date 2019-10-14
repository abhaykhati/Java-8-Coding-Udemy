package java_8_code.defaults;

import java.util.List;

public interface Multiplier {
	int multiply(List<Integer> multiplyList);
	
	default int size(List<Integer> listSize) {
		System.out.println("size method from inerface");
		return listSize.size();
	}
	
	static boolean isListNotEmpty(List<Integer> isListEmpty) {
		return isListEmpty==null || isListEmpty.size() ==0;
	}
	
}
