package com.falmeida.tech.sample;

public static void main(String[]args){

        List<String> myList =
        Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
        .stream()
        .filter(s -> s.startsWith("c"))
        .map(String::toUpperCase)
        .sorted()
        .forEach(System.out::println);

// C1
// C2

        }