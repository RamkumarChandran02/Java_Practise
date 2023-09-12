package demo.learning;

public class StringContainsVowels {
    public static void main(String[] args) {

        System.out.println(stringContainsVowel("Amazon"));
    }

    public static boolean stringContainsVowel(String str){
        return str.toLowerCase().matches(".*[aeiou].*");

    }
}
