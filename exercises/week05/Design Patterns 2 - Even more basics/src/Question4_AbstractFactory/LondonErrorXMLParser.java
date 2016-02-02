package Question4_AbstractFactory;

public class LondonErrorXMLParser implements XMLParser {

    @Override
    public String parse() {
        return "London Error XML Message";
    }
}
