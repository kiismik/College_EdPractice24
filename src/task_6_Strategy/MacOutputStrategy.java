package task_6_Strategy;

class MacOutputStrategy implements OutputStrategy {
    @Override
    public void printReport(Document document) {
        System.out.println("Document \"" + document.getDocumentName() + "\" has been printed from macOS.");
    }

    @Override
    public void sendReportViaMail(Document document) {
        System.out.println("Document \"" + document.getDocumentName() + "\" has been sent via Mail from macOS.");
    }

    @Override
    public void sendReportViaTelegram(Document document) {
        System.out.println("Document \"" + document.getDocumentName() + "\" has been sent via Telegram from macOS.");
    }
}
