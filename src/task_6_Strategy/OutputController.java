package task_6_Strategy;

class OutputController {
    private Document document;
    private OutputStrategy outputStrategy;

    public OutputController(Document document) {
        this.document = document;
    }

    public void setOutputStrategy(OutputStrategy strategy) {
        this.outputStrategy = strategy;
    }

    public void printReport() {
        if (outputStrategy != null) {
            outputStrategy.printReport(document);
        } else {
            System.out.println("No output strategy set.");
        }
    }

    public void sendReportViaMail() {
        if (outputStrategy != null) {
            outputStrategy.sendReportViaMail(document);
        } else {
            System.out.println("No output strategy set.");
        }
    }

    public void sendReportViaTelegram() {
        if (outputStrategy != null) {
            outputStrategy.sendReportViaTelegram(document);
        } else {
            System.out.println("No output strategy set.");
        }
    }
}

