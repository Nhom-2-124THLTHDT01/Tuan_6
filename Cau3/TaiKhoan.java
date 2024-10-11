package Cau3;


import java.util.Scanner;

public class TaiKhoan {
    public  String soTK;
    public String chuTK;
    public double soDu;

    public  void NHAPThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tai khoan : ");
        soTK = sc.nextLine();
        System.out.print("Nhap ten chu tai lhoan : ");
        chuTK = sc.nextLine();
        System.out.print("Nhap so du ban dau : ");
        soDu = sc.nextDouble();
    }

    public  void GuiTien(double SoTien) {
        if (SoTien > 0) {
            soDu = soDu + SoTien;
            System.out.printf("Gui %.2f thanh cong. So du hien tai: %.2f%n", SoTien,soDu);
        } else {
            System.out.println("So tien phai lon hon  0.");
        }
    }

    public  void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu = soDu - soTien;
            System.out.printf("Rut %.2f thanh cong. So du hien tai: %.2f%n", soTien,soDu);
        } else if (soTien > soDu) {
            System.out.println("So du khong du de rit tien.");
        } else {
            System.out.println("So tien rut phai lon hon 0.");
        }
    }

    public void kiemTraSoDu(){
        System.out.printf("So du hien tai cua tai khoan %s: %.2f%n", soTK, soDu);
    }
}
