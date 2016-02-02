package Question04_AbstractFactory;

public class LondonParserFactory implements AbstractParserFactory {

    @Override
    public XMLParser getParserInstance(String parserType) {
        if(parserType.equals("LondonORDER")) {
            System.out.println("London Parsing order XML...");
            return new LondonOrderXMLParser();
        } else if(parserType.equals("LondonERROR")) {
            System.out.println("London Parsing error XML...");
            return new LondonErrorXMLParser();
        } else if(parserType.equals("LondonFEEDBACK")) {
            System.out.println("London Parsing feedback XML...");
            return new LondonFeedbackXMLParser();
        } else if(parserType.equals("LondonRESPONSE")) {
            System.out.println("London Parsing response XML...");
            return new LondonResponseXMLParser();
        } else {
            return null;
        }
    }
}
