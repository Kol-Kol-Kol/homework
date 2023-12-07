public class HomeWorkCycle2 {
    public static void main(String[] args) {
        //Task1
        double deposit = 0.0;
        int sum = 2_459_000;
        int month = 1;
        int monthDeposit = 15000;
        while (deposit <= sum) {
            deposit += monthDeposit + deposit * 0.01;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f, рублей.%n", month, deposit);
            month++;
        }
        //Task2
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        //Task3
        long populationCountryY = 12_000_000L;
        double birth =  17.0 / 1000;
        double mortality =  8.0 / 1000;
        for (int j = 1; j < 11; j++) {
            populationCountryY = (long) (populationCountryY + ((populationCountryY * birth) - (populationCountryY * mortality)));
            System.out.println("Год " + j + " , численность населения составляет " + populationCountryY);
        }
        //Task4
        double depositMany4 = 15_000;
        int month4 = 1;
        double rate4 = 0.07;
        double amount4 = 12_000_000;
        while (depositMany4 <= amount4) {
            depositMany4 += depositMany4 * rate4;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f, рублей.%n", month4, depositMany4);
            month4++;
        }
        //Task5
        float depositMany5 = 15_000;
        int month5 = 1;
        double rate5 = 0.07;
        int amount5 = 12_000_000;
        while (depositMany5 <= amount5) {
            depositMany5 += depositMany5 * rate5;
            if (month5 % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f, рублей.%n", amount5, depositMany5);
            }
            month5++;
        }
        //Task6
        double depositMany6 = 15_000;
        int month6 = 1;
        double rate6 = 0.07;
        double amount6 = 9 * 12;
        while (month6 <= amount6) {
            depositMany6 += depositMany6 * rate6;
            if (month6 % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f, рублей.%n", month6, depositMany6);
            }
            month6++;
        }
        //Task7
        int totalDaysInMonth = 31;
        for (int friday = 1; friday <= totalDaysInMonth; friday +=7) {
            System.out.printf("Сегодня пятница, %d, -е число. Необходимо подготовить отчет.%n", friday);
        }
        //Task8
        int thisYear = 2023;
        int firstYears = thisYear - 200;
        int recentYears = thisYear + 100;
        while (firstYears <= recentYears) {
            if (firstYears % 79 == 0) {
                System.out.println(firstYears);
            }
            firstYears++;
        }
    }
}
