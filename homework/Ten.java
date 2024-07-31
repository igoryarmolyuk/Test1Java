package homework;

import java.util.*;

public class Ten {
    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }

        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    public static String reverseString(String str) {
        if (str == null) {
            return null; // повертаємо null, якщо вхідний рядок null
        }

        // Створюємо об'єкт StringBuilder з вмістом вхідного рядка
        StringBuilder reversed = new StringBuilder(str);

        // Використовуємо метод reverse для обертання рядка
        reversed.reverse();

        // Повертаємо обернений рядок у форматі String
        return reversed.toString();
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false; // рядок null не є паліндромом
        }

        // Перетворюємо рядок у нижній регістр для порівняння
        str = str.toLowerCase();

        // Створюємо об'єкт StringBuilder з вмістом вхідного рядка
        StringBuilder reversed = new StringBuilder(str);

        // Використовуємо метод reverse для обертання рядка
        reversed.reverse();

        // Перевіряємо, чи обернений рядок дорівнює вихідному рядку
        return str.equals(reversed.toString());
    }

    public static String removeDuplicates(String str) {
        if (str == null) {
            return null; // повертаємо null, якщо вхідний рядок null
        }

        // Використовуємо LinkedHashSet для збереження унікальних символів у порядку їх появи
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        // Перебираємо кожен символ у рядку
        for (char ch : str.toCharArray()) {
            // Якщо символ ще не додано до множини, додаємо його і до результату
            if (seen.add(ch)) {
                result.append(ch);
            }
        }

        // Повертаємо новий рядок без дублікатів
        return result.toString();
    }

    public static String[] stringToWordsArray(String str) {
        if (str == null || str.isEmpty()) {
            return new String[0]; // повертаємо порожній масив, якщо вхідний рядок null або порожній
        }

        // Розділяємо рядок по пробілах
        return str.split("\\s+");
    }

    public static String reverseString1(String str) {
        if (str == null) {
            return null; // повертаємо null, якщо вхідний рядок null
        }

        // Створюємо об'єкт StringBuilder з вмістом вхідного рядка
        StringBuilder reversed = new StringBuilder(str);

        // Використовуємо метод reverse для обертання рядка
        reversed.reverse();

        // Повертаємо обернений рядок у форматі String
        return reversed.toString();
    }

    public static String capitalizeFirstLetterOfEachWord(String str) {
        if (str == null || str.isEmpty()) {
            return str; // повертаємо оригінальний рядок, якщо він null або порожній
        }

        // Розділяємо рядок по пробілах
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();

        // Перебираємо кожне слово
        for (String word : words) {
            if (word.length() > 0) {
                // Перетворюємо першу літеру на верхній регістр, решту залишаємо як є
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                // Додаємо слово до результатного рядка з пробілом
                result.append(capitalizedWord).append(" ");
            }
        }

        // Повертаємо результатний рядок, видаливши зайвий пробіл у кінці
        return result.toString().trim();
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false; // Якщо один з рядків null, вони не можуть бути анаграмами
        }

        if (str1.length() != str2.length()) {
            return false; // Якщо довжини рядків різні, вони не можуть бути анаграмами
        }

        // Перетворюємо рядки на масиви символів
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Сортуємо масиви символів
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Порівнюємо відсортовані масиви символів
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        // Приклади використання функції
        String sentence1 = "Це приклад рядка з кількома словами.";
        String sentence2 = "   Інший   приклад    з  нерівномірними пробілами.   ";
        String sentence3 = "  ";
        String sentence4 = "";

        System.out.println("Кількість слів у рядку 1: " + countWords(sentence1));
        System.out.println("Кількість слів у рядку 2: " + countWords(sentence2));
        System.out.println("Кількість слів у рядку 3: " + countWords(sentence3));
        System.out.println("Кількість слів у рядку 4: " + countWords(sentence4));

        // Приклад використання методу
        String input = "hello";
        System.out.println("Вхідний рядок: " + input);
        System.out.println("Обернений рядок: " + reverseString(input));

        // Приклад використання методу
        String input1 = "radar";
        String input2 = "hello";

        System.out.println("Чи є \"" + input1 + "\" паліндромом? " + isPalindrome(input1));
        System.out.println("Чи є \"" + input2 + "\" паліндромом? " + isPalindrome(input2));

        System.out.println("Вхідний рядок: " + input1 + " -> Рядок без дублікатів: " + removeDuplicates(input1));
        System.out.println("Вхідний рядок: " + input2 + " -> Рядок без дублікатів: " + removeDuplicates(input2));

        // Приклад використання методу
        String input3 = "hello world";
        String input4 = "This is a test string";
        String input5 = "   Leading and trailing spaces   ";

        String[] words1 = stringToWordsArray(input1);
        String[] words2 = stringToWordsArray(input2);
        String[] words3 = stringToWordsArray(input3);

        // Виведення результатів
        System.out.println("Вхідний рядок: \"" + input3 + "\" -> Масив слів: " + java.util.Arrays.toString(words1));
        System.out.println("Вхідний рядок: \"" + input4 + "\" -> Масив слів: " + java.util.Arrays.toString(words2));
        System.out.println("Вхідний рядок: \"" + input5 + "\" -> Масив слів: " + java.util.Arrays.toString(words3));

        // Приклад використання методу
        String input6 = "hello";
        System.out.println("Вхідний рядок: " + input6);
        System.out.println("Обернений рядок: " + reverseString(input6));

        String input7 = "hello world";
        String input8 = "this is a test string";
        String input9 = "  multiple   spaces  here ";

        System.out.println("Вхідний рядок: \"" + input7 + "\" -> Результат: \"" + capitalizeFirstLetterOfEachWord(input1) + "\"");
        System.out.println("Вхідний рядок: \"" + input8 + "\" -> Результат: \"" + capitalizeFirstLetterOfEachWord(input2) + "\"");
        System.out.println("Вхідний рядок: \"" + input9 + "\" -> Результат: \"" + capitalizeFirstLetterOfEachWord(input3) + "\"");

        String input10 = "listen";
        String input11 = "silent";
        String input12 = "hello";
        String input13 = "world";

        System.out.println("Чи є \"" + input10 + "\" і \"" + input11 + "\" анаграмами? " + areAnagrams(input10, input11)); // Виведе: true
        System.out.println("Чи є \"" + input12 + "\" і \"" + input13 + "\" анаграмами? " + areAnagrams(input12, input13));
    }
}
