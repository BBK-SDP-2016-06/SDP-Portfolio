package Question04_AbstractFactory;

public class NYCErrorXMLParser implements XMLParser {

    @Override
    public String parse() {
        return "NYC Error XML Message";
    }
}
