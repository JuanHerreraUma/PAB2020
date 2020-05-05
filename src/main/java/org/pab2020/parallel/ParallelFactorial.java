package org.pab2020.parallel;
import org.pab2020.factorial.Factorial;
import org.pab2020.factorial.HeavyFactorial;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelFactorial {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13) ;
        List<Long> factorialValues ;

        HeavyFactorial factorial = new HeavyFactorial(1000000) ;

        int numberOfCoresToUse = 4;
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "" + numberOfCoresToUse);
        long initTime = System.currentTimeMillis() ;

        factorialValues = numbers
                .stream()
                .map(number -> factorial.compute(number))
                .collect(Collectors.toList());

        long totalTime = System.currentTimeMillis() - initTime ;

        System.out.println("Total computing time: " + totalTime) ;

        for (int i = 0; i < factorialValues.size(); i++){
            System.out.println("Number: " + numbers.get(i) + ". Factorial: " + factorialValues.get(i));
        }
}
}
