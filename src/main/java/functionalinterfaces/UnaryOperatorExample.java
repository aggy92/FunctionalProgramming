package functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> concatAwesomeOperator = s -> s.concat(" AWESOME");

    public static void main(String[] args) {

        System.out.println(concatAwesomeOperator.apply("I AM"));
    }

}
