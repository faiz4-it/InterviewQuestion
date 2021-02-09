package com.faiz.Java8Practice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<>();
		for (int i = 50; i < 100; i++)
			intList.add(i);
		Stream<Integer> sequentialStream = intList.stream();
		Stream<Integer> highNumsStream = sequentialStream.filter(p -> p > 90);
		System.out.print("High Nums greater than 90=");
		highNumsStream.forEach(p -> System.out.print(p + " "));
	}

}
