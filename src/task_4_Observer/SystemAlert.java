package task_4_Observer;

import java.time.LocalDate;
public class SystemAlert {
    private AlertSeverity severity;
    private String message;
    private int executionCode;
    private LocalDate timestamp;
    private String process;
    public SystemAlert(AlertSeverity severity, String message, int executionCode, LocalDate timestamp, String process) {
        this.severity = severity;
        this.message = message;
        this.executionCode = executionCode;
        this.timestamp = timestamp;
        this.process = process;
    }
    public AlertSeverity get_severity() {
        return severity;
    }
    public String get_message() {
        return message;
    }
    public int get_executionCode() {
        return executionCode;
    }
    public LocalDate get_timestamp() {
        return timestamp;
    }
    public String get_process() {
        return process;
    }
    @Override
    public String toString() {
        return "SystemAlert{" +
                " severity=" + severity +
                ",  message='" + message + '\'' +
                ",  executionCode='" + executionCode + '\'' +
                ",  timestamp=" + timestamp +
                ",  process='" + process + '\'' +
                '}';
    }
}
