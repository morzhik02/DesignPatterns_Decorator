public abstract class Notifier {
    protected String name = "";
    public Notifier(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public abstract String send(String message);
}