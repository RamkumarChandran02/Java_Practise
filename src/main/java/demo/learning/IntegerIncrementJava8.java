package demo.learning;

import java.util.stream.IntStream;

public class IntegerIncrementJava8 {

    public static void main(String[] args) {
        int total = 0;
        for(int i=0;i<15;i++){
            total = total + i;
        }
        System.out.println("Before Java 8 , "+total);

        int total1 = IntStream.range(0,15).sum();
        System.out.println("After Java 8 , " +total1);
    }
}
