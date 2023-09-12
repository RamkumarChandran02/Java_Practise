package demo.learning;

// Swapping numbers without third variable in Java

public class SwapNumbers {

    public static void main(String[] args) {
        swapNumberWithoutThirdVariable(12,34);

    }

    public static void swapNumberWithoutThirdVariable(int a, int b){

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Numbers after swapping a = :" +a+" b = "+b);


    }

}
