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
        sim1.addEntity(gen.generateEntity(200, rng));
        sim1.addEntity(gen.generateEntity(210, rng));
        sim1.run(300);
    }
    
}
