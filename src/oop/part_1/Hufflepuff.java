package oop.part_1;

public class Hufflepuff extends Hogwarts {
    // Студенты Пуффендуя трудолюбивы, верны, честны.

    private int hardWork; // трудолюбивость
    private int loyalty; // верность
    private int honesty; // честность

    public Hufflepuff(int powerOfMagic, int transgressionDistance, String nameStudent, int hardWork, int loyalty, int honesty) {
        super(powerOfMagic, transgressionDistance, nameStudent);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void comparesStudents (Hufflepuff secondStudent) {
        if (secondStudent != null) {
            int sumFirstStudent = this.getHardWork() + this.getLoyalty() + this.getHonesty();
            int sumSecondStudent = secondStudent.getHardWork() + secondStudent.getLoyalty() + secondStudent.getHonesty();
            if (sumFirstStudent > sumSecondStudent) {
                System.out.println(this.getNameStudent() + " лучший Пуффендуец, чем " + secondStudent.getNameStudent());
            } else if (sumFirstStudent < sumSecondStudent) {
                System.out.println(secondStudent.getNameStudent() + " лучший Пуффендуец, чем " + this.getNameStudent());
            } else {
                System.out.println(this.getNameStudent() + " и " + secondStudent.getNameStudent() + " равны по свойствам");
            }
        } else {
            System.out.println("ERROR: Объект пустой");
        }
    }

    @Override
    public String toString() {
        return "Hufflepuff{" + "powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance=" + getTransgressionDistance() +
                "hardWork=" + hardWork +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}
