package staff;

public abstract class Employee {

    private String name;
    private String NIN;
    private double salary;

    public Employee(String name, String NIN, double salary){
        this.name = name;
        this.NIN = NIN;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNIN() {
        return NIN;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percentage) {
        if (percentage > 0) {
            this.salary = this.salary * (1 + percentage / 100);
        }
    }

    public double payBonus() {
        return this.salary * 0.01;
    }

    public void changeName(String newName){
        if (newName != null) {
            this.name = newName;
        }
    }
}
