package Question02_Strategy;

public class LowerTextFormatter implements TextFormatter{

    @Override
    public void format(String text) {
        String formattedString = text.toLowerCase();
        System.out.println("[" + this.getClass().getName() + "]: " + formattedString);
    }

}
