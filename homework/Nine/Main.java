package homework.Nine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // task1
        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.add(1);
        intArray.add(12);
        intArray.add(12);
        intArray.add(231);
        intArray.add(1231);
        System.out.println("the max number is: " + HomeWorkNine.max(intArray));
        // task2
        String str = "radar";
        boolean isPalindrome = HomeWorkNine.isPalindrome(str);
        System.out.println("Чи є рядок паліндромом? " + isPalindrome);
        // task3
        ArrayList<Integer> uniqueNumbers = HomeWorkNine.findUnique(intArray);
        System.out.println("Унікальні елементи: " + uniqueNumbers);
        // task4
        HashMap<Integer, Integer> frequencyMap = HomeWorkNine.countFrequency(intArray);
        for (Integer key : frequencyMap.keySet()) {
            System.out.println("Елемент " + key + " зустрічається " + frequencyMap.get(key) + " разів.");
        }
        // task5
        String text = "hello world hello java world java code";
        HashMap<String, Integer> frequencyMap1 = HomeWorkNine.countWordFrequency(text);
        for (String word : frequencyMap1.keySet()) {
            System.out.println("Слово \"" + word + "\" зустрічається " + frequencyMap1.get(word) + " разів.");
        }
    }

    static class HomeWorkNine {
        public static int max(ArrayList<Integer> array) {
            if (array.isEmpty()) {
                throw new IllegalArgumentException("ArrayList is empty");
            }

            int max = array.get(0);

            for (int i = 1; i < array.size(); i++) {
                if (array.get(i) > max) {
                    max = array.get(i);
                }
            }
            return max;
        }
        public static boolean isPalindrome(String str) {
            str = str.toLowerCase();
            int n = str.length();
            for (int i = 0; i < n / 2; i++) {
                if (str.charAt(i) != str.charAt(n - i - 1)) {
                    return false;
                }
            }
            return true;
        }

        public static ArrayList<Integer> findUnique(ArrayList<Integer> list) {
            return new ArrayList<>(new HashSet<>(list));
        }

        public static HashMap<Integer, Integer> countFrequency(ArrayList<Integer> array) {
            HashMap<Integer, Integer> frequencyMap = new HashMap<>();
            for (int num : array) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
            return frequencyMap;
        }

        public static HashMap<String, Integer> countWordFrequency(String text) {
            HashMap<String, Integer> frequencyMap = new HashMap<>();
            String[] words = text.split("\\s+");
            for (String word : words) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
            return frequencyMap;
        }

        public static List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> map = new HashMap<>();
            for (String str : strs) {
                char[] chars = str.toCharArray();
                java.util.Arrays.sort(chars);
                String sorted = new String(chars);

                if (!map.containsKey(sorted)) {
                    map.put(sorted, new ArrayList<>());
                }
                map.get(sorted).add(str);
            }

            return new ArrayList<>(map.values());
        }
    }
}