public class LegalCase extends Offense {
    private String caseNumber;
    private String court;
    private String decision;

    public LegalCase() {
    }

    public LegalCase(int id, String date, String description,
                     String status, String caseNumber,
                     String court, String decision) {
        super(id, date, description, status);
        this.caseNumber = caseNumber;
        this.court = court;
        this.decision = decision;
    }

    public void closeCase(String decision) {
        this.decision = decision;
        this.status = "Закрита";
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public String getCourt() {
        return court;
    }

    public String getDecision() {
        return decision;
    }

    @Override
    public String toString() {
        return "LegalCase{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", caseNumber='" + caseNumber + '\'' +
                ", court='" + court + '\'' +
                ", decision='" + decision + '\'' +
                '}';
    }
}