package Question04_AbstractFactory;

public class NYCParserFactory implements AbstractParserFactory {

    @Override
    public XMLParser getParserInstance(String parserType) {
        if(parserType.equals("NYCORDER")) {
            System.out.println("NYC Parsing order XML...");
            return new NYCOrderXMLParser();
        } else if(parserType.equals("NYCERROR")) {
            System.out.println("NYC Parsing error XML...");
            return new NYCErrorXMLParser();
        } else if(parserType.equals("NYCFEEDBACK")) {
            System.out.println("NYC Parsing feedback XML...");
            return new NYCFeedbackXMLParser();
        } else if(parserType.equals("NYCRESPONSE")) {
            System.out.println("NYC Parsing response XML...");
            return new NYCResponseXMLParser();
        } else {
            return null;
        }
    }
}
