public class Company {
    private String companyName;
    private String department;
    private double salary;

    public Company() {
    }

    public Company(String companyName, String department, double salary) {
        this.companyName = companyName;
        this.department = department;
        this.salary = salary;
    }

    public String getCompanyName() {

        if (companyName == null) {
            return "";
        }
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDepartment() {

        if (department == null) {
            return "";
        }
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {

        if (salary == 0) {
            return 0;
        }
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
