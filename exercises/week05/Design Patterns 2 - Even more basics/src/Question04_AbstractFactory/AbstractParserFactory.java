package Question04_AbstractFactory;

public interface AbstractParserFactory {

    public XMLParser getParserInstance(String parserType);
}
