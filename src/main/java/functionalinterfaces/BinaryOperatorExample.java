package functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {
        BinaryOperator<Integer> multiplication = (num1, num2) -> num1 * num2;

        System.out.println(multiplication.apply(3, 11));

        Comparator<Integer> comparator = Integer::compareTo;

        BinaryOperator<Integer> findMax = BinaryOperator.maxBy(comparator);
        BinaryOperator<Integer> findMin = BinaryOperator.minBy(comparator);

        System.out.println("findMax: " + findMax.apply(3 , 2));
        System.out.println("findMin: " + findMin.apply(21, 441));
    }
}
