package demo.learning;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.partitioningBy;

public class OccurenceOfCertainCharacter {
    public static void main(String[] args) {
        System.out.println(countOccurenceofCertainCharacter("ramkumar",'r'));

        System.out.println(countingVowelsandConsonants("aeiou"));

        System.out.println(countingVowelsAndConsonentsUsingMap("Jaishree"));
    }

    public static long countOccurenceofCertainCharacter(String str,char ch){

        return str.chars().filter( c -> c == ch).count();
    }



    private static final Set<Character> allVowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    public static Map<Long,Long> countingVowelsandConsonants(String str){

         str.toLowerCase();

         long vowels = str.chars().filter(c -> allVowels.contains((char)c)).count();

         long consonants = str.chars().filter(c -> !allVowels.contains((char)c)).count();

        return Map.of(vowels,consonants) ;
    }

    public static Map<Long,Long> countingVowelsAndConsonentsUsingMap(String str){
        Map<Boolean, Long>  result = str.chars().mapToObj(c -> (char) c)
                .filter(ch -> (ch >= 'a' && ch <= 'z') )
                .collect(partitioningBy(c -> allVowels.contains(c),counting()));
        return Map.of(result.get(true),result.get(false));

    }
}
