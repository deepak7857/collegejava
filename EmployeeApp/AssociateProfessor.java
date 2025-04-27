public class AssociateProfessor extends Employee {
    private double basicPay;

    public AssociateProfessor(double basicPay) {
        this.basicPay = basicPay;
    }

    public void generatePaySlip() {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;

        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClubFund;

        System.out.println("\n--- Associate Professor Pay Slip ---");
        displayDetails();
        System.out.println("Basic Pay       : " + basicPay);
        System.out.println("Gross Salary    : " + grossSalary);
        System.out.println("Net Salary      : " + netSalary);
    }
}
