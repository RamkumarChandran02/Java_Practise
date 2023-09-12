package demo.learning;


import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReverseWord {
    private static final Pattern PATTERN = Pattern.compile(" +");
    public static void main(String[] args) {
        System.out.println(reverseWords("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. " +
                "Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus " +
                "et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, " +
                "ultricies nec, pellentesque eu, pretium quis, sem. "));

    }

    public static String reverseWords(String str){

        return PATTERN.splitAsStream(str).map(w -> new StringBuilder(str)
                .reverse()).collect(Collectors.joining(" "));
    }
}
