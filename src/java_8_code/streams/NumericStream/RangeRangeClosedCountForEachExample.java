package java_8_code.streams.NumericStream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RangeRangeClosedCountForEachExample {
	
	public static void main(String[] args) {
		
		IntStream IntStreamRange = IntStream.range(1, 10);
		System.out.println("IntStreamRange.count()=   "+IntStreamRange.count());//returns endExclusive -1 i.e.9
		
		IntStream IntStreamRangeClosed = IntStream.rangeClosed(1, 10);
		System.out.println("IntStreamRangeClosed.count()= "+IntStreamRangeClosed.count());//returns 10
		
		LongStream LongStreamRange = LongStream.range(1, 10);
		System.out.println("LongStreamRange.count=  "+LongStreamRange.count());//returns endExclusive -1 i.e.9
		
		LongStream LongStreamRangeClosed = LongStream.rangeClosed(1, 10);
		System.out.println("LongStreamRangeClosed.count=  "+LongStreamRangeClosed.count());//returns 10
		
		//since there is no DoubleStream / LongStream available we need to use IntStream.range().asDoubleStream() to get it
		DoubleStream asDoubleStream = IntStream.range(1, 10).asDoubleStream();
		System.out.println("asDoubleStreamRange.count=  "+asDoubleStream.count());//returns endExclusive -1 i.e. 9
		
		LongStream asLongStream = IntStream.rangeClosed(1, 10).asLongStream();
		System.out.println("asLongStreamRangeClosed.count=  "+asLongStream.count());//returns 10
	}

}
