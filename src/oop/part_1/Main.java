package oop.part_1;

public class Main {

    public static void main(String[] args) {

        Gryffindor st1 = new Gryffindor(
                2,10, "Harry Poter",
                5, 4, 11);
        Gryffindor st2 = new Gryffindor(
                3,10, "Hermione Granger",
                5, 4, 10);

        st1.comparesStudents(st2);
        st1.compareStudentsGeneralCharacteristics(st2);

    }

}
