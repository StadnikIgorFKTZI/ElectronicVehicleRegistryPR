public class Document {
    protected int id;
    protected String number;
    protected String issueDate;
    protected String expiryDate;
    protected String status;

    public Document() {
    }

    public Document(int id, String number, String issueDate,
                    String expiryDate, String status) {
        this.id = id;
        this.number = number;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
        this.status = status;
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}