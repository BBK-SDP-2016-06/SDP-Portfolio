package Question04_AbstractFactory;

public class NYCResponseXMLParser implements XMLParser {

    @Override
    public String parse() {
        return "NYC Response XML Message";
    }
}
