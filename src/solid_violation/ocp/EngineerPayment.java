package solid_violation.ocp;

public class EngineerPayment implements PaymentCalculator {
    @Override
    public int calculatePay(Employee employee) {
        return employee.getBaseSalary();
    }
}