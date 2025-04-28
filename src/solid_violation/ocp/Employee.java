package solid_violation.ocp;

public class Employee {
    private final String name;
    private final int baseSalary;
    private final int bonus;

    public Employee(String name, int baseSalary, int bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getBonus() {
        return bonus;
    }
}