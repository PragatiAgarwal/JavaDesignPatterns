package observerpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyTopic implements Subject
{
    private List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public MyTopic(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj)
    {
        if(obj == null){
            throw new NullPointerException("Null Observer");
        }
        synchronized (MUTEX){
            if(!observers.contains(obj)){
                observers.add(obj);
            }
        }
    }

    @Override
    public void unregister(Observer obj)
    {
        synchronized (MUTEX){
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObservers()
    {
        List<Observer> localObservers;
        //synchronization is used to make sure any observer registered after message is received is not notified
        synchronized (MUTEX){
            if(!changed){
                return;
            }
            localObservers = this.observers;
            changed = false;

            for(Observer observer : localObservers){
                observer.update();
            }
        }

    }

    @Override
    public Object getUpdate(Observer obj)
    {
        return this.message;
    }

    //method to post message to the topic
    public void postMessage(String message){
        System.out.println("Message posted to the topic : " + message);
        this.message = message;
        changed = true;
        notifyObservers();
    }
}
