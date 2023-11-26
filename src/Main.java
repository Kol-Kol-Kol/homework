public class Main {

    public static void main(String[] args) {
        //Task 1
        int age = 19; // input data
        int ageAdult = 18;
        if (age >= ageAdult) {
            System.out.println("«Если возраст человека равен " + age + ", то он совершеннолетний».");
        }
        if (age < ageAdult) {
            System.out.println("«Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать».");
        }
        //Task 2
        int temperature = 5;
        int currentTemperature = 3; // input data

        if (temperature < currentTemperature) {
            System.out.println("«На улице " + temperature + " градусов, нужно надеть шапку».");
        } else {
            System.out.println("«На улице " + temperature + " градусов, можно идти без шапки».");
        }
        //Task 3
        int speed = 60; // input data
        int currentSpeed = 100;
        if (currentSpeed < speed) {
            System.out.println("«Если скорость " + currentSpeed + ", то можно ездить спокойно».");
        } else {
            System.out.println("«Если скорость " + currentSpeed + ", то придется заплатить штраф».");
        }
        //Task 4
        int ageHuman = 10; // input data
        boolean ageKindergarten = ageHuman > 2 && ageHuman < 6;
        boolean ageSchool = ageHuman > 7 && ageHuman < 17;
        boolean ageUniversity = ageHuman >= 18 && ageHuman <= 24;
        boolean ageWork = ageHuman > 24;
        if (ageKindergarten) {
            System.out.println("«Если возраст человека равен " + ageHuman + ", то ему нужно ходить в детский сад».");
        } else if (ageSchool) {
            System.out.println("«Если возраст человека равен " + ageHuman + ", то ему нужно ходить в школу».");
        } else if (ageUniversity) {
            System.out.println("«Если возраст человека равен " + ageHuman + ", то ему нужно ходить в университет».");
        } else if (ageWork) {
            System.out.println("«Если возраст человека равен " + ageHuman + ", то ему нужно ходить на работу».");
        }
        //Task 5
        int ageChild = 15; // input data
        if (ageChild < 5) {
            System.out.println("«Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе».");
        } else if (ageChild < 5 && ageChild < 14) {
            System.out.println("«Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого».");
        } else {
            System.out.println("«Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого».");
        }
        //Task 6
        int numberHuman = 101; // input data
        int numberHumanOneTrainCarriage = 102;
        int numberSeats = 60;
        if (numberHuman <= numberSeats && numberHuman >= 1) {
            System.out.println("В вагоне есть сидячие места");
        } else if (numberHuman < numberSeats && numberHuman <= numberHumanOneTrainCarriage) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("В вагоне нет мест");
        }
        //Task 7
        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three) {
            System.out.println("Самое большое число " + one);
        } else if (two > one && two > three) {
            System.out.println("Самое большое число " + two);
        } else if (three > one && three > two) {
            System.out.println("Самое большое число " + three);
        } else {
            System.out.println("Все числа равны");
        }


    }
}
