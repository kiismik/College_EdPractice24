package task_6_Strategy;

interface OutputStrategy {
    void printReport(Document document);

    void sendReportViaMail(Document document);

    void sendReportViaTelegram(Document document);
}