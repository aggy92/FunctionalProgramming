package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumersExample {

    Predicate<Student> gpaLevel = student -> student.getGpa() <= 3.9;
    Predicate<Student> gradeLevel = student -> student.getGradeLevel() <= 3;

    BiConsumer<String, List<String>> printStudentAndActivities = (name, activities) -> System.out.println(name + ": " + activities);

    Consumer<Student> listStudents = student -> {
        if(gpaLevel.and(gradeLevel).test(student)) {
            printStudentAndActivities.accept(student.getName(), student.getActivities());
        }
    };

    public static void main(String[] args) {
        new PredicateAndConsumersExample().showStudents();
    }

    public void showStudents() {
        StudentDataBase.getAllStudents().forEach(listStudents);
    }
}
