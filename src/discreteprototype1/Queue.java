/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discreteprototype1;

import java.util.ArrayList;

/**
 * a FIFO queue
 * @author Jack L. Clements
 */
public class Queue {
    
    protected ArrayList<Entity> queue;
    protected Resource res1;
    //private boolean isServing;

    public Queue() {
        queue = new ArrayList<>();
    }
    
    public void addEntity(Entity ent){
        queue.add(ent);
    }
    
    public Entity getHead(){
        if(!queue.isEmpty()){
            return queue.get(0);
        }
        else{
            return new Entity("Queue Empty");
        }
    }
    
    public void process(){
        if(!queue.isEmpty()){
            queue.remove(0);
        } 
    }
    
    public boolean isEmpty(){
        if(queue.isEmpty()){
            return true;
       }
        else{
            return false;
        }
    }
    
    public int size(){
        return queue.size();
    }
    
    public int getNextEOS(){
        if(!queue.isEmpty()){
            return queue.get(0).getService();
        }
        else{
            return 0;
        }
        
    }
    
    //public int timeAt(int i){
    //    return queue.get(i).getNextAttribute();
    //}
    
}
