package observer;

public class SMSUsers implements Observer {

    private final Subject subject;
    private String name;
    private String commentaryLatest;

    public SMSUsers(Subject subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void update(String desc) {
        this.commentaryLatest = desc;
        System.out.println(this.name + " has been updated with message: ");
        System.out.println(this.commentaryLatest);
    }

    @Override
    public void subscribe() {
        subject.subscribeObserver(this);
        System.out.println(this.name + " has subscribed to commentary subject: ");
        System.out.println(this.subject.subjectDetails());
    }

    @Override
    public void unSubscribe() {
        subject.unSubscribeObserver(this);
        System.out.println(this.name + " has un-subscribed from commentary subject: ");
        System.out.println(this.subject.subjectDetails());
    }

}
