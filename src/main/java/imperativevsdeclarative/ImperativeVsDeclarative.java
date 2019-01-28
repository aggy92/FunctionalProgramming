package imperativevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

    public static void main(String[] args) {
        int n = 100;
        System.out.println("Sum from 1 to " + n + " using imperative apporach: " + sumWithImperativeApproach(n));
        System.out.println("Sum from 1 to " + n + " using declarative apporach: " + sumWithDeclarativeApproach(n));

        List<Integer> numbersWithDuplicates = Arrays.asList(1,1,2,3,4,4,4,5,6,6,7,8,9,9);
        System.out.println("Unique list using imperative approach: " + returnUniqueListWithImperativeApproach(numbersWithDuplicates));
        System.out.println("Unique list using declarative approach: " + returnUniqueListWithDeclarativeApproach(numbersWithDuplicates));

    }

    /**
     * Imperative approach - how the task is done.
     */

    private static int sumWithImperativeApproach(int to) {
        int sum = 0;
        for(int i = 1; i <= to; i++ ) {
            sum += i;
        }
        return sum;
    }

    private static List<Integer> returnUniqueListWithImperativeApproach(List<Integer> numbers) {
        List<Integer> uniqueNumbers = new ArrayList<>();
        for(Integer number : numbers) {
            if(!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }
        return uniqueNumbers;
    }

    /**
     * Declarative approach - what is done.
     */
    private static int sumWithDeclarativeApproach(int to) {
        return IntStream.rangeClosed(0, to)
                .sum();
    }

    private static List<Integer> returnUniqueListWithDeclarativeApproach(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
