package Question2_Strategy;

public class TextEditor {

    private TextFormatter formatter;

    public TextEditor(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public void publishText(String text) {
        this.formatter.format(text);
    }
}
