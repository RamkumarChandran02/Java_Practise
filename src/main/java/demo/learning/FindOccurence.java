package demo.learning;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOccurence {

    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 7, 1, 2, 3, 4, 5, 6, 4);
//        findOccurence(list);
//        findSuggestedOccurence(list,1);

        List<String> language = List.of("abc","cde","def","bcd");
        getString(language,"c","bcd");

    }

    private static Map<Integer,Long> findOccurence(List<Integer> duplicateList){

       Map<Integer,Long> occurence =  duplicateList.stream()
               .collect(Collectors.groupingBy(i-> i,Collectors.counting()));
       occurence.forEach((element , count) ->
              System.out.println("Number : " +element+
                ", Occurence :" +count));
      return occurence;
    }

    private static Map<Integer,Long> findSuggestedOccurence(List<Integer> duplicateList,int count){
        Map<Integer,Long> occurence = duplicateList.stream()
                .collect(Collectors.groupingBy(i -> i,Collectors.counting()));

        occurence.entrySet().stream()
                .filter(entry -> entry.getValue()==count)
                .forEach(entry -> System.out.println("Number : "+ entry.getKey()+ " , Count : "+entry.getValue()));

    return occurence;
    }

    private static List<String> getString(List<String> language,String index,String newstring){

         language = language.stream().filter(s -> !s.equals(newstring) && !s.contains(index)).collect(Collectors.toList());

        System.out.println(language);
        return  language;
    }


}
