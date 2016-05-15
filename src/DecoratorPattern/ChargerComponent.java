package DecoratorPattern;

/**
 * Created by sanjav on 5/14/16.
 */
public class ChargerComponent extends ComputerComponentDecorator {
    Computer computer;

    public ChargerComponent(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String description() {
        return computer.description() + "I've a charger. ";
    }
}
