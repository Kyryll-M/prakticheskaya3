import java.util.Scanner;

class DataFormatExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення даних
        System.out.print("Введіть ціле число: ");
        int integerValue = scanner.nextInt();

        System.out.print("Введіть число з плаваючою точкою: ");
        double floatValue = scanner.nextDouble();

        scanner.nextLine(); // Очищення буфера

        System.out.print("Введіть рядок: ");
        String stringValue = scanner.nextLine();

        System.out.print("Введіть логічне значення (true/false): ");
        boolean booleanValue = scanner.nextBoolean();

        // Виведення даних у різних форматах
        System.out.println("\nЦілі числа:");
        System.out.printf("Десятковий формат: %d%n", integerValue);
        System.out.printf("Шістнадцятковий формат: %x%n", integerValue);
        System.out.printf("Вісімковий формат: %o%n", integerValue);

        System.out.println("\nЧисла з плаваючою точкою:");
        System.out.printf("Стандартний формат: %.2f%n", floatValue);
        System.out.printf("Науковий формат: %.2e%n", floatValue);
        System.out.printf("Формат без десяткових: %.0f%n", floatValue);

        System.out.println("\nРядки:");
        System.out.printf("Оригінальний рядок: '%s'%n", stringValue);
        System.out.printf("Рядок з фіксованою шириною 20 символів (вліво): '%-20s'%n", stringValue);
        System.out.printf("Рядок з фіксованою шириною 20 символів (вправо): '%20s'%n", stringValue);
        System.out.printf("Рядок з фіксованою шириною 20 символів (по центру): '%20s'%n", stringValue);

        System.out.println("\nЛогічні значення:");
        System.out.printf("Логічне значення (true/false): %b%n", booleanValue);
        System.out.printf("Логічне значення в текстовому форматі: '%s'%n", booleanValue ? "True" : "False");

        // Закриття сканера
        scanner.close();
    }
}