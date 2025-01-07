package Day9;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Contact_Directory_Management_System {
    static Scanner sc = new Scanner(System.in);
    static Hashtable<String, Long> directory = new Hashtable<>();

    static void addContacts(String name, long number) {
        directory.put(name, number);
    }

    static void removeContacts(String name) {
        directory.remove(name);
    }

    static void searchContact(String name) {
        if (directory.containsKey(name)) {
            System.out.println("Search contact " + name + ": " + directory.get(name));
        } else {
            System.out.println("Contact not found.");
        }
    }

    static void displayDirectory() {
        if (directory.isEmpty()) {
            System.out.println("Contact Directory is empty.");
        } else {
            System.out.println("Contact Directory:");
            for (Map.Entry<String, Long> i : directory.entrySet()) {
                System.out.println(i.getKey() + " : " + i.getValue());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("---------- Contact Directory Management System ----------");

        while (true) {
            System.out.println("1. Add contacts");
            System.out.println("2. Remove contacts");
            System.out.println("3. Search contacts");
            System.out.println("4. Display contacts");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    long phone_number = sc.nextLong();
                    sc.nextLine();
                    addContacts(name, phone_number);
                    System.out.println("Contact added successfully!");
                    break;

                case 2:
                    System.out.print("Enter name to remove: ");
                    name = sc.nextLine();
                    if (directory.containsKey(name)) {
                        removeContacts(name);
                        System.out.println("Contact removed successfully!");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    name = sc.nextLine();
                    searchContact(name);
                    break;

                case 4:
                    displayDirectory();
                    break;

                case 0:
                    System.out.println("---------- Exiting ----------");
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Please enter a valid input!");
            }
        }
    }
}
