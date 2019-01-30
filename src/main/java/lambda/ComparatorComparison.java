package lambda;

import java.util.Comparator;

public class ComparatorComparison {
    public static void main(String[] args) {
        comparatorOldWay();
        comparatorUsingLambda();
    }

    private static void comparatorOldWay() {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Compare result: " + comparator.compare(10, 100));

    }


    private static void comparatorUsingLambda() {
        Comparator<Integer> comparator = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("Compare result using lambda: " + comparator.compare(100,10));
        Comparator<Integer> comparator1 = (a,b) -> a.compareTo(b);
        System.out.println("Compare result using lambda 2: " + comparator.compare(100,100));
    }
}
