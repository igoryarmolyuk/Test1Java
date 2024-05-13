public class Test2 {
    public static void main(String[] args) {
        task2(12345, 14);
    }
    public static void task2(int num, int userNum) {
        int sum = 0;
        int originalNum = num; // Зберігаємо оригінальне число для виведення його пізніше

        // Обчислення суми цифр числа
        while (num != 0) {
            sum += num % 10; // Додаємо останню цифру числа до суми
            num /= 10; // Відкидаємо останню цифру числа
        }

        // Перевірка, чи дорівнює сума цифр заданого числа заданій користувачем константі
        if (sum == userNum) {
            System.out.println("Сума цифр числа " + originalNum + " дорівнює " + userNum);
        } else {
            System.err.println("Сума цифр числа " + originalNum + " не дорівнює " + userNum);
        }
    }
}