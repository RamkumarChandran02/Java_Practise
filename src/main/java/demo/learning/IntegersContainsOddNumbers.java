package demo.learning;

import java.util.List;

public class IntegersContainsOddNumbers {
    public static void main(String[] args) {
        onlyOddNumbers(List.of(1,2,3,4));

    }

    public static boolean onlyOddNumbers(List<Integer> list){
        return list.parallelStream().anyMatch(x->x/2!=0);
    }
}
