package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionStudentExample {
    static Function<List<Student>, HashMap<String, Double>> studentFunction = students -> {
        HashMap<String, Double> studentGPAMap = new HashMap<>();

        students.forEach( student -> {
            if(PredicateStudentExample.gradePredicate.test(student))
                studentGPAMap.put(student.getName(), student.getGpa());
        });
        return studentGPAMap;
    };

    static Function<List<Student>, HashMap<String, Double>> studentFunctionComplex = students -> {
        HashMap<String, Double> studentGPAMap = new HashMap<>();

        return students.stream()
                .filter(s -> PredicateStudentExample.gradePredicate.test(s))
                .collect(Collectors.toMap(Student::getName, Student::getGpa, (prev, next) -> next, HashMap::new));

    };

    public static void main(String[] args) {
        System.out.println(studentFunctionComplex.apply(StudentDataBase.getAllStudents()));
    }
}
