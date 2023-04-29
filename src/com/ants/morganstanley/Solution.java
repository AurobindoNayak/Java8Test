package com.ants.morganstanley;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;


/*
 * Create the Filter and Mapper classes here.
 */
class CharactersCount {
    private final String name;
    private final Integer distinctCharacterCount;

    public CharactersCount(String name, Integer distinctCharacterCount) {
        this.name = name;
        this.distinctCharacterCount = distinctCharacterCount;
    }

    @Override
    public String toString() {
        return "\"" + this.name + "\" has " + this.distinctCharacterCount + " distinct characters.";
    }
}

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "aaryanna",
                "aayanna",
                "airianna",
                "alassandra",
                "allanna",
                "allannah",
                "allessandra",
                "allianna",
                "allyanna",
                "anastaisa",
                "anastashia",
                "anastasia",
                "annabella",
                "annabelle",
                "annebelle"
        );

        names.stream()
                .filter(Filter.nameStartingWithPrefix(scanner.nextLine()))
                .map(Mapper.getDistinctCharactersCount())
                .forEachOrdered(System.out::println);
    }


}

class Filter {
    public static Predicate<String> nameStartingWithPrefix(String prefix) {
        return x -> x.startsWith(prefix);
    }
}

class Mapper {
    public static Function<String, CharactersCount> getDistinctCharactersCount() {
      return s->new CharactersCount(s,(int)s.chars().distinct().count());
    }
    
//    public static CharactersCount getData(String name){
//       //CharactersCount ct = new CharactersCount();
//        Integer i = (int) (long) name.chars().distinct().count();
//        CharactersCount ct = new CharactersCount(name,i);
//        return ct;
//    }
}



