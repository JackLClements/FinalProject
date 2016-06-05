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
public class Entity {
    private String name;
    private static int serial;
    private Activity arrival;
    private Activity serviceTime;
    private ArrayList<Activity> attributes;
    //Attributes 1-n
    //the thought occurs we could easily run out of memory - check jvm
    //SIMPY TYPE experiment
    Resource dest;
    
    public Entity(String name){
        this.name = name + " " + serial;
        serial++;
        arrival = new Activity();
        serviceTime = new Activity();
        attributes = new ArrayList<>();
    }
    
    
    public void setArrival(int arrival){
        this.arrival.setValue(arrival);
    }
    
    public int getArrival(){
        return this.arrival.getValue();
    }
    
    public void triggerArrival(){
        arrival.trigger();
        arrival.process();
    }
    
    public void setService(int serviceTime){
        this.serviceTime.setValue(serviceTime);
    }
    
    public int getService(){
        return this.serviceTime.getValue();
    }
    
    public void startService(){
        serviceTime.trigger();
    }
    
    public void endService(){
        serviceTime.trigger();
    }
    
    public void addAttribute(Activity a){
        attributes.add(a);
    }
    
    public int getNextAttribute(){
        return attributes.get(0).getValue();
    }
    
    public void processAttribute(){
        attributes.remove(0);
    }
    
    public int getSerial(){
        return serial;
    }

}
