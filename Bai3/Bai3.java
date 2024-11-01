package Bai3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ChuTaiKhoan chuTaiKhoan = new ChuTaiKhoan("Pham Minh Chinh");


        TaiKhoanTietKiem tkTK = new TaiKhoanTietKiem("001", chuTaiKhoan, 1000000, "123456", 10);


        TaiKhoanThanhToan tkTT = new TaiKhoanThanhToan("002", chuTaiKhoan, 2000000, "654321", 10000, 500000);


        System.out.print("Chon loai tai khoan (1. Tiet Kiem, 2. Thanh Toan): ");
        int loaiTaiKhoan = scanner.nextInt();
        scanner.nextLine(); 

        TaiKhoan taiKhoan = (loaiTaiKhoan == 1) ? tkTK : tkTT;


        taiKhoan.thongTinTaiKhoan();

        while (true) {
            System.out.println("\nChon thao tac: ");
            System.out.println("1. Gui tien");
            System.out.println("2. Rut tien");
            System.out.println("3. Kiem tra so du");
            System.out.println("4. Doi mat khau");
            System.out.println("5. Thanh toan tien dien");
            System.out.println("6. Thanh toan tien nuoc");
            System.out.println("7. Thoat");

            int luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.print("Nhap so tien gui: ");
                    double soTienGui = scanner.nextDouble();
                    taiKhoan.guiTien(soTienGui);
                    break;
                case 2:
                    System.out.print("Nhap so tien rut: ");
                    double soTienRut = scanner.nextDouble();
                    taiKhoan.rutTien(soTienRut);
                    break;
                case 3:
                    taiKhoan.kiemTraSoDu();
                    break;
                case 4:
                    System.out.print("Nhap mat khau cu: ");
                    String matKhauCu = scanner.next();
                    System.out.print("Nhap mat khau moi: ");
                    String matKhauMoi = scanner.next();
                    taiKhoan.doiMatKhau(matKhauCu, matKhauMoi);
                    break;
                case 5:
                    if (taiKhoan instanceof TaiKhoanThanhToan) {
                        System.out.print("Nhap so tien thanh toan tien dien: ");
                        double soTienDien = scanner.nextDouble();
                        ((TaiKhoanThanhToan) taiKhoan).thanhToanTienDien(soTienDien);
                    } else {
                        System.out.println("Tai khoan khong phai la tai khoan thanh toan.");
                    }
                    break;
                case 6:
                    if (taiKhoan instanceof TaiKhoanThanhToan) {
                        System.out.print("Nhap so tien thanh toan tien nuoc: ");
                        double soTienNuoc = scanner.nextDouble();
                        ((TaiKhoanThanhToan) taiKhoan).thanhToanTienNuoc(soTienNuoc);
                    } else {
                        System.out.println("Tai khoan khong phai la tai khoan thanh toan.");
                    }
                    break;
                case 7:
                    System.out.println("Thoat chuong trinh.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        }
    }
}



