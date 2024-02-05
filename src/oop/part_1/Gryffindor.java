package oop.part_1;

public class Gryffindor extends Hogwarts{

    private int nobility; // благородство
    private int honor; // честь
    private int bravery; // храбрость


    public Gryffindor(int powerOfMagic, int transgressionDistance, String nameStudent, int nobility, int honor, int bravery) {
        super(powerOfMagic, transgressionDistance, nameStudent);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void comparesStudents (Gryffindor secondStudent) {
        if (secondStudent != null) {
            int sumFirstStudent = this.getNobility() + this.getHonor() + this.getBravery();
            int sumSecondStudent = secondStudent.getNobility() + secondStudent.getHonor() + secondStudent.getBravery();
            if (sumFirstStudent > sumSecondStudent) {
                System.out.println(this.getNameStudent() + " лучший Гриффиндорец, чем " + secondStudent.getNameStudent());
            } else if (sumFirstStudent < sumSecondStudent) {
                System.out.println(secondStudent.getNameStudent() + " лучший Гриффиндорец, чем " + this.getNameStudent());
            } else {
                System.out.println(this.getNameStudent() + " и " + secondStudent.getNameStudent() + " равны по свойствам");
            }
        } else {
            System.out.println("ERROR: Объект пустой");
        }
    }

    @Override
    public String toString() {
        return "Gryffindor{" + "powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance=" + getTransgressionDistance() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
