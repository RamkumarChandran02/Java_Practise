package demo.learning;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo {


    public static void main(String[] args) {
       int a[] = {5,6,2,7,1,8};
       String[] names = {"Arulmozhi","Viyan","Niraimathi","Kavin"};

       // Sorting Primitive Data Type (int,char,float,... except boolean can't sort)
        System.out.println("Before Sorting");
        for (int i: a) System.out.println(i);
        System.out.println("After Sorting");
        Arrays.sort(a);
        for (int i: a) System.out.println(i);

        // Sorting Non-Primitive Data Type (Object or any class)
        System.out.println("Before Sorting");
        for (String i: names) System.out.println(i);
        System.out.println("After Sorting");
        Arrays.sort(names);
        for (String i: names) System.out.println(i);

        //Dynamic Binding Sorting names in descending order
        Comparator comp = new ComparatorDemo();
        Arrays.sort(names,comp);
        System.out.println("*********** After Comparator Usage **********");
        for (String i: names) System.out.println(i);

  }
}
