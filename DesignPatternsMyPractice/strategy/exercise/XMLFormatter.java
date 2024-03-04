package strategy.exercise;

public class XMLFormatter implements MessageFormatter {

    @Override
    public String format(String message) {
        return "<message>" + message + "</message>";
    }

    @Override
    public String getType() {
        return "xml";
    }
}
