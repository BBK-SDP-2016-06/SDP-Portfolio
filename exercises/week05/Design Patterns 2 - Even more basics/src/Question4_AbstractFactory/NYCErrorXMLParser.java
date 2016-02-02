package Question4_AbstractFactory;

public class NYCErrorXMLParser implements XMLParser {

    @Override
    public String parse() {
        return "NYC Error XML Message";
    }
}
