public class AssistantProfessor extends Employee {
    private double basicPay;

    public AssistantProfessor(double basicPay) {
        this.basicPay = basicPay;
    }
/*************  ✨ Windsurf Command ⭐  *************/
/**
 * Generates and prints the pay slip for an Assistant Professor.
 * Calculates various components such as Dearness Allowance (DA),
 * House Rent Allowance (HRA), Provident Fund (PF), and Staff Club Fund
 * based on the basic pay. Computes the gross and net salary, and
 * displays the details along with the pay slip information.
 */

/*******  a0d620e4-559d-499b-adeb-762d7a5acb6a  *******/

    public void generatePaySlip() {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;

        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClubFund;

        System.out.println("\n--- Assistant Professor Pay Slip ---");
        displayDetails();
        System.out.println("Basic Pay       : " + basicPay);
        System.out.println("Gross Salary    : " + grossSalary);
        System.out.println("Net Salary      : " + netSalary);
    }
}
