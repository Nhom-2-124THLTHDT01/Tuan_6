package Bai3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập thông tin tài khoản
        System.out.print("Nhập số tài khoản: ");
        String soTaiKhoan = scanner.nextLine();
        
        System.out.print("Nhập chủ tài khoản: ");
        String chuTaiKhoan = scanner.nextLine();
        
        System.out.print("Nhập số dư ban đầu: ");
        double soDu = scanner.nextDouble();
        
        System.out.print("Nhập mật khẩu: ");
        String matKhau = scanner.next();

        // Tạo đối tượng tài khoản
        TaiKhoan taiKhoan = new TaiKhoan(soTaiKhoan, chuTaiKhoan, soDu, matKhau);

        // Ghi thông tin tài khoản
        taiKhoan.thongTinTaiKhoan();

        // Thực hiện các thao tác với tài khoản
        while (true) {
            System.out.println("\nChọn thao tác: ");
            System.out.println("1. Gửi tiền");
            System.out.println("2. Rút tiền");
            System.out.println("3. Kiểm tra số dư");
            System.out.println("4. Đổi mật khẩu");
            System.out.println("5. Thoát");

            int luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.print("Nhập số tiền gửi: ");
                    double soTienGui = scanner.nextDouble();
                    taiKhoan.guiTien(soTienGui);
                    break;
                case 2:
                    System.out.print("Nhập số tiền rút: ");
                    double soTienRut = scanner.nextDouble();
                    taiKhoan.rutTien(soTienRut);
                    break;
                case 3:
                    taiKhoan.kiemTraSoDu();
                    break;
                case 4:
                    System.out.print("Nhập mật khẩu cũ: ");
                    String matKhauCu = scanner.next();
                    System.out.print("Nhập mật khẩu mới: ");
                    String matKhauMoi = scanner.next();
                    taiKhoan.doiMatKhau(matKhauCu, matKhauMoi);
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}