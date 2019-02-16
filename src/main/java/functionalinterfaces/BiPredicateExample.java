package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicateExample {

   private BiPredicate<Double, Integer> gpaAndGradePredicate = (gpa, grade) -> gpa < 3.9 && grade < 3;
   private BiConsumer<String, List<String>> printStudent  = (name, activities) -> System.out.println(name + ": " + activities);

   private Consumer<Student> studentConsumer = student -> {
        if(gpaAndGradePredicate.test(student.getGpa(), student.getGradeLevel())) {
            printStudent.accept(student.getName(), student.getActivities());
        }
    };

    public void listStudents() {
        StudentDataBase.getAllStudents().forEach(studentConsumer);
    }

    public static void main(String[] args) {
        new BiPredicateExample().listStudents();
    }
}
