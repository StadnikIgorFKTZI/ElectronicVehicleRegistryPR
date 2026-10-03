import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static VehicleRegistry registry = new VehicleRegistry();

    public static void main(String[] args) {

        createTestData();

        boolean running = true;

        while (running) {
            showMenu();

            int choice = readInt("Оберіть пункт: ");

            switch (choice) {

                case 1:
                    addOwner();
                    break;

                case 2:
                    addVehicle();
                    break;

                case 3:
                    registry.showOwners();
                    break;

                case 4:
                    registry.showVehicles();
                    break;

                case 5:
                    searchVehicle();
                    break;

                case 6:
                    registry.showDocuments();
                    break;

                case 7:
                    registry.showOffenses();
                    break;

                case 8:
                    registry.showOperations();
                    break;

                case 9:
                    registry.showUsers();
                    break;

                case 0:
                    running = false;
                    System.out.println("Програму завершено.");
                    break;

                default:
                    System.out.println("Невірний пункт меню.");
            }
        }

        scanner.close();
    }

    private static void showMenu() {

        System.out.println();
        System.out.println("==============================================");
        System.out.println("   ЕЛЕКТРОННИЙ РЕЄСТР ТРАНСПОРТНИХ ЗАСОБІВ");
        System.out.println("==============================================");
        System.out.println("1. Додати власника");
        System.out.println("2. Додати транспортний засіб");
        System.out.println("3. Показати всіх власників");
        System.out.println("4. Показати всі транспортні засоби");
        System.out.println("5. Знайти транспортний засіб");
        System.out.println("6. Показати документи");
        System.out.println("7. Показати правопорушення");
        System.out.println("8. Показати реєстраційні операції");
        System.out.println("9. Показати уповноважених користувачів");
        System.out.println("0. Вихід");
        System.out.println("==============================================");
    }

    private static void addOwner() {

        System.out.println("\n--- ДОДАВАННЯ ВЛАСНИКА ---");

        int id = readInt("ID: ");

        System.out.print("Ім'я: ");
        String firstName = scanner.nextLine();

        System.out.print("Прізвище: ");
        String lastName = scanner.nextLine();

        System.out.print("Адреса: ");
        String address = scanner.nextLine();

        System.out.print("Телефон: ");
        String phone = scanner.nextLine();

        Owner owner = new Owner(
                id,
                firstName,
                lastName,
                address,
                phone
        );

        registry.addOwner(owner);

        System.out.println("Власника успішно додано.");
    }

    private static void addVehicle() {

        System.out.println("\n--- ДОДАВАННЯ ТРАНСПОРТНОГО ЗАСОБУ ---");

        int ownerId = readInt("ID власника: ");

        System.out.print("Марка: ");
        String brand = scanner.nextLine();

        System.out.print("Модель: ");
        String model = scanner.nextLine();

        int year = readInt("Рік випуску: ");

        System.out.print("VIN-код: ");
        String vin = scanner.nextLine();

        System.out.print("Державний номер: ");
        String registrationNumber = scanner.nextLine();

        // Пошук існуючого власника в реєстрі
        Owner owner = findOwnerById(ownerId);

        if (owner == null) {
            System.out.println("Власника з таким ID не знайдено.");
            return;
        }

        int id = readInt("ID транспортного засобу: ");

        Vehicle vehicle = new Vehicle(
                id,
                brand,
                model,
                year,
                vin,
                registrationNumber,
                owner
        );

        registry.addVehicle(vehicle);

        System.out.println("Транспортний засіб успішно додано.");
    }

    private static Owner findOwnerById(int id) {

        return registry.findOwnerById(id);
    }

    private static void searchVehicle() {

        System.out.println("\n--- ПОШУК ТРАНСПОРТНОГО ЗАСОБУ ---");

        System.out.println("1. Пошук за VIN");
        System.out.println("2. Пошук за державним номером");

        int choice = readInt("Оберіть тип пошуку: ");

        Vehicle vehicle = null;

        if (choice == 1) {

            System.out.print("Введіть VIN: ");
            String vin = scanner.nextLine();

            vehicle = registry.findVehicleByVin(vin);

        } else if (choice == 2) {

            System.out.print("Введіть державний номер: ");
            String number = scanner.nextLine();

            vehicle = registry.findVehicleByNumber(number);

        } else {

            System.out.println("Невірний пункт.");
            return;
        }

        if (vehicle == null) {
            System.out.println("Транспортний засіб не знайдено.");
        } else {
            System.out.println("\nТранспортний засіб знайдено:");
            System.out.println(vehicle);
        }
    }

    private static int readInt(String message) {

        while (true) {

            try {

                System.out.print(message);

                int value = Integer.parseInt(scanner.nextLine());

                return value;

            } catch (NumberFormatException e) {

                System.out.println(
                        "Помилка! Введіть ціле число."
                );
            }
        }
    }

    private static void createTestData() {

        Owner owner1 = new Owner(
                1,
                "Ігор",
                "Стаднік",
                "Bratislava",
                "+421900000000"
        );

        registry.addOwner(owner1);

        Vehicle vehicle1 = new Vehicle(
                1,
                "Toyota",
                "Camry",
                2020,
                "JTDBE32K123456789",
                "BA-123AB",
                owner1
        );

        registry.addVehicle(vehicle1);

        RegistrationDocument registrationDocument =
                new RegistrationDocument(
                        1,
                        "RD-001",
                        "01.09.2026",
                        "01.09.2031",
                        "Дійсний",
                        vehicle1.getVin(),
                        vehicle1.getRegistrationNumber()
                );

        DriverLicense driverLicense =
                new DriverLicense(
                        2,
                        "DL-001",
                        "01.01.2025",
                        "01.01.2035",
                        "Дійсний",
                        owner1.getFullName(),
                        "B"
                );

        InsurancePolicy insurancePolicy =
                new InsurancePolicy(
                        3,
                        "INS-001",
                        "01.09.2026",
                        "01.09.2027",
                        "Дійсний",
                        vehicle1.getVin(),
                        "Insurance Company",
                        5000
                );

        registry.addDocument(registrationDocument);
        registry.addDocument(driverLicense);
        registry.addDocument(insurancePolicy);

        Fine fine = new Fine(
                1,
                "15.09.2026",
                "Перевищення швидкості",
                "Не сплачено",
                100,
                false
        );

        LegalCase legalCase = new LegalCase(
                2,
                "20.09.2026",
                "Адміністративне правопорушення",
                "Відкрита",
                "CASE-001",
                "Bratislava District Court",
                "Розглядається"
        );

        registry.addOffense(fine);
        registry.addOffense(legalCase);

        RegistrationOperation operation =
                new RegistrationOperation(
                        1,
                        "Реєстрація транспортного засобу",
                        "01.09.2026",
                        vehicle1,
                        owner1
                );

        registry.addOperation(operation);

        AuthorizedUser user =
                new AuthorizedUser(
                        1,
                        "admin",
                        "Адміністратор системи",
                        "Адміністратор"
                );

        registry.addUser(user);
    }
}