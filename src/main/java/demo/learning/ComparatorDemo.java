package demo.learning;

import java.util.Comparator;

public class ComparatorDemo implements Comparator {
    public int compare(Object o1, Object o2) {

        String S1 = (String)o1;
        String S2 = o2.toString();

        if(S1.length() > S2.length()) {
            return -1;
        }
        else if (S1.length() < S2.length()){
            return +1;
        }
        else return 0;
    }
}
