public class HomeWorkStringOne {
    public static void main(String[] args) {
        //Task1
        System.out.println("Task1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("Ф. И. О. сотрудника — %s", fullName);

        //Task2
        System.out.println("\nTask2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " +fullName.toUpperCase());

        //Task3
        System.out.println("\nTask3");
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName.replace("ё", "е"));

    }
}
