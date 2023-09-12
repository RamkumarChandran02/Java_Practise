package demo.learning;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class WordBreak {

    public static void main(String[] args) {
        WordBreak wordBreak = new WordBreak();
        System.out.println(wordBreak.wordBreak("leetcode",List.of("leet","code")));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        for(String str : wordDict){
            if(str.equals(s)){
                return true;
            }
        }
    return false;
    }

    public boolean arraySort(String s, List<String> wordDict){



        return false;
    }
    }
