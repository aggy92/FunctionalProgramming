package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;

public class PredicateStudentExample {
   static Predicate<Student> gradePredicate = student -> student.getGradeLevel() <= 3;
   static Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.9;

    public static void main(String[] args) {
        filterStudentsByGrade();
        filterStudentsByGpa();
        filterStudents();
    }

    private static void filterStudentsByGrade() {
        System.out.println("filterStudentsByGrade");
        System.out.println("---------------------");
        StudentDataBase.getAllStudents().forEach( student -> {
            if(gradePredicate.test(student)) {
                System.out.println(student);
            }
        });
    }

    private static void filterStudentsByGpa() {
        System.out.println("filterStudentsByGpa");
        System.out.println("---------------------");
        StudentDataBase.getAllStudents().forEach(student -> {
            if(gpaPredicate.test(student)) {
                System.out.println(student);
            }
        });
    }

    private static void filterStudents() {
        System.out.println("filterStudents");
        System.out.println("---------------------");
        StudentDataBase.getAllStudents().forEach(student -> {
            if(gradePredicate.and(gpaPredicate).test(student)) {
                System.out.println(student);
            }
        });
    }
}
