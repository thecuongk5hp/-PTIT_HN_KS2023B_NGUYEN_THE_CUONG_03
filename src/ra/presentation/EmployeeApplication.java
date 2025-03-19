package ra.presentation;

import ra.bussiness.EmployeeBusiness;

import java.util.Scanner;

public class EmployeeApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeBusiness EmplB = new EmployeeBusiness();
        while (true) {
            System.out.println("=================EMPLOYEE MENU=================");
            System.out.println("1. Hiển thị danh sách nhân viên");
            System.out.println("2. Thêm mới nhân viên");
            System.out.println("3. Chỉnh sửa thông tin sinh viên");
            System.out.println("4. Xóa nhân viên");
            System.out.println("5. Tìm kiếm nhân viên");
            System.out.println("6. Sắp xếp");
            System.out.println("0.Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    EmplB.displayAllEmployees();
                    break;
                case 2:
                    EmplB.addEmployee(sc);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 0:
                    System.out.println("Đang thoát chương trình...");
                    System.exit(0);
                default:
                    System.out.println("lựa chọn ko hợp lệ vui lòng thử lại...");
            }
        }
    }
}
