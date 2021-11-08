package com.jamilxt.book.modernjavarecipes.chapter7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @author jamilxt
 * @created 07 Nov, 2021
 */
public class ProcessFiles {
    public static void main(String[] args) {
        try (Stream<String> lines = Files.lines(Paths.get("/usr/share/dict/web2"))){
            lines.filter(s -> s.length() > 20)
                    .sorted(Comparator.comparingInt(String::length).reversed())
                    .limit(10)
                    .forEach(word -> System.out.printf("%s (%d)%n", word, word.length()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
