package task_7_Decorator;

import java.util.ArrayList;
import java.util.List;

public class SystemController {
    private final List<SystemAlert> alertHistory = new ArrayList<>();
    private final INotificationWrapper notifier;

    public SystemController(INotificationWrapper notifier) {
        this.notifier = notifier;
    }

    public void informAlert(SystemAlert alert) {
        alertHistory.add(alert);
        notifier.notify(alert);
    }
}
