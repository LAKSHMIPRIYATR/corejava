package com.tnsif.lambda;

import java.util.ArrayList;

public class LambdaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> li = new ArrayList<>();
		li.add(22);
		li.add(36);
		li.add(44);
		 for (Integer number : li) {
	            System.out.println(number);// without lambda expression
	}
	}
}
