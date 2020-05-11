package com.falmeida.tech.sample;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamReduceSample {

	public static void main(String[] args) {
		
	    List<Integer> numbers = Arrays.asList(2,3,4,5,2); 
	  
	    Set<Integer> squareSet = 
	         numbers
	         .stream()
	         .map(x->x*x)
	         .collect(Collectors.toSet()); 
	    
	    System.out.println(squareSet); 
	  
	    numbers
	    	.stream()
	    	.map(x->x*x)
	    	.forEach(y->System.out.println(y)); 
	  
	    int even = numbers
	    		.stream()
	    		.filter(x->x%2==0)
	    		.reduce(0,(ans,i)-> ans+i); 
	  
	    System.out.println(even); 
		
	}
	
}
