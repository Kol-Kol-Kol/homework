package oop.part_1;

// Когтевран
public class Ravenclaw extends Hogwarts {
    // Когтевранцы умны, мудры, остроумны и полны творчества.
    private int mind; // ум
    private int wisdom; // мудрость
    private int wit; // остроумие

    public Ravenclaw(int powerOfMagic, int transgressionDistance, String nameStudent, int mind, int wisdom, int wit) {
        super(powerOfMagic, transgressionDistance, nameStudent);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void comparesStudents (Ravenclaw secondStudent) {
        if (secondStudent != null) {
            int sumFirstStudent = this.getMind() + this.getWisdom() + this.getWit();
            int sumSecondStudent = secondStudent.getMind() + secondStudent.getWisdom() + secondStudent.getWit();
            if (sumFirstStudent > sumSecondStudent) {
                System.out.println(this.getNameStudent() + " лучший Когтевранец, чем " + secondStudent.getNameStudent());
            } else if (sumFirstStudent < sumSecondStudent) {
                System.out.println(secondStudent.getNameStudent() + " лучший Когтевранец, чем " + this.getNameStudent());
            } else {
                System.out.println(this.getNameStudent() + " и " + secondStudent.getNameStudent() + " равны по свойствам");
            }
        } else {
            System.out.println("ERROR: Объект пустой");
        }
    }

    @Override
    public String toString() {
        return "Ravenclaw{" + "powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance=" + getTransgressionDistance() +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                '}';
    }
}
