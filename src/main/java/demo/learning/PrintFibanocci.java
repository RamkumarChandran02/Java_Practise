package demo.learning;

public class PrintFibanocci {
    public static void main(String[] args) {
        printFibanocciSequence(12);
    }

    public static void printFibanocciSequence(int count){
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 0; i<=count;i++){
            System.out.println(a + ",");
            a = b;
            b = c;
            c = a+b;
        }
    }
}
