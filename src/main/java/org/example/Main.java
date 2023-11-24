package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, 2, 5, 4, 8, 6, 7, 10);
        double average = numbers.stream()
                .filter(Integer -> Integer % 2 == 0).mapToInt(a -> a)
                .average().orElse(0);

        System.out.println(average);
    }
}