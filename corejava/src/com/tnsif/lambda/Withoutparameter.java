package com.tnsif.lambda;

public class Withoutparameter {
	
	public static void main(String[] args) {
		//Message m = ()-> {return "hello";};
		//System.out.println(m.greet());
		
		Cube c = (a) -> {return a*a*a;};// parameters and statement into single statement 
		System.out.println(c.cal(5));
		
	}

}