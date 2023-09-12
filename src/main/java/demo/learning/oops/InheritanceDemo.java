package demo.learning.oops;

public class InheritanceDemo {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();

    }

}

class Animal{
    String name;
    int age;

    void makeSound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Boow Boww");
    }
}

class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Meooow ! Meoow! ");
    }
}