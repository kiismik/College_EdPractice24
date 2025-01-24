package task_6_Strategy;

public class ApplicationManager {
    private OutputController ioController;

    public ApplicationManager(String platform) {

        User user = new User("John", "Doe");
        Document document = new Document("Sample Document", "This is a sample document.", user);
        ioController = new OutputController(document);

        // Настройка стратегии на основе введенной платформы
        switch (platform.toLowerCase()) {
            case "windows":
                ioController.setOutputStrategy(new WindowsOutputStrategy());
                break;
            case "linux":
                ioController.setOutputStrategy(new LinuxOutputStrategy());
                break;
            case "mac":
                ioController.setOutputStrategy(new MacOutputStrategy());
                break;
            case "android":
                ioController.setOutputStrategy(new AndroidOutputStrategy());
                break;
            default:
                System.out.println("Unsupported platform. No strategy will be set.");
        }
    }

    public void run() {
        ioController.printReport();
        ioController.sendReportViaMail();
        ioController.sendReportViaTelegram();
    }
}

