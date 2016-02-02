package Question02_Strategy;

public class CapTextFormatter implements TextFormatter{

    @Override
    public void format(String text) {
        String formattedString = text.toUpperCase();
        System.out.println("[" + this.getClass().getName() + "]: " + formattedString);
    }

}
