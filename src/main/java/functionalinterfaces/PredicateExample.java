package functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> predicate1 = i -> i%2 == 0;
    static Predicate<Integer> predicate2 = i -> i%5 == 0;

    public static void main(String[] args) {
        testPredicate();
        testAnd();
        testOr();
        testNegative();
    }

    private static void testPredicate() {
        System.out.println(predicate1.test(10));
        System.out.println(predicate2.test(15));
    }

    private static void testAnd() {
        System.out.println("p1 && p2 " + predicate1.and(predicate2).test(20)); //predicate chaining
        System.out.println("p1 && p2 " + predicate1.and(predicate2).test(15)); //predicate chaining
    }

    private static void testOr() {
        System.out.println("p1 || p2 " + predicate1.or(predicate2).test(20)); //predicate chaining
        System.out.println("p1 || p2 " + predicate1.or(predicate2).test(15)); //predicate chaining
    }

    private static void testNegative() {
        System.out.println("p1 && p2 negated" + predicate1.and(predicate2).negate().test(20)); //predicate chaining
        System.out.println("p1 && p2 negated" + predicate1.and(predicate2).negate().test(15)); //predicate chaining
    }
}
