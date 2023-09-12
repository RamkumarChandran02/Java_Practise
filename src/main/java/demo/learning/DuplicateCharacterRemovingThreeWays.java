package demo.learning;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharacterRemovingThreeWays {

    public static void main(String[] args) {
        System.out.println(findDuplicateUsingForLoop("code decode"));

        String input = "hello world";

        long uniqueCharacterCount = countUniqueCharacters(input);

        System.out.println("Number of unique characters: " + uniqueCharacterCount);

    }

    private static Set<Character> findDuplicateUsingForLoop(String name){

        Set<Character> duplicates = new LinkedHashSet<>();

        for (int i=0;i<name.length();i++){
            for (int j=0;j<name.length();j++){
                if(name.charAt(i) == name.charAt(j)){
                    duplicates.add(name.charAt(j));
                }
            }
        }

        return duplicates;
    }

    public static long countUniqueCharacters(String input) {
        Set<Character> uniqueCharacters = new HashSet<>();

        input.chars()
                .mapToObj(character -> (char) character)
                .forEach(uniqueCharacters::add);

        return uniqueCharacters.size();
    }
}
