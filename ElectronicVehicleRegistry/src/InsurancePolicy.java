public class InsurancePolicy extends Document {
    private String vehicleVin;
    private String insuranceCompany;
    private double insuranceAmount;

    public InsurancePolicy() {
    }

    public InsurancePolicy(int id, String number, String issueDate,
                           String expiryDate, String status,
                           String vehicleVin,
                           String insuranceCompany,
                           double insuranceAmount) {
        super(id, number, issueDate, expiryDate, status);
        this.vehicleVin = vehicleVin;
        this.insuranceCompany = insuranceCompany;
        this.insuranceAmount = insuranceAmount;
    }

    public void renewPolicy(String expiryDate) {
        this.expiryDate = expiryDate;
        this.status = "Дійсний";
    }

    public String getVehicleVin() {
        return vehicleVin;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public double getInsuranceAmount() {
        return insuranceAmount;
    }

    @Override
    public String toString() {
        return "InsurancePolicy{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", status='" + status + '\'' +
                ", vehicleVin='" + vehicleVin + '\'' +
                ", insuranceCompany='" + insuranceCompany + '\'' +
                ", insuranceAmount=" + insuranceAmount +
                '}';
    }
}