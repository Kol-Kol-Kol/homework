
public class Main {
    public static void main(String[] args) {
        // Task 1
        var dog = 8;
        var cat = 36;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 2
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 4
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        //Task 5
        var frog = 3.5;
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        //Task 6
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        System.out.println(weightBoxer1 + weightBoxer2);
        System.out.println(weightBoxer2 - weightBoxer1);

        //Task 7
        System.out.println(weightBoxer2 - weightBoxer1);
        System.out.println(weightBoxer2 % weightBoxer1);

        //Task 8
        var timeWork = 640;
        var dayWork = 8;
        var employeeNumber = timeWork / dayWork;
        System.out.println("Всего работников в компании — " + employeeNumber);
        employeeNumber += 94;
        System.out.println("Если в компании работает " + employeeNumber + " человек, " +
                "то всего " + employeeNumber * dayWork + " часов работы может быть поделено между сотрудниками");
    }
}