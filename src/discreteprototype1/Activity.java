package discreteprototype1;

/**
 *
 * @author Jack L. Clements
 */
public class Activity {
    private enum states{NOT_TRIGGERED, TRIGGERED, PROCESSED}
    
    private int value;
    private boolean passFail;
    private states state;
    
    public Activity(){
        state = states.NOT_TRIGGERED;
    }
    
    public Activity(int value){
        this.value = value;
        state = states.NOT_TRIGGERED;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
    public int getValue(){
        return this.value;
    }
    
    
    //Next two methods deal with pass/fail of state
    public void succeed(){
        passFail = true;
    }
    
    public void fail(String exception){
        passFail = false;
    }
    
    //determine pass or fail of event
    public void trigger(){
        state = states.TRIGGERED;
    }
    
    public void process(){
        state = states.PROCESSED;
    }
    
    
}
