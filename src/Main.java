import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Notifier notifier = new EmailNotifier();
        String message = "";
        List<String> choice = null;

        System.out.println( "Want to receive notifications on Facebook, SMS, Slack?\n" +
                            "Enter \"yes\" or \"no\":");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("yes")){
            System.out.println( "Select\n" +
                                "\t1. \"Facebook\"\n" +
                                "\t2. \"SMS\"\n" +
                                "\t3. \"Slack\"");
            System.out.println("Example: Facebook, SMS");
            String choose = scanner.nextLine();
            choice = new ArrayList<String>(Arrays.asList(choose.split(",")));
            for (String s : choice){
                if (s.equalsIgnoreCase("Facebook")){
                    notifier = new FacebookDecorator(notifier);
                }
                if (s.equalsIgnoreCase("SMS")){
                    notifier = new SMSDecorator(notifier);
                }
                if (s.equalsIgnoreCase("Slack")){
                    notifier = new SlackDecorator(notifier);
                }
            }
        } else if (input.equalsIgnoreCase("no")){
            System.out.println("Ok");
        }
        System.out.println("Введите текст сообщения:");
        message = scanner.nextLine();
        System.out.println(notifier.getName() + ": " + notifier.send(message));
    }
}
