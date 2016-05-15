package DecoratorPattern;

/**
 * Created by sanjav on 5/14/16.
 */
public class DiskComponent extends ComputerComponentDecorator {
    Computer computer;

    public DiskComponent(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String description() {
        return computer.description() + "I've a disk. ";
    }
}
