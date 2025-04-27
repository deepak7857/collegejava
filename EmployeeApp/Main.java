import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Employee Pay Slip Generator ---");
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter Mail ID: ");
        String mail = sc.nextLine();
        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        System.out.println("\nSelect Employee Role:");
        System.out.println("1. Programmer");
        System.out.println("2. Assistant Professor");
        System.out.println("3. Associate Professor");
        System.out.println("4. Professor");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Basic Pay: ");
        double bp = sc.nextDouble();

        switch (choice) {
            case 1:
                Programmer programmer = new Programmer(bp);
                programmer.setDetails(name, id, address, mail, mobile);
                programmer.generatePaySlip();
                break;
            case 2:
                AssistantProfessor assistant = new AssistantProfessor(bp);
                assistant.setDetails(name, id, address, mail, mobile);
                assistant.generatePaySlip();
                break;
            case 3:
                AssociateProfessor associate = new AssociateProfessor(bp);
                associate.setDetails(name, id, address, mail, mobile);
                associate.generatePaySlip();
                break;
            case 4:
                Professor professor = new Professor(bp);
                professor.setDetails(name, id, address, mail, mobile);
                professor.generatePaySlip();
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
