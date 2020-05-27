package com.falmeida.tech.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapSample01 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Jim", "John", "Joe", "Josh");

        List<String> namesUpper = new ArrayList<>();
        for (String s : names) {
            namesUpper.add(s.toUpperCase());
        }

        System.out.println(names); 
        System.out.println(namesUpper); 

        // Java 8
        List<String> collect = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1); 
		
	}
	
}
