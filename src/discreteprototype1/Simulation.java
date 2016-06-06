package discreteprototype1;

import java.util.ArrayList;
import java.util.Random;

/**
 * The running environment the simulation works in Handles time, scheduling and
 * processing of events as well as means to step through simulation
 *
 * @author Jack L. Clements
 */
public class Simulation {

    private static int worldClock;
    private long seed;
    private Random rng;
    private Queue queue; //start with just the one
    private Resource res;

    //variables for task
    private int nextEOS;
    private int nextArrival;

    public Simulation() {
        worldClock = 0;
        queue = new Queue();
        seed = System.currentTimeMillis();
        rng = new Random(seed);
    }

    public static int getTime() {
        return worldClock;
    }

    public void setTime(int time) {
        worldClock = time;
    }

    public Entity getCurrentEv() {
        return queue.getHead();
    }

    /**
     * Should return next event or infinity if none
     *
     * @return
     */
    public int peek() {
        return 0;
    }

    //These methods run the simulation
    /**
     *
     */
    public void run() {
        //hm...
    }

    public void run(int time) {
        while (worldClock < time) {
            step();
        }
    }

    public void run(Entity ent) {

    }

    public void determineCurrentAct() {
        /*
        if (nextEOS > 0 && nextArrival > 0) { //check value to stop looping forever
            if (nextEOS < nextArrival) {
                worldClock = nextEOS;
                System.out.println("END OF SERVICE AT " + worldClock);
                if (!queue.isEmpty()) { //check queue has people in it
                    currentEv = queue.getHead();
                    //queue.process();
                    System.out.println("NOW SERVICING ENTITY - " + currentEv.getSerial());
                    nextEOS = worldClock + currentEv.getService();
                } else {
                    System.out.println("OUT OF CUSTOMERS TO SERVICE");
                    nextEOS = -1; //check value when no next EOS for infinite looping
                }
            }
            if (nextEOS >= nextArrival) {
                System.out.println("ARRIVAL AT " + nextArrival);
                worldClock = nextArrival;
                if(queue.isEmpty()){
                    nextArrival = -1;
                }
                else{
                    nextArrival = queue.getHead().getArrival();
                    //queue.process();
                }
            }
        }*/
    }

    public void step() {
        //change seed? For now, you will want to fix this according to the book
        seed = System.currentTimeMillis();

        //logic to calculate next step
        //basic queue logic follows
        /*
         if the person's end of service time is before any event - finish serving them, add current head to service queue
         if the new arrival is before any event, add them to the queue
        
         */
        determineCurrentAct();
    }

    public void generateEntity() {
        Entity newEnt = new Entity("Customer");
        newEnt.setArrival(worldClock + rng.nextInt());
        newEnt.setService(rng.nextInt());
        if (queue.isEmpty()) {
            //currentAct = newEnt.getArrival();
        } else {
            queue.addEntity(newEnt);
        }
    }

    public void addEntity(Entity ent) {
            //nextArrival = ent.getArrival();
            //nextEOS = ent.getArrival() + ent.getService();
            //System.out.println(nextEOS);
            //queue.addEntity(ent);
        //nothing here yet
    }

}
