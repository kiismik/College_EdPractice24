package task_7_Decorator;

public class SystemAlert {
    private final AlertSeverity severity;
    private final String message;
    private final int executionCode;
    private final String process;

    public SystemAlert(AlertSeverity severity, String message, int executionCode, String process) {
        this.severity = severity;
        this.message = message;
        this.executionCode = executionCode;
        this.process = process;
    }

    public AlertSeverity getSeverity() {
        return severity;
    }

    public String getMessage() {
        return message;
    }

    public int getExecutionCode() {
        return executionCode;
    }

    public String getProcess() {
        return process;
    }
}
