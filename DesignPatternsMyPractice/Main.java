import strategy.exercise.JsonFormatter;
import strategy.exercise.MessageFormatterContext;



public class Main {
    public static void main(String[] args) {

        MessageFormatterContext context = new MessageFormatterContext();
        context.setFormatter(new JsonFormatter());
        System.out.println(context.formatMessage("Hello World"));
        System.out.println(context.getFormatType());

    }
}