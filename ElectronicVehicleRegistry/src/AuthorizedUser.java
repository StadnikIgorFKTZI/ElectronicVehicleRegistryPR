public class AuthorizedUser {
    private int id;
    private String login;
    private String fullName;
    private String role;

    public AuthorizedUser() {
    }

    public AuthorizedUser(int id, String login,
                          String fullName, String role) {
        this.id = id;
        this.login = login;
        this.fullName = fullName;
        this.role = role;
    }

    public void searchVehicle() {
    }

    public void addInformation() {
    }

    public void updateInformation() {
    }

    public void viewInformation() {
    }

    public String getLogin() {
        return login;
    }

    public String getFullName() {
        return fullName;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "AuthorizedUser{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", fullName='" + fullName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}