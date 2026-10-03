public class Fine extends Offense {
    private double amount;
    private boolean paid;

    public Fine() {
    }

    public Fine(int id, String date, String description,
                String status, double amount, boolean paid) {
        super(id, date, description, status);
        this.amount = amount;
        this.paid = paid;
    }

    public void payFine() {
        paid = true;
        status = "Сплачено";
    }

    public double getAmount() {
        return amount;
    }

    public boolean isPaid() {
        return paid;
    }

    @Override
    public String toString() {
        return "Fine{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                ", paid=" + paid +
                '}';
    }
}