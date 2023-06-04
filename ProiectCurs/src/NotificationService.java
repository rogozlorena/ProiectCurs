import  java.util.List;
import  java.util.ArrayList;
public class NotificationService {
    private List<Subscriber> subscribers;

    public NotificationService() {
        subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(Item item) {
        for (Subscriber subscriber : subscribers) {
            subscriber.notify(item);
        }
    }
}
