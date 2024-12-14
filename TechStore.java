import java.util.Scanner;
import java.lang.Math;
public class TechStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create some products
        Smartphone phone = new Smartphone(999.99, 0, "iPhone 14", 4, "A16", "6.1 inch", "iOS");  
        Laptop laptop1 = new Laptop(1499.99, 9, "XPS", 5, "Intel i7", "15-inch", "Windows");
        Laptop laptop2 = new Laptop(1599.99, 8, "Razer Blade", 2, "Intel i9", "14-inch", "Windows");
        Tablet tablet = new Tablet(799.99, 10, "iPad", 4, "M1", "11-inch", "iPadOS");
        Accessories headphones = new Accessories(199.99, 1, "AirPods Max", 4);
        Accessories mouse = new Accessories(99.99, 6, "Gaming Mouse", 0);
        Accessories keyboard = new Accessories(129.99, 7, "Mechanical Keyboard", 1);
        // Create a customer
        
        System.out.println("Welcome to Tech Store!");
        System.out.println("What's your name?");
        String Name = scanner.nextLine();
        int id = (int)(Math.random() * 900000) + 100000; // Generate random 6-digit ID
        System.out.println("Your generated ID is: " + id);
        System.out.print("Set your 6-digit password: ");
        int pw;
        while (true) {
            pw = scanner.nextInt();
            if (String.valueOf(pw).length() == 6) {
                break;
            } else {
                System.out.print("Password must be 6 digits. Try again: ");
            }
        }
        Customer customer = new Customer(Name, id, pw, 5000.00);

        boolean exit = true;
        while (exit) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Buy an item");
            System.out.println("2. Check deposit");
            System.out.println("3. View purchased items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable items:");
                    System.out.println("1. " + laptop1.getName() + laptop1.getColor() + " (" + laptop1.getBrand() + ") - $" + laptop1.getPrice() + ", Processor: " + laptop1.getProcessor() + ", Size: " + laptop1.getSize() + ", System: " + laptop1.getSystem());
                    System.out.println("2. " + laptop2.getName() + laptop2.getColor() + " (" + laptop2.getBrand() + ") - $" + laptop2.getPrice() + ", Processor: " + laptop2.getProcessor() + ", Size: " + laptop2.getSize() + ", System: " + laptop2.getSystem());
                    System.out.println("3. " + phone.getName() + phone.getColor() + " (" + phone.getBrand() + ") - $" + phone.getPrice() + ", Processor: " + phone.getChip() + ", Size: " + phone.getSize() + ", System: " + phone.getSystem());
                    System.out.println("4. " + tablet.getName() + tablet.getColor() + " (" + tablet.getBrand() + ") - $" + tablet.getPrice() + ", Processor: " + tablet.getChip() + ", Size: " + tablet.getSize() + ", System: " + tablet.getSystem());
                    System.out.println("5. " + headphones);
                    System.out.println("6. " + mouse);
                    System.out.println("7. " + keyboard);
                    System.out.print("Select an item to buy (1-7): ");
                    int itemChoice = scanner.nextInt();

                    switch (itemChoice) {
                        case 1:
                            customer.buy(laptop1);
                            break;
                        case 2:
                            customer.buy(laptop2);
                            break;
                        case 3:
                            customer.buy(phone);
                            break;
                        case 4:
                            customer.buy(tablet);
                            break;
                        case 5:
                            customer.buy(headphones);
                            break;
                        case 6:
                            customer.buy(mouse);
                            break;
                        case 7:
                            customer.buy(keyboard);
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;
                case 2:
                    System.out.println("Your current deposit is: $" + customer.getDeposit());
                    break;
                case 3:
                    customer.printPurchasedItems();
                    break;
                case 4:
                    System.out.println("Thank you for visiting the Tech Store!");
                    exit = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
