public class Employee {
    private String name;
    private double salary;
    private String position;
    private String email;
    private int age;


    public Employee(String name, double salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.email = "n/a";
        this.age = -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
