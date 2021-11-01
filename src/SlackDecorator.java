public class SlackDecorator extends NotificationDecorator {
    public SlackDecorator(Notifier notifier){
        super(notifier.getName() + ", Slack", notifier);
    }

    @Override
    public String send(String message) {
        return "\"" + message + "\"";
    }
}