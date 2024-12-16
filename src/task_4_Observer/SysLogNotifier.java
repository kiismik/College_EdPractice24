package task_4_Observer;

public class SysLogNotifier implements Observer{
    private String journalName;
    public SysLogNotifier(String journalName) {
        this.journalName = journalName;
    }
    @Override
    public void notify(SystemAlert sysAl) {
        System.out.println(sysAl.toString() + " add in journal " + this.journalName);
    }
}
