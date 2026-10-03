public class DriverLicense extends Document {
    private String ownerName;
    private String category;

    public DriverLicense() {
    }

    public DriverLicense(int id, String number, String issueDate,
                         String expiryDate, String status,
                         String ownerName, String category) {
        super(id, number, issueDate, expiryDate, status);
        this.ownerName = ownerName;
        this.category = category;
    }

    public void addCategory(String category) {
        this.category = category;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "DriverLicense{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", status='" + status + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}