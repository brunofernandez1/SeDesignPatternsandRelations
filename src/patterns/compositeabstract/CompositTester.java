package patterns.compositeabstract;

/**
 * Created by Bruno on 31.01.2018.
 */
public class CompositTester {

    public static void main(String[] args) {

        //first of all we create some leafs
        Leaf cpu = new Leaf("intel cpu i7", 30);
        Leaf memory = new Leaf("kingston memory", 10);
        Leaf disk = new Leaf("Samsung ssd 512gb", 20);

        //now we create the first composit (mainboard)
        Composit mainboard = new Composit("asus mainboard", 100);

        //now we add the Leafs to the composit
        mainboard.addComponent(cpu);
        mainboard.addComponent(memory);
        mainboard.addComponent(disk);

        //check if everything is working
        System.out.println(mainboard.getName());
        System.out.println(mainboard.getPrice());

        //now we put the board into a computer(another composit)
        Composit computer = new Composit("hardcore computer", 299);
        computer.addComponent(mainboard);

        //check if everything is working
        System.out.println(computer.getName());
        System.out.println(computer.getPrice());

    }

}
