package task_6_Strategy;

class WindowsOutputStrategy implements OutputStrategy {
    @Override
    public void printReport(Document document) {
        System.out.println("Document \"" + document.getDocumentName() + "\" has been printed from Windows.");
    }

    @Override
    public void sendReportViaMail(Document document) {
        System.out.println("Document \"" + document.getDocumentName() + "\" has been sent via Mail from Windows.");
    }

    @Override
    public void sendReportViaTelegram(Document document) {
        System.out.println("Document \"" + document.getDocumentName() + "\" has been sent via Telegram from Windows.");
    }
}
