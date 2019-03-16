package methodreference;

import java.util.function.UnaryOperator;

public class UnaryMethodReferenceExample {
    public static void main(String[] args) {
        UnaryOperator<String> stringUnaryOperator = String::toUpperCase;

        System.out.println(stringUnaryOperator.apply("hello:)"));
    }
}
