package ra.bussiness;

import ra.entity.Employee;
import java.util.Scanner;

public class EmployeeBusiness {
    private Employee[] emp = new Employee[100];
    private int count = 0

    public void addEmployee(Scanner sc) {
        if (count >= emp.length) {
            System.out.println("Danh sách nhân viên đã đầy, không thể thêm mới!");
            return;
        }
        int choice;
        do {
            System.out.print("Nhập số lượng nhân viên cần thêm: ");
            while (!sc.hasNextInt()) {
                System.out.print("Số lượng không hợp lệ. Nhập lại: ");
                sc.next();
            }
            choice = sc.nextInt();
        } while (choice <= 0 || choice > (emp.length - count));
        sc.nextLine();
        for (int i = 0; i < choice; i++) {
            Employee emp1 = new Employee();
            emp1.inputData(sc);
            emp[count++] = emp1;
        }
        System.out.println("Thêm nhân viên thành công!");
    }
    public void displayAllEmployees() {
        if (count == 0) {
            System.out.println("Danh sách nhân viên trống.");
        } else {
            for (int i = 0; i < count; i++) {
                emp[i].displayData();
            }
        }
    }
}
