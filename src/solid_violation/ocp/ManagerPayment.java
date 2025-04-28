package solid_violation.ocp;

public class ManagerPayment implements PaymentCalculator {
    @Override
    public int calculatePay(Employee employee) {
        return employee.getBaseSalary() + employee.getBonus();
    }
}