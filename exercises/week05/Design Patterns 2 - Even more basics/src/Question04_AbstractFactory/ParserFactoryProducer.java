package Question04_AbstractFactory;

public class ParserFactoryProducer {

    public static AbstractParserFactory getFactory(String factoryType) {
        if(factoryType.equals("NYCFactory")) {
            return new NYCParserFactory();
        } else if(factoryType.equals("LondonFactory")) {
            return new LondonParserFactory();
        } else {
            return null;
        }
    }
}
