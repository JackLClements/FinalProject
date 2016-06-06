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
public class LIFOQueue extends Queue{
    
    public LIFOQueue(){
        queue = new ArrayList<>();
    }
    
    @Override
    public int getNextEOS(){
        return queue.get(queue.size()-1).getService();
    }
}
