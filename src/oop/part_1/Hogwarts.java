package oop.part_1;

public class Hogwarts {

    private int powerOfMagic;
    private int transgressionDistance;

    private String nameStudent;


    public Hogwarts(int powerOfMagic, int transgressionDistance, String nameStudent) {
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
        this.nameStudent = nameStudent;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public void compareStudentsGeneralCharacteristics(Hogwarts secondStudent) {
        if (secondStudent != null) {
            if (this.getPowerOfMagic() > secondStudent.getPowerOfMagic()) {
                System.out.println(this.getNameStudent() + " обладает бОльшей мощностью магии, чем " + secondStudent.getNameStudent());
            } else if (this.getPowerOfMagic() < secondStudent.getPowerOfMagic()) {
                System.out.println(secondStudent.getNameStudent() + " обладает бОльшей мощностью магии, чем " + this.getNameStudent());
            } else if (this.getTransgressionDistance() > secondStudent.getTransgressionDistance()) {
                System.out.println(this.getNameStudent() + " обладает бОльшей расстоянием трансгрессии, чем " + secondStudent.getNameStudent());
            } else if (this.getTransgressionDistance() < secondStudent.getTransgressionDistance()) {
                System.out.println(secondStudent.getNameStudent() + " обладает бОльшей расстоянием трансгрессии, чем " + this.getNameStudent());
            }
        } else {
            System.out.println("ERROR: Объект пустой");
        }
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance +
                ", nameStudent='" + nameStudent + '\'' +
                '}';
    }
}
