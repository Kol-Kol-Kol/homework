package oop.part_1;

public class Slytherin extends Hogwarts {
    // Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.

    private int cunning; // хитрость
    private int determination; // решительность
    private int ambition; // амбициозность
    private int resourcefulness; // находчивость
    private int lustForPower; // жажда власти

    public Slytherin(int powerOfMagic, int transgressionDistance, String nameStudent,
                     int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(powerOfMagic, transgressionDistance, nameStudent);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public void comparesStudents (Slytherin secondStudent) {
        if (secondStudent != null) {
            int sumFirstStudent = this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getLustForPower();
            int sumSecondStudent = secondStudent.getCunning() + secondStudent.getDetermination() + secondStudent.getAmbition() +
                    secondStudent.getResourcefulness() + secondStudent.getLustForPower();
            if (sumFirstStudent > sumSecondStudent) {
                System.out.println(this.getNameStudent() + " лучший Слизеринец, чем " + secondStudent.getNameStudent());
            } else if (sumFirstStudent < sumSecondStudent) {
                System.out.println(secondStudent.getNameStudent() + " лучший Слизеринец, чем " + this.getNameStudent());
            } else {
                System.out.println(this.getNameStudent() + " и " + secondStudent.getNameStudent() + " равны по свойствам");
            }
        } else {
            System.out.println("ERROR: Объект пустой");
        }
    }

    @Override
    public String toString() {
        return "Slytherin{" + "powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance=" + getTransgressionDistance() +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }
}
