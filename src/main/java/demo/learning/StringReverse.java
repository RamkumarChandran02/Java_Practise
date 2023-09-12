package demo.learning;

public class StringReverse {

    public static void main(String[] args) {
        String str = "I am ABC";
        System.out.println(reverseStringPreserveSpace(str));
    }

    public static String reverseStringPreserveSpace(String str){

        char[] inputArray = str.toCharArray();
        char[] result = new char[inputArray.length];

        for (int i=0;i<inputArray.length;i++){
            if(inputArray[i] == ' '){
                result[i] = ' ';
            }
        }

        int j = result.length - 1;
        for (int i=0;i<inputArray.length;i++){
            if(inputArray[i] != ' '){
                if(result[j] == ' '){
                    j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }

        return String.valueOf(result);
    }
}