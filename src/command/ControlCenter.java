package command;

import observer.IDestructionDetectorListener;

import java.util.ArrayList;

public class ControlCenter {


    private ArrayList<IDestructionDetectorListener> listeners;


    public ControlCenter() {
        listeners = new ArrayList<>();
    }

    public void addListener(IDestructionDetectorListener listener){
        listeners.add(listener);
    }

    public void removeListener(IDestructionDetectorListener listener){
        listeners.remove(listener);
    }

    

}
