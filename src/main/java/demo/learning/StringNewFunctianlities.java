package demo.learning;

public class StringNewFunctianlities {

    static String name = "RAMKUMAR";

    public static void main(String[] args) {
        verifyIsBlank(" ");
        verifyIsEmpty(" ");

        verifyIsBlank(" n ");
        verifyIsEmpty(" ");
    }
    public static void verifyIsBlank(String str){
        System.out.println(" Verified String " +str+ " is Blank : " +str.isBlank());
    }
    public static void verifyIsEmpty(String str){
        System.out.println(" Verified String " +str+ " is Empty : " +str.isEmpty());
    }
}


class B {

    StringNewFunctianlities s = new StringNewFunctianlities();
    s.name
}