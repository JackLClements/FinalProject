/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discreteprototype1;

/**
 * Conceptually a semaphore, handles limited resources.
 *
 * @author Jack L. Clements
 */
public class Resource {
    //Users - request events
    private String name;
    private int count;
    private int limit;
    
    
    public Resource(String name, int count, int limit){
        this.name = name;
        this.count = count;
        this.limit = limit;
    }
    //you can also use containers for consumption of something

    //methods for request and release, call in queue
    public synchronized void request() {

        while (count == 0) {

            try {
                wait(); // Blocking call.
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
        count--;
    }

    public synchronized void release() {
        count++;
        limit--;
        notify();
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }

}
