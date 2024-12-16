package task_4_Observer;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SystemAlertBuilder builder = new SystemAlertBuilder();
        SystemAlert al1 = builder.setSeverity(AlertSeverity.WARNING)
                .setMessage("Hackers attack")
                .setExecutionCode(4)
                .setTimestamp(LocalDate.now())
                .setProcess("FireWall")
                .build();

        SystemAlert al2 = builder.setSeverity(AlertSeverity.INFO)
                .setMessage("Attacked stopped")
                .setExecutionCode(404)
                .setTimestamp(LocalDate.now())
                .setProcess("FireWall")
                .build();

        SystemAlert al3 = builder.setSeverity(AlertSeverity.CRITCAL)
                .setMessage("High ping")
                .setExecutionCode(4444)
                .setTimestamp(LocalDate.now())
                .setProcess("WiFi")
                .build();

        SystemController control1 = new SystemController();
        EmailNotifier email_first = new EmailNotifier("kseniasenko@gmail.com");
        SysLogNotifier login = new SysLogNotifier("login");
        PhoneNotifier phone_first = new PhoneNotifier("+380777777777");
        TelegramNotifier telegram_first = new TelegramNotifier("kiismik", true);

        control1.subscribe(email_first);
        control1.subscribe(login);
        control1.subscribe(phone_first);
        control1.subscribe(telegram_first);

        control1.addAlert(al1);
        control1.addAlert(al2);
        control1.addAlert(al3);
        control1.infoAlert();

        control1.addAlert(al1);
        control1.subscribe(email_first);
        control1.subscribe(phone_first);
        control1.unsubscribe(phone_first);
        control1.infoAlert();
    }
}
