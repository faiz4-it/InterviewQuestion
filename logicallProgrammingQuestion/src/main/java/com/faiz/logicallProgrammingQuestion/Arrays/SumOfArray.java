package com.faiz.logicallProgrammingQuestion.Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 4, 7, 4, 12 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println(sum);
	}

}
