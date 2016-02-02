package Question4_AbstractFactory;

public class NYCFeedbackXMLParser implements XMLParser {

    @Override
    public String parse() {
        return "NYC Feedback XML Message";
    }
}
