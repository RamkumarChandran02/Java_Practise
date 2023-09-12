package demo.learning;

public class CheckPalindrome {
    public static void main(String[] args) {
        toCheckPalindrome("ABACUSA");

    }

    public static boolean toCheckPalindrome(String input){
        boolean result = true;
        int length = input.length();

        for(int i = 0;i<length/2;i++){
            if (input.charAt(i) != input.charAt(length - i -1)){
                result = false;
                break;
            }
        }
        return result;
    }
}
