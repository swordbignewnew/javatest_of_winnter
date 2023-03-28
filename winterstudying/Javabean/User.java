package winterstudying.Javabean;

public class User {
    private String name;
    private double height;
    private int salary;

    public User() {
    }

    public User(String name, double height, int salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
