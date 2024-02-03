package courxework_1;

import java.util.Arrays;

public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Фунткиов Андрей Петрович", 250_000.00, 1);
        employees[1] = new Employee("Гринберг Александр Петрович", 230_000.00, 2);
        employees[2] = new Employee("Семёнов Роман Николаевич", 330_000.00, 3);
        employees[3] = new Employee("Анисимов Олег Васильевич", 335_000.00, 4);
        employees[4] = new Employee("Аксенов Артём Иванович", 340_000.00, 4);
        employees[5] = new Employee("Добарин Олег Семёнович", 310_000.00, 3);
        employees[6] = new Employee("Гаврилов Иван Кириллович", 305_000.00, 4);
        employees[7] = new Employee("Корина Елена Кириллович", 355_000.00, 5);
        employees[8] = new Employee("Шефцов Владислав Владимирович", 410_000.00, 5);
        employees[9] = new Employee("Капустина Ольга Эдуардовна", 210_000.00, 1);

        dividingLine();
        System.out.print("a) ");
        printInfoEmployee();
        dividingLine();
        System.out.println("b) Сумма затрат на зарплаты в месяц: " + calculateMonthlySalary());
        dividingLine();
        System.out.println("c) Сотрудник с минимальной зарплатой: " + foundMinSalary());
        dividingLine();
        System.out.println("d) Сотрудник с максимальной зарплатой: " + foundMaxSalary());
        dividingLine();
        System.out.println("e) Среднее значение зарплат: " + calculateAverageSalary());
        dividingLine();
        System.out.println("f) ФИО всех сотрудников: ");
                printEmployeeFullName();
    }

    public static void printInfoEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double calculateMonthlySalary() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee foundMinSalary() {
        Employee foundEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < foundEmployee.getSalary()) {
                foundEmployee = employee;
            }
        }
        return foundEmployee;
    }

    public static Employee foundMaxSalary() {
        Employee foundEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > foundEmployee.getSalary()) {
                foundEmployee = employee;
            }
        }
        return foundEmployee;
    }

    public static double calculateAverageSalary () {
        return calculateMonthlySalary() / employees.length;
    }

    public static void printEmployeeFullName () {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public static void dividingLine () {
        System.out.println("--------------------------------------------------");
    }
}
