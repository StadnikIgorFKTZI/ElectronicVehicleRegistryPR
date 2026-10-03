public class RegistrationOperation {
    private int id;
    private String operationType;
    private String date;
    private Vehicle vehicle;
    private Owner owner;

    public RegistrationOperation() {
    }

    public RegistrationOperation(int id, String operationType,
                                 String date, Vehicle vehicle,
                                 Owner owner) {
        this.id = id;
        this.operationType = operationType;
        this.date = date;
        this.vehicle = vehicle;
        this.owner = owner;
    }

    public void execute() {
        System.out.println("Реєстраційну операцію виконано.");
    }

    public int getId() {
        return id;
    }

    public String getOperationType() {
        return operationType;
    }

    public String getDate() {
        return date;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Owner getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "RegistrationOperation{" +
                "id=" + id +
                ", operationType='" + operationType + '\'' +
                ", date='" + date + '\'' +
                ", vehicle=" + vehicle +
                ", owner=" + owner +
                '}';
    }
}