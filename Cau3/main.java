package Cau3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaiKhoan TK = new TaiKhoan();
        
        TK.NHAPThongTin();

        int luaChon;
        do {
            System.out.println("Chon lua chon : ");
            System.out.println("1. Gui tien.");
            System.out.println("2. Rut tien.");
            System.out.println("3. Kiem tra so du");
            System.out.println("4. Thoat");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    System.out.print("Nhap so tien muon gui : ");
                    double soTienGui = scanner.nextDouble();
                    TK.GuiTien(soTienGui);
                    break;
                case 2:
                    System.out.print("Nhap so tien muon rut : ");
                    double soTienRut = scanner.nextDouble();
                    TK.rutTien(soTienRut);
                    break;
                case 3:
                    TK.kiemTraSoDu();
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le! Vui long chon lai.");
            }
        } while (luaChon != 4);
    }
}
