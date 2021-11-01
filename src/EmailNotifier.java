public class EmailNotifier extends Notifier {
    public EmailNotifier() {
        super("Email");
    }

    @Override
    public String send(String message) {
        return "\"" + message + "\"";
    }
}
