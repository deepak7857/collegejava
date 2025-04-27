public class Employee {
    protected String empName;
    protected String empId;
    protected String address;
    protected String mailId;
    protected String mobileNo;

    public void setDetails(String empName, String empId, String address, String mailId, String mobileNo) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
    }

    public void displayDetails() {
        System.out.println("Employee Name  : " + empName);
        System.out.println("Employee ID    : " + empId);
        System.out.println("Address        : " + address);
        System.out.println("Email ID       : " + mailId);
        System.out.println("Mobile Number  : " + mobileNo);
    }
}
