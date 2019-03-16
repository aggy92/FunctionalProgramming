package methodreference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    public static void main(String[] args) {
        Consumer<Student> studentConsumer = System.out::println;
        Consumer<Student> activitiesConsumer = Student::printAllActivities;

        StudentDataBase.getAllStudents().forEach(studentConsumer);
        StudentDataBase.getAllStudents().forEach(activitiesConsumer);
    }
}
