import java.time.LocalDate;

public class HomeWorkMethodOne {
    public static void main(String[] args) {
        printLeapYear(2023);
        printVersionApp(0, 2023);
        System.out.println(calculatesDeliveryDays(31));
    }

    //Task1
    public static void printLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    //Task2
    public static void printVersionApp(int typeOS, int year) {
        int currentYear = LocalDate.now().getYear();
        String mobileOS = null;
        String versionApp = null;
        if (typeOS == 0) {
            mobileOS = "iOS";
        } else if (typeOS == 1) {
            mobileOS = "Android";
        }
        versionApp = year < currentYear ? "облегченную" : "обычную";
        System.out.println("Установите " + versionApp + " версию приложения для " + mobileOS + " по ссылке.");

    }

    //Task3
    public static int calculatesDeliveryDays(int distance) {
        if (distance < 20) {
            return 1;
        } else if (distance < 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }
}
