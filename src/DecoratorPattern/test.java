package DecoratorPattern;

import org.testng.annotations.Test;

/**
 * Created by sanjav on 5/15/16.
 */
public class test {

    @Test
    public void testPattern() {
        Computer computer = new Computer();
        computer = new ChargerComponent(computer);
        computer = new DiskComponent(computer);

        System.out.println(computer.description()); //I'm a computer. I've a charger. I've a disk.
    }
}
