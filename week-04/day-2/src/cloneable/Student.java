package cloneable;

public class Student extends Person implements Cloneable{

    String previousOrganization;
    int skippedDays;

    public Student() {
        super.name = "Jane Doe";
        super.age = 30;
        super.gender = "female";
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        super.name = name;
        super.age = age;
        super.gender = gender;
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public void getGoal() {
        System.out.println("Be a junior software developer");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public int skipDays(int numberOfDays) {
        this.skippedDays = numberOfDays;
        skippedDays += numberOfDays;
        return numberOfDays;
    }
}