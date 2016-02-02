package Question4_AbstractFactory;

public interface AbstractParserFactory {

    public XMLParser getParserInstance(String parserType);
}
