package com.faiz.Java8Practice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamClassSequentialStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		for(int i=20; i<100; i++) {
			list.add(i);
		}
		
		Stream<Integer> sequentialStream = list.stream();
		Stream<Integer> highestNum = sequentialStream.filter((p)->p>50);
		
		highestNum.forEach(p->System.out.println(p+" "));
	}

}
