package task_4_Store;

import java.time.LocalDate;

public class StoreNotificationBuilder {
    private AlertSeverity severity;
    private String message;
    private int code;
    private LocalDate date;
    private String product;

    public StoreNotificationBuilder setSeverity(AlertSeverity severity) {
        this.severity = severity;
        return this;
    }

    public StoreNotificationBuilder setMessage(String message) {
        this.message = message;
        return this;
    }

    public StoreNotificationBuilder setCode(int code) {
        this.code = code;
        return this;
    }

    public StoreNotificationBuilder setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public StoreNotificationBuilder setProduct(String product) {
        this.product = product;
        return this;
    }

    public StoreNotification build() {
        return new StoreNotification(severity, message, code, date, product);
    }
}