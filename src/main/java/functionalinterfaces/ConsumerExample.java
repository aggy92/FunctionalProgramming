package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    private static List<Student> students;
    private static Consumer<Student> c1 = (student) -> System.out.println(student.getName());
    private static Consumer<Student> c2 = (student) -> System.out.println(student.getName());
    private static Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());

    public static void main(String[] args) {
        students = StudentDataBase.getAllStudents();
        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
        consumer.accept("hi consumer");
        printNames();
        System.out.println("---------------------------------------");
        printNamesAndActivities();
        System.out.println("---------------------------------------");
        printWithCondition();
    }

    private static void printNames() {
        students.forEach(c1);
    }

    private static void printNamesAndActivities() {
        students.forEach(c2.andThen(c3));
    }

    public static void printWithCondition() {
        students.forEach(student -> {
            if(student.getGradeLevel() >= 3) {
                c2.andThen(c3).accept(student);
            }
        });
    }
}
