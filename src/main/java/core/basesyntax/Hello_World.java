package core.basesyntax;

import core.basesyntax.Model.Dog;
import core.basesyntax.Model.Cat;

import java.time.LocalDate;

public class Hello_World {
    private String a = "";
    private int variable = 0;
    private int age = 0;
    private int size = 0;


    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }

    private String getFromOneToTen() {
        String result = "";

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result = result + i + " ";
            }
        }
        return result;
    }

    private void sayHello(String hello) {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird! Your task is to fix the checkstyle in this file. Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println(hello);
    }

    private void initializeVariables() {
        a = "Hello mates!";
        System.out.println(a);
        variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
