package task_4_Observer;

public class PhoneNotifier implements Observer{
    private String phoneNumber;
    public PhoneNotifier(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public void notify(SystemAlert sysAl) {
        System.out.println(sysAl.toString() + " send on number " + this.phoneNumber);
    }
}
