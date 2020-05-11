package com.falmeida.tech.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedSample {

	public static void main(String[] args) {
		
		List<String> names = 
                Arrays.asList("Kubernetes","APIs","Reflection","Collection","Stream"); 
		
	    List<String> show = 
	            names.stream().sorted().collect(Collectors.toList()); 
	    
	    System.out.println(show); 
		
	}
	
}
