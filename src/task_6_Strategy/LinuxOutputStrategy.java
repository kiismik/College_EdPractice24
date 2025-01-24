package task_6_Strategy;

class LinuxOutputStrategy implements OutputStrategy {
    @Override
    public void printReport(Document document) {
        System.out.println("Document \"" + document.getDocumentName() + "\" has been printed from Linux.");
    }

    @Override
    public void sendReportViaMail(Document document) {
        System.out.println("Document \"" + document.getDocumentName() + "\" has been sent via Mail from Linux.");
    }

    @Override
    public void sendReportViaTelegram(Document document) {
        System.out.println("Document \"" + document.getDocumentName() + "\" has been sent via Telegram from Linux.");
    }
}
