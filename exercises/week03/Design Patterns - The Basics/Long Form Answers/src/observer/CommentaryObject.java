package observer;

import java.util.ArrayList;
import java.util.List;

public class CommentaryObject implements Commentary {

    private List<Observer> observers;
    private final String details;
    private String description;

    public CommentaryObject(List<Observer> observers, String details) {
        this.observers = observers;
        this.details = details;
        this.description = "";
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers) {
            o.update(description);
        }

    }

    @Override
    public String subjectDetails() {
        return details;
    }

    @Override
    public void setDesc(String desc) {
        this.description = desc;
        notifyObservers();
    }
}
