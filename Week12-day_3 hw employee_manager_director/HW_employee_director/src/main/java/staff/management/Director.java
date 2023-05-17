package staff.management;

public class Director extends Manager{

    private double budget;


    public Director(String name, String NIN, double salary, String deptName, double budget) {
        super(name, NIN, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus(){
        return this.getSalary() * 0.02;
    }
}
