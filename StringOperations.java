import java.util.ArrayList;
import java.util.Scanner;

public class StringOperations {
    private ArrayList<String> stringList;

    public StringOperations() {
        stringList = new ArrayList<>();
    }

    // a. Append - add at end
    public void append(String str) {
        stringList.add(str);
    }

    // b. Insert - add at particular index
    public void insert(int index, String str) {
        if (index >= 0 && index <= stringList.size()) {
            stringList.add(index, str);
        } else {
            System.out.println("Invalid index.");
        }
    }

    // c. Search
    public boolean search(String str) {
        return stringList.contains(str);
    }

    // d. List all strings that start with a given letter
    public void listStartsWith(char letter) {
        boolean found = false;
        for (String str : stringList) {
            if (!str.isEmpty() && str.charAt(0) == letter) {
                System.out.println(str);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No strings found starting with '" + letter + "'.");
        }
    }

    // Method to display all strings
    public void display() {
        System.out.println("Current List: " + stringList);
    }

    public static void main(String[] args) {
        StringOperations ops = new StringOperations();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- String Operations Menu ---");
            System.out.println("1. Append");
            System.out.println("2. Insert at index");
            System.out.println("3. Search");
            System.out.println("4. List strings starting with a letter");
            System.out.println("5. Display all strings");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter string to append: ");
                    String appendStr = scanner.nextLine();
                    ops.append(appendStr);
                    break;
                case 2:
                    System.out.print("Enter index to insert at: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter string to insert: ");
                    String insertStr = scanner.nextLine();
                    ops.insert(index, insertStr);
                    break;
                case 3:
                    System.out.print("Enter string to search for: ");
                    String searchStr = scanner.nextLine();
                    if (ops.search(searchStr)) {
                        System.out.println("String found.");
                    } else {
                        System.out.println("String not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter starting letter: ");
                    char letter = scanner.nextLine().charAt(0);
                    ops.listStartsWith(letter);
                    break;
                case 5:
                    ops.display();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
