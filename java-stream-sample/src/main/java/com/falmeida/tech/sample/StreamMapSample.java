package com.falmeida.tech.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapSample {

	public static void main(String args[]){ 
	  
	    List<Integer> number = Arrays.asList(2,3,4,5); 
	  
	    List<Integer> square = number
	    		.stream()
	    		.map(x -> x*x)
	    		.collect(Collectors.toList()); 
	    
	    System.out.println(square); 
	    
	  } 
	
}
