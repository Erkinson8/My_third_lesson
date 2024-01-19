import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println(" Hello World");
        double[] numbers = { 5.2, 3.1, -7.4, -8.9, -2.5, 2.6, 7.8, 4.6, 8.9, -9.1, -8.8, -9.3, -8.2, -5.5, -7.1 };

        int firstNegativeIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }

        if (firstNegativeIndex != -1 && firstNegativeIndex < numbers.length - 1) {
            double sum = 0;
            int count = 0;

            for (int i = firstNegativeIndex + 1; i < numbers.length; i++) {
                if (numbers[i] > 0) {
                    sum += numbers[i];
                    count++;
                }
            }

            if (count > 0) {
                //double average = sum/count;
                System.out.println("Среднее арифметическое: " +  + sum + "/" + count);
            } else {
                System.out.println("После первого отрицательного числа нет положительных чисел.");
            }
        } else {
            System.out.println("Отрицательные числа не найдены.");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();
        scanner.close();

        String cleanedString = cleanAndLowercase(inputString);

        boolean isPalindrome = checkPalindrome(cleanedString);


        if (isPalindrome) {
            System.out.println("Эта строка - палиндром.");
        } else {
            System.out.println("Эта строка - не палиндром.");
        }
    }

    private static String cleanAndLowercase(String input) {
        return input.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }

    private static boolean checkPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
