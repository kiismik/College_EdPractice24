package task_4_Store;

import java.time.LocalDate;

public class StoreNotification {
    private AlertSeverity severity;
    private String message;
    private int code;
    private LocalDate date;
    private String product;

    public StoreNotification(AlertSeverity severity, String message, int code, LocalDate date, String product) {
        this.severity = severity;
        this.message = message;
        this.code = code;
        this.date = date;
        this.product = product;
    }

    public void setSeverity(AlertSeverity severity) {
        this.severity = severity;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "StoreNotification{" +
                "severity=" + severity +
                ", message='" + message + '\'' +
                ", code=" + code +
                ", date=" + date +
                ", product='" + product + '\'' +
                '}';
    }
}