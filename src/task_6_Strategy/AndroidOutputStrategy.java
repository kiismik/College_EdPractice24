package task_6_Strategy;

class AndroidOutputStrategy implements OutputStrategy {
    @Override
    public void printReport(Document document) {
        System.out.println("Document \"" + document.getDocumentName() + "\" has been printed from Android.");
    }

    @Override
    public void sendReportViaMail(Document document) {
        System.out.println("Document \"" + document.getDocumentName() + "\" has been sent via Mail from Android.");
    }

    @Override
    public void sendReportViaTelegram(Document document) {
        System.out.println("Document \"" + document.getDocumentName() + "\" has been sent via Telegram from Android.");
    }
}