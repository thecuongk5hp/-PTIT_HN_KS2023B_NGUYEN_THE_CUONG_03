package ra.presentation;

import ra.entity.Employee;

import java.util.Scanner;

public class EmployeeApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[100];
        Scanner scanner;
        int Choice1 = scanner.nextInt();
        scanner.nextLine();
        do {
            System.out.println("-------------------Employee Menu-----------------");
            System.out.println("1. Hien thi danh sach nhan vien");
            System.out.println("2. Them moi nhan vien");
            System.out.println("3.Chinh sua thong tin nhan vien");
            System.out.println("4.Xoa nhan vien");
            System.out.println("5.Tim kiem nhan vien");
            System.out.println("6.Sap xep");
            System.out.println("0.Thoat chuong trinh");
            switch (choice1) {
                case 1:

                    break;
                case 2:
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
                    System.out.println("Thoat chuong trinh");
                default:
                    System.err.println("Nhap tu 0-6");
            }
        } while (true);

    }
}
