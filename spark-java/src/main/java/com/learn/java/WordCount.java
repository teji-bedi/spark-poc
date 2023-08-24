package com.learn.java;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCount {
    static String[] COUNTRY_NAMES
            = { "China", "Australia", "India", "USA", "USSR", "UK", "China",
            "France", "Poland", "Austria", "India", "USA", "Egypt", "China" };
    public static void main(String[] args) {

        Map<String, Long> counterMap = new HashMap<>();

        Stream.of(COUNTRY_NAMES)
                .collect(Collectors.groupingBy(k -> k, ()-> counterMap,
                        Collectors.counting()));
        counterMap.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
