package pack_inheritance;

public class Faculty extends Student{
    private int experience;
    private double salary;

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }
    public double getSalary() {
        return salary;
    }
}
