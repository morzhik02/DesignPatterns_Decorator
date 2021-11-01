public abstract class NotificationDecorator extends Notifier {
    private Notifier notifier;
    public NotificationDecorator(String name, Notifier notifier){
        super(name);
        this.notifier = notifier;
    }
}