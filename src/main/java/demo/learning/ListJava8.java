package demo.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListJava8 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Sam","Mani","Sam","Dinesh");

        List<String> uniqueList = new ArrayList<>();

        for(String name : list){
            if(!uniqueList.contains(name)){
                uniqueList.add(name);
            }
        }
        System.out.println("Before Java 8 : " +uniqueList);

       List<String> uniqueList1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println( "Afte Java 8" +uniqueList1);
    }
}
