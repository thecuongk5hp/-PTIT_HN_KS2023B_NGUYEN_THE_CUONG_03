package ra.entity;
import java.util.Scanner;

public class Employee implements IApp {
    private String employeeId ;
    private String employeeName  ;
    private String birthday ;
    private String phoneNumber ;
    private Boolean sex ;
    private float  coefficient ;
    private int allowanceSalary ;
    private String department ;
    private byte status ;
    private int baseSalary ;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, String birthday, String phoneNumber, Boolean sex, float coefficient, int allowanceSalary, String department, byte status, int baseSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.coefficient = coefficient;
        this.allowanceSalary = allowanceSalary;
        this.department = department;
        this.status = status;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public float getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(float coefficient) {
        this.coefficient = coefficient;
    }

    public int getAllowanceSalary() {
        return allowanceSalary;
    }

    public void setAllowanceSalary(int allowanceSalary) {
        this.allowanceSalary = allowanceSalary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.print("Nhập  Mã nhân viên: ");
        employeeId  = scanner.nextLine();
        System.out.print("Nhập tên Tên nhân viên: ");
        employeeName  = scanner.nextLine();
        System.out.print("Nhập  ngày sinh: ");
        birthday  = scanner.nextLine();
        System.out.print("Nhập gioi tinh: ");
        sex  = scanner.nextBoolean();
        scanner.nextLine();
        System.out.print("Nhập hệ số lương: ");
        coefficient  = scanner.nextFloat();
        System.out.print("Nhập phụ cấp lương: ");
        allowanceSalary  = scanner.nextInt();
        System.out.print("Nhập  phòng ban làm việc: ");
        department  = scanner.nextLine();
        System.out.print("Nhập trạng thái  (1: Dang lam viec, 2: Dang nghi phep, 3: Da nghi viec): ");
        status = scanner.nextByte();
        System.out.print(" ");
        baseSalary = scanner.nextInt();
    }

    @Override
    public void displayData() {
        System.out.println("----------------------------------------------------------");
        System.out.println("Mã Nhan vien: " + employeeId);
        System.out.println("Tên nhan vien: " + employeeName);
        System.out.println("Ngay sinh: " + birthday);
        System.out.println("Gioi tinh: " + sex);
        System.out.println("He so luong: " + coefficient);
        System.out.println("Phu cap luong: " + allowanceSalary);
        System.out.println("Phong ban loam viec: " + department);
        System.out.println(": " + baseSalary);
        System.out.println("Trạng thái: " + (status == 1 ? "Dang lam viec" : status == 2 ? "Dang nghi phep" : "Da nghi viec"));
        System.out.println("----------------------------------------------------------");
    }
}