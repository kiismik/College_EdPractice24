package task_6_Strategy;

class Document {
    private String documentName;
    private String documentContent;
    private User signedBy;

    public Document(String documentName, String documentContent, User signedBy) {
        this.documentName = documentName;
        this.documentContent = documentContent;
        this.signedBy = signedBy;
    }

    public String getDocumentName() {
        return documentName;
    }

    public String getDocumentContent() {
        return documentContent;
    }

    public User getSignedBy() {
        return signedBy;
    }
}