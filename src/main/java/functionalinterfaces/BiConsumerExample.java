package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerExample {

    public static void main(String[] args) {
        biconsumerAddition();
        biconsumerSubstraction();
        biconsumerMultiplication();
        biconsumerDivision();
        biconsumerChain();
        biconsumerStudents();
    }

    private static void biconsumerStudents() {
        List<Student> students = StudentDataBase.getAllStudents();
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + ": " + activities);
        Consumer<Student> consumer = student -> biConsumer.accept(student.getName(), student.getActivities());
        students.forEach(consumer);
    }

    private static void biconsumerChain() {
        BiConsumer<Integer, Integer> biConsumer1 = (a,b) -> System.out.println("Addition: " + (a + b));
        BiConsumer<Integer, Integer> biConsumer2 = (a,b) -> System.out.println("Multiplication: " + a * b);
        BiConsumer<Integer, Integer> biConsumer3 = (a,b) -> System.out.println("Division: " + a / b);
        BiConsumer<Integer, Integer> biConsumer4 = (a,b) -> System.out.println("Substraction: " + (a - b));

        biConsumer1.andThen(biConsumer2).andThen(biConsumer3).andThen(biConsumer4).accept(100, 10);
    }

    private static void biconsumerAddition() {
        BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.println("Addition: " + (a + b));
        biConsumer.accept(10, 5);
    }

    private static void biconsumerMultiplication() {
        BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.println("Multiplication: " + a * b);
        biConsumer.accept(10, 5);
    }

    private static void biconsumerDivision() {
        BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.println("Division: " + a / b);
        biConsumer.accept(10, 5);
    }

    private static void biconsumerSubstraction() {
        BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.println("Substraction: " + (a - b));
        biConsumer.accept(10, 5);
    }
}
