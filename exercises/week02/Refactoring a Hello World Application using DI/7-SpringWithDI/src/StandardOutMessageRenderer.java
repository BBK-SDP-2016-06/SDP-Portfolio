public class StandardOutMessageRenderer implements MessageRenderer{
    private MessageProvider messageProvider = null;

    @Override
    public void render() {
        if(this.messageProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class " + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(this.messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }

}
