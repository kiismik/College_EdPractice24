package task_4_Observer;

import java.time.LocalDate;

public class SystemAlertBuilder {
    private AlertSeverity severity;
    private String message;
    private int executionCode;
    private LocalDate timestamp;
    private String process;

    public SystemAlertBuilder setSeverity(AlertSeverity severity) {
        this.severity = severity;
        return this;
    }

    public SystemAlertBuilder setMessage(String message) {
        this.message = message;
        return this;
    }

    public SystemAlertBuilder setExecutionCode(int executionCode) {
        this.executionCode = executionCode;
        return this;
    }

    public SystemAlertBuilder setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public SystemAlertBuilder setProcess(String process) {
        this.process = process;
        return this;
    }

    public SystemAlert build() {
        return new SystemAlert(severity, message, executionCode, timestamp, process);
    }
}

