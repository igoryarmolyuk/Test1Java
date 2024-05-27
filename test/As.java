package test;

import java.util.ArrayList;
import java.util.Collections;

public class As {
        public static void main(String[] args) {
                ArrayList<Integer> numbers = new ArrayList<>();
                numbers.add(10);
                numbers.add(20);
                numbers.add(30);
                numbers.add(40);
                numbers.add(5);
                System.out.println("Найбільший елемент: " + test(numbers));
                ArrayList<Integer> palidrom = new ArrayList<>();
                palidrom.add(101);
                palidrom.add(205);
                palidrom.add(3021);
                palidrom.add(404);
                palidrom.add(232);
                System.out.println(test2(palidrom));

        }
        public static int test(ArrayList<Integer> numbers) {
            return Collections.max(numbers);
        }

        public static int test2(ArrayList<Integer> numbers) {
                
                return 1;
        }
}
