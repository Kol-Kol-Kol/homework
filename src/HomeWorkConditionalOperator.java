public class HomeWorkConditionalOperator {
    public static void main(String[] args) {

        //Task1
        int clientOS = 0; // input data
        if (clientOS == 0) {
            System.out.println("«Установите версию приложения для iOS по ссылке».");
        } else if (clientOS == 1) {
            System.out.println("«Установите версию приложения для Android по ссылке».");
        }

        //Task2
        clientOS = 1; // input data
        int clientDeviceYear = 2023; // input data
        int yearNewVersion = 2015;
        if (clientDeviceYear < yearNewVersion) {
            if (clientOS == 0) {
                System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
            } else if (clientOS == 1) {
                System.out.println("«Установите облегченную версию приложения для Android по ссылке».");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("«Установите версию приложения для iOS по ссылке».");
            } else if (clientOS == 1) {
                System.out.println("«Установите версию приложения для Android по ссылке».");
            }
        }

        //Task3
        int year = 2021; // input data
        System.out.println(year > 1584 && ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
                ? year + " год является високосным."
                : year + " год не является високосным.");

        //Task4
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDistance + 1);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 2);
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }

        //Task5
        int monthNumber = 12; // input data

        if (!(monthNumber > 12)) {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Месяц " + monthNumber + " принадлежит к сезону зима.");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Месяц " + monthNumber + " принадлежит к сезону весна.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Месяц " + monthNumber + " принадлежит к сезону лето.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Месяц " + monthNumber + " принадлежит к сезону осень.");
                    break;
            }
        }

    }
}
