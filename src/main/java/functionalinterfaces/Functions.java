package functionalinterfaces;

import java.util.function.Function;

public class Functions {

    public static Function<String, String> toUpperCase = s -> s.toUpperCase();

    public static Function<String, String> addAwesome = s -> s.concat(" Awesome ");

    public static Function<String, Integer> sizeOf = s -> s.length();

    public static void main(String[] args) {
        System.out.println("Result of toUpperCase: " + toUpperCase.apply("this is spartaaaaa!"));
        System.out.println("Result of andThen: " + toUpperCase.andThen(addAwesome).apply("I am"));
        System.out.println("Result of compose: " + toUpperCase.compose(addAwesome).apply("I am"));
    }
}
