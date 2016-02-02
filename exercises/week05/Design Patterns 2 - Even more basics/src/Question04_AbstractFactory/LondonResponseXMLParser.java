package Question04_AbstractFactory;

public class LondonResponseXMLParser implements XMLParser {

    @Override
    public String parse() {
        return "NYC Response XML Message";
    }
}
