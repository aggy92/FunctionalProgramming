package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students, predicate) -> students.stream()
            .filter(predicate::test)
            .collect(Collectors.toMap(Student::getName, Student::getGpa, (next, prev) -> next, HashMap::new));

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.gpaPredicate));
    }
}
