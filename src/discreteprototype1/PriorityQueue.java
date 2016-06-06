/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discreteprototype1;

import java.util.ArrayList;

/**
 *
 * @author Jack L. Clements
 */
public class PriorityQueue extends Queue {

    enum priority {
        LOW(1), MEDIUM(2), HIGH(2);

        private final int priority;

        priority(int priority) {
            this.priority = priority;
        }
        
        int getPriority(){
            return this.priority;
        }
    }
    private ArrayList<priority> priorities;
    Entity highestPriEnt;
    int highestPri;
    

    public PriorityQueue() {
        queue = new ArrayList<>();
        priorities = new ArrayList<>();
        highestPri = 0;
    }

    public void addEntity(Entity ent, int itemPriority) {
        queue.add(ent);
        switch (itemPriority) {
            case 1:
                priorities.add(priority.LOW);
                break;
            case 2:
                priorities.add(priority.MEDIUM);
                break;
            case 3:
                priorities.add(priority.HIGH);
                break;
            default:
                priorities.add(priority.LOW);
                break;
        }
    }
    //need a processing method too
    @Override
    public int getNextEOS() {
        for (int i = 0; i < queue.size(); i++) {
            if (priorities.get(i).getPriority() > highestPri) {
                highestPriEnt = queue.get(i);
            }
        }
        return highestPriEnt.getService();
    }
}
