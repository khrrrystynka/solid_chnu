package solid_violation.isp;

public class Dog implements RunnableAnimal, BarkableAnimal {
    @Override
    public void run() {
        System.out.print("Dog is running");
    }

    @Override
    public void bark() {
        System.out.print("Dog is barking");
    }
}
