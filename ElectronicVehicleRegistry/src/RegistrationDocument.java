public class RegistrationDocument extends Document {
    private String vehicleVin;
    private String registrationNumber;

    public RegistrationDocument() {
    }

    public RegistrationDocument(int id, String number, String issueDate,
                                String expiryDate, String status,
                                String vehicleVin,
                                String registrationNumber) {
        super(id, number, issueDate, expiryDate, status);
        this.vehicleVin = vehicleVin;
        this.registrationNumber = registrationNumber;
    }

    public void registerVehicle() {
        status = "Дійсний";
    }

    public String getVehicleVin() {
        return vehicleVin;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String toString() {
        return "RegistrationDocument{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", status='" + status + '\'' +
                ", vehicleVin='" + vehicleVin + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}