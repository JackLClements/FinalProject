package discreteprototype1;

import java.util.Random;

/**
 *
 * @author Jack L. Clements
 */
public class Generator {
    
    public Generator(){
        
    }
    
    public Entity generateEntity(int worldClock, Random rng) {
        Entity newEnt = new Entity("Customer");
        int nextArr = worldClock;// + rng.nextInt(100);
        newEnt.setArrival(nextArr);
        System.out.println("ARRIVAL TIME - " + nextArr);
        int nextEOS = rng.nextInt(50);
        newEnt.setService(nextEOS);
        System.out.println("SERVICE TIME - " + nextEOS);
        Activity looksAtMovies = new Activity();
        looksAtMovies.setValue(20);
        newEnt.addAttribute(looksAtMovies);
        return newEnt;
    }

}
