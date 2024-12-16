package task_4_Observer;

public class EmailNotifier implements Observer{
    private String uniqueName;
    public EmailNotifier(String uniqueName) {
        this.uniqueName = uniqueName;
    }
    @Override
    public void notify(SystemAlert sysAl) {
        System.out.println(sysAl.toString() + " send to email: " + this.uniqueName);
    }
}
