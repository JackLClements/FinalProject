/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discreteprototype1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author Jack L. Clements
 */
public class Arrivals implements Iterable<Entity>, Comparator<Entity>{
    ArrayList<Entity> arrivals;
    
    public Arrivals(){
        arrivals = new ArrayList<>();
    }
    
    public void addArrival(Entity e){
        arrivals.add(e);
        Collections.sort(arrivals, this);
    }
    
    public int nextArrival(){
        if(!arrivals.isEmpty()){
            return arrivals.get(0).getArrival();
        }
        else{
            return 0;
        }
       
    }
    
    public void processArrival(){
        if(!arrivals.isEmpty()){
            arrivals.remove(0);
        }
    }
    
    public Iterator<Entity> iterator(){
        return new SortedEntity();
    }

    @Override
    public int compare(Entity t, Entity t1) {
        return t.compareTo(t1);
    }


    
     private class SortedEntity implements Iterator<Entity> {

        int pos = 0;

        @Override
        public boolean hasNext() {
            if (pos < arrivals.size()) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Entity next() {
            return arrivals.get(pos++);
        }

    }
     
     public void printAll(){
         for(int i = 0; i < arrivals.size(); i++){
             System.out.println(arrivals.get(i).getArrival());
         }
     }
}
