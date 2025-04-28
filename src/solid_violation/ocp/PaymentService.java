package solid_violation.ocp;


public class PaymentService {
    private final PaymentCalculator calculator;

    public PaymentService(PaymentCalculator calculator) {
        this.calculator = calculator;
    }

    public void pay(Employee employee) {
        int payment = calculator.calculatePay(employee);
        System.out.println("Paying " + employee.getName() + ": " + payment);
    }
}