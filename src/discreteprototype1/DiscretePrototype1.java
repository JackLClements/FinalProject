package discreteprototype1;

import java.util.Random;

/**
 *
 * @author jackc
 */
public class DiscretePrototype1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulation sim1 = new Simulation();
        Generator gen = new Generator();
        Random rng = new Random();
        Activity arrival1 = new Activity(30);
        Activity arrival2 = new Activity(20);
        Activity serviceTime = new Activity(100);
        Activity timeOut = new Activity(500);
        sim1.addEntity(new Entity("Customer", arrival1, serviceTime, timeOut));
        sim1.addEntity(new Entity("Customer 2 ", arrival2, serviceTime, timeOut));
        sim1.run(300);
    }
    
}
