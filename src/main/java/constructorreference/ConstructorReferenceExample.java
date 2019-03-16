package constructorreference;

import data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = Student::new;
        Function<String, Student> createWithName = Student::new;

        System.out.println(studentSupplier.get());
        System.out.println(createWithName.apply("Kamil"));
    }
}
