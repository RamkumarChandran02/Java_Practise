package demo.learning;

import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] words = str.split("\\W+");
        System.out.println(words.length);
        System.out.println(str.length());
    }
}
