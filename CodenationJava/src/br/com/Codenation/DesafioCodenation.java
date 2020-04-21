package br.com.desafioexe;

import java.util.ArrayList;
import java.util.List;


public class DesafioApplication {

    public static List<Integer> fibonacci() {
        List<Integer> arrayFibonacci = new ArrayList();
        arrayFibonacci.add(0);
        arrayFibonacci.add(1);

        for (int i = 2; i < 350; i++) {
            int f1 = arrayFibonacci.get(i - 2);
            int f2 = arrayFibonacci.get(i - 1);

            int f3 = 0;
            f3 = f2 + f1;

            arrayFibonacci.add(f3);
        }


    return arrayFibonacci;

}

        public static Boolean isFibonacci(Integer number) {
            List<Integer> fibonacciList = new ArrayList();
            fibonacciList = fibonacci();
            Boolean isNumberOnList = fibonacciList.contains(number);

            return isNumberOnList;
        }
    }



