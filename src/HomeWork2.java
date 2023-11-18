
public class HomeWork2 {
    public static void main(String[] args) {
        //Задача 1
        int varInt = 110_000;
        byte varByte = -5;
        short varShort = 1_000;
        long varLong = 100_000_000_000L;
        float varFloat = 10.20f;
        double farDouble = 10.123456789;

        System.out.println("Значение переменной varInt с типом int равно " + varInt);
        System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        System.out.println("Значение переменной varShort с типом short равно " + varShort);
        System.out.println("Значение переменной varLong с типом long равно " + varLong);
        System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        System.out.println("Значение переменной farDouble с типом double равно " + farDouble);

        //Задача 2
        float f = 27.12f;
        long l = 987_678_965_549L;
        float ff = 2.786f;
        short sh1 = 569;
        short sh2 = -159;
        short sh3 = 27897;
        byte b = 67;

        //Задача 3
        byte firstClass = 23;
        byte twoClass = 27;
        byte thirdClass = 30;
        short numberSheetPaper = 480;
        System.out.println("На каждого ученика рассчитано " + numberSheetPaper / (firstClass + twoClass + thirdClass) + " листов бумаги");

        //Задача 4
        byte outputPerMinute = 16 / 2;
        byte minutes = 20;
        short oneDay = 24 * 60;
        int threeDays = oneDay * 3;
        int oneMonth = oneDay * 30;
        System.out.println("За 20 минут машина произвела " + outputPerMinute * minutes + " штук бутылок");
        System.out.println("За в сутки машина произвела " + outputPerMinute * oneDay + " штук бутылок");
        System.out.println("За за 3 дня машина произвела " + outputPerMinute * threeDays + " штук бутылок");
        System.out.println("За за 1 месяц машина произвела " + outputPerMinute * oneMonth + " штук бутылок");

        //Задача 5
        byte whitePaint = 2;
        byte brownPaint = 4;
        int numberClasses = 120;
        int numberCansWhite = numberClasses * whitePaint;
        int numberCansBrown = numberClasses * brownPaint;

        System.out.println("В школе, где " + numberClasses + " классов, нужно " + numberCansWhite + " банок белой краски и "
                + numberCansBrown + " банок коричневой краски");

        //Задача 6
        int bananas = 80;
        int milk = 105;
        int iceCreamPlombir = 100;
        int eggs = 70;

        float sportsBreakfastRecipe = bananas * 5 + milk * 2 + iceCreamPlombir * 2 + eggs * 4;
        System.out.println("Вес в граммах спортзавтрака " + sportsBreakfastRecipe);
        System.out.println("Вес в килограммах спортзавтрака " + sportsBreakfastRecipe / 1000);
        //Задача 7
        int daysToGoal = 0;
        int ideaWeigh = 7; // кг.
        int weightDay1 = 250; //  грамм.
        int weightDay2 = 500; //  грамм.

        daysToGoal = ideaWeigh * 1000 / weightDay1;
        System.out.println("Если терять в весе по " + weightDay1 + " в день, то сбросить " + ideaWeigh + " кг. можно будет через " + daysToGoal + " дней");
        daysToGoal = ideaWeigh * 1000 / weightDay2;
        System.out.println("Если терять в весе по " + weightDay2 + " в день, то сбросить " + ideaWeigh + " кг. можно будет через " + daysToGoal + " дней");

        //Задача 8
        double salaryCristinaOld = 76_230;
        double salaryDenisOld = 83_690;
        double salaryMariaOld = 67_760;
        float salaryIncreaseRate = 0.1f;
        double salaryMariaNew = salaryMariaOld * salaryIncreaseRate + salaryMariaOld;
        double salaryCristinaNew = salaryCristinaOld * salaryIncreaseRate + salaryCristinaOld;
        double salaryDenisONew = salaryDenisOld * salaryIncreaseRate + salaryDenisOld;


        System.out.println("Маша теперь получает " + String.format("%.2f", salaryMariaNew) +
                " рублей. Годовой доход вырос на " + String.format("%.2f", (salaryMariaNew * 12) - (salaryMariaOld * 12)) + " рублей.");
        System.out.println("Кристина теперь получает " + String.format("%.2f", salaryCristinaNew) +
                " рублей. Годовой доход вырос на " + String.format("%.2f", (salaryCristinaNew * 12) - (salaryCristinaOld * 12)) + " рублей.");
        System.out.println("Денис теперь получает " + String.format("%.2f", salaryDenisONew) +
                " рублей. Годовой доход вырос на " + String.format("%.2f", (salaryDenisONew * 12) - (salaryDenisOld * 12)) + " рублей.");

    }
}