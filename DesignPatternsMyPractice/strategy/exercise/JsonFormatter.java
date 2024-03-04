package strategy.exercise;

public class JsonFormatter implements MessageFormatter {
    @Override
    public String format(String message) {
        return "{\"message\": \"" + message + "\"}";
    }

    @Override
    public String getType() {
        return "json";
    }
}
