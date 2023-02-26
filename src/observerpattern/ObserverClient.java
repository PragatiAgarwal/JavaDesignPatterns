package observerpattern;

public class ObserverClient
{
    public static void main(String [] args){
        //create subject
        MyTopic topic = new MyTopic();

        //create observers
        Observer obs1 = new MyTopicSubscriber("Observer1");
        Observer obs2 = new MyTopicSubscriber("Observer2");
        Observer obs3 = new MyTopicSubscriber("Observer3");

        //register observers to subject
        topic.register(obs1);
        topic.register(obs2);
        topic.register(obs3);

        //attach observer to subject
        obs1.setSubject(topic);
        obs2.setSubject(topic);
        obs3.setSubject(topic);

        //now send message to subject
        topic.postMessage("Message-1");
    }
}
