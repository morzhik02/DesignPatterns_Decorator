public class FacebookDecorator extends NotificationDecorator {
    public FacebookDecorator(Notifier notifier){
        super(notifier.getName() + ", Facebook", notifier);
    }

    @Override
    public String send(String message) {
        return "\"" + message + "\"";
    }
}
