package Question04_AbstractFactory;

public class LondonOrderXMLParser implements XMLParser {

    @Override
    public String parse() {
        return "London Order XML Message";
    }
}
