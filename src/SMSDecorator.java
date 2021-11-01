public class SMSDecorator extends NotificationDecorator {

    public SMSDecorator(Notifier notifier){
        super(notifier.getName() + ", SMS", notifier);
    }

    @Override
    public String send(String message) {
        return "\"" + message + "\"";
    }
}
