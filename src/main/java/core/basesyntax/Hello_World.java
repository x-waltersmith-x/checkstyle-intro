package core.basesyntax;

import core.basesyntax.Model.Dog;
import core.basesyntax.Model.Cat;
import java.time.LocalDate;

public class Hello_World {
    private String welcomeMessage;
    private int currentYear;
    private int age;
    private int size;


    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }

    private String getFromOneToTen() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result.append(i).append(" ");
            }
        }
        return result.toString();
    }

    private static final String greetings = "Hello, Mate! I am happy to see you! "
            + "This class looks weird! Your task is to fix the checkstyle in this file. "
            + "Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message";

    private void sayHello(String hello) {
        System.out.println(greetings);
        System.out.println(hello);
    }

    private void initializeVariables() {
        welcomeMessage = "Hello mates!";
        System.out.println(welcomeMessage);

        currentYear = LocalDate.now().getYear();
        System.out.println("It is " + currentYear + "year");

        age = 25;
        System.out.println("I'm " + age);

        size = 42;
        System.out.println("The size is " + size);
    }
}
