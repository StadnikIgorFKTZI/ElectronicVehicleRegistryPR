public class Offense {
    protected int id;
    protected String date;
    protected String description;
    protected String status;

    public Offense() {
    }

    public Offense(int id, String date,
                   String description, String status) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.status = status;
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Offense{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}