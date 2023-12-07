public class HomeWorkCycle1 {
    public static void main(String[] args) {

        //Task1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Task2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        //Task3
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //Task4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //Task5
        for (int i = 1904; i <= 2096; i += 4) {
//            if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)) {
            System.out.println(i + " год является високосным.");
//            }
        }

        //Task6
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        //Task7
        System.out.println("Task7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        //Task8
        for (int i = 1; i <= 12; i++) {
            int sum = 29000;
            System.out.println("«Месяц " + i + ", сумма накоплений равна " + i * sum + " рублей».");
        }

        //Task9
        int sum = 29000;
        double total = 0.0;
        for (int i = 1; i <= 12; i++) {
            total += sum + total * 0.01;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f, рублей.%n", i, total);
        }

        //Task10
        for (int i = 1; i < 10; i++) {
            System.out.println("2*" + i + "=" + i * 2);
        }

    }
}
