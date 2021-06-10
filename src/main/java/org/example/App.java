package org.example;

import java.util.*;

public class App {
    public static void main(String[] args) {

        List<String> words = Arrays.asList(
                "cat", "dog", "rat", "hamster", "pig",
                "elephant", "giraffe", "cat", "dog", "bunny",
                "pig", "rat", "elephant", "bird", "parrot",
                "dog", "bunny", "giraffe", "hamster", "cat"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Start array: ");
        System.out.println(words.toString());
        System.out.println("Unique words");
        System.out.println(unique.toString());
        System.out.println("Number of occurrence words: ");
        for (String key : unique) {
            System.out.print(key + "-" + Collections.frequency(words, key) + ", ");
        }
    }
}
