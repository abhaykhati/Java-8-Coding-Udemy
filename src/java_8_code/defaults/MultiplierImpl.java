package java_8_code.defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier {

	@Override
	public int multiply(List<Integer> multiplyList) {
	return	multiplyList
		.stream()
		.reduce(1,(x,y)-> x*y);
		
	}
	public  int size(List<Integer> listSize) {
		System.out.println("size method from impl");
		return listSize.size();
	}
}
