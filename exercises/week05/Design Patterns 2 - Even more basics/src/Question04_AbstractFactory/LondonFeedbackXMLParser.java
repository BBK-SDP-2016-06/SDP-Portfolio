package Question04_AbstractFactory;

public class LondonFeedbackXMLParser implements XMLParser {

    @Override
    public String parse() {
        return "London Feedback XML Message";
    }
}
