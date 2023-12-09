import java.util.Arrays;

public class HomeWorkArray2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей.", sum);
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int minSum = arr[0];
        int maxSum = 0;
        for (int currentElement : arr) {
            if (currentElement > maxSum) {
                maxSum = currentElement;
            }
            if (currentElement < minSum) {
                minSum = currentElement;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. " +
                "Максимальная сумма трат за день составила %d рублей.", minSum, maxSum);
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double averageAmount = sum / 30.0;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.", averageAmount);
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] result = new char[reverseFullName.length];
        for (int i = 0; i < reverseFullName.length; i++) {
            result[reverseFullName.length - 1 - i] = reverseFullName[i];
        }
        System.out.println(Arrays.toString(result));
    }

}
