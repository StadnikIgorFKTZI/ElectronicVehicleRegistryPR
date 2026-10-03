import java.util.ArrayList;

public class VehicleRegistry {

    private ArrayList<Owner> owners;
    private ArrayList<Vehicle> vehicles;
    private ArrayList<Document> documents;
    private ArrayList<Offense> offenses;
    private ArrayList<RegistrationOperation> operations;
    private ArrayList<AuthorizedUser> users;

    public VehicleRegistry() {
        owners = new ArrayList<>();
        vehicles = new ArrayList<>();
        documents = new ArrayList<>();
        offenses = new ArrayList<>();
        operations = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addOwner(Owner owner) {
        owners.add(owner);
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void addDocument(Document document) {
        documents.add(document);
    }

    public void addOffense(Offense offense) {
        offenses.add(offense);
    }

    public void addOperation(RegistrationOperation operation) {
        operations.add(operation);
    }

    public void addUser(AuthorizedUser user) {
        users.add(user);
    }

    public Owner findOwnerById(int id) {

        for (Owner owner : owners) {

            if (owner.getId() == id) {
                return owner;
            }
        }

        return null;
    }

    public void showOwners() {

        System.out.println("\n--- ВЛАСНИКИ ---");

        if (owners.isEmpty()) {
            System.out.println("Власників немає.");
            return;
        }

        for (Owner owner : owners) {
            System.out.println(owner);
        }
    }

    public void showVehicles() {

        if (vehicles.isEmpty()) {
            System.out.println("Транспортних засобів не знайдено.");
            return;
        }

        System.out.println("\n--- ТРАНСПОРТНІ ЗАСОБИ ---");

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public Vehicle findVehicleByVin(String vin) {

        for (Vehicle vehicle : vehicles) {

            if (vehicle.getVin().equalsIgnoreCase(vin)) {
                return vehicle;
            }
        }

        return null;
    }

    public Vehicle findVehicleByNumber(String number) {

        for (Vehicle vehicle : vehicles) {

            if (vehicle.getRegistrationNumber()
                    .equalsIgnoreCase(number)) {
                return vehicle;
            }
        }

        return null;
    }

    public void showDocuments() {

        if (documents.isEmpty()) {
            System.out.println("Документів не знайдено.");
            return;
        }

        System.out.println("\n--- ДОКУМЕНТИ ---");

        for (Document document : documents) {
            System.out.println(document);
        }
    }

    public void showOffenses() {

        if (offenses.isEmpty()) {
            System.out.println("Правопорушень не знайдено.");
            return;
        }

        System.out.println("\n--- ПРАВОПОРУШЕННЯ ---");

        for (Offense offense : offenses) {
            System.out.println(offense);
        }
    }

    public void showOperations() {

        if (operations.isEmpty()) {
            System.out.println("Реєстраційних операцій не знайдено.");
            return;
        }

        System.out.println("\n--- РЕЄСТРАЦІЙНІ ОПЕРАЦІЇ ---");

        for (RegistrationOperation operation : operations) {
            System.out.println(operation);
        }
    }

    public void showUsers() {

        if (users.isEmpty()) {
            System.out.println("Користувачів не знайдено.");
            return;
        }

        System.out.println("\n--- УПОВНОВАЖЕНІ КОРИСТУВАЧІ ---");

        for (AuthorizedUser user : users) {
            System.out.println(user);
        }
    }
}