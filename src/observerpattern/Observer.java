package observerpattern;

public interface Observer
{
    //methos to update the observer used by subject
    void update();

    //attach with subject to observe
    void setSubject(Subject subject);
}
