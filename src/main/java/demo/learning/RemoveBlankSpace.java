package demo.learning;

public class RemoveBlankSpace {
    public static void main(String[] args) {
        String str = "In this case, we are going to declare a new ";
        str = str.replaceAll("\\s","");

        for (int i = 0; i < str.length(); i++){
            char c =str.charAt(i);
            System.out.println(c);
    }

    }
}
