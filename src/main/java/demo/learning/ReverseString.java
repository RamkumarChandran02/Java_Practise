package demo.learning;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString str = new ReverseString();
        System.out.println(str.reverse("NIDHI HEGDE"));


    }

    public String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
