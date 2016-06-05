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
public class Queue {
    
    private ArrayList<Entity> queue;
    private Entity nextEvent; 
    Resource res1;
    //private boolean isServing;

    public Queue() {
        queue = new ArrayList<>();
    }
    
    public void addEntity(Entity ent){
        if(queue.isEmpty()){
            nextEvent = ent;
        }
        else{
            queue.add(ent);
        }
    }
    
    public Entity getHead(){
        return nextEvent;
    }
    
    public void process(){
        if(!queue.isEmpty()){
            nextEvent = queue.get(0);
            queue.remove(0);
        }
        else{
            nextEvent = null;
        }
        
    }
    
    public boolean isEmpty(){
        if(queue.isEmpty() && nextEvent == null){
            return true;
       }
        else{
            return false;
        }
    }
    
    public int size(){
        return queue.size();
    }
    
    public int timeAt(int i){
        return queue.get(i).getNextAttribute();
    }
    
}
