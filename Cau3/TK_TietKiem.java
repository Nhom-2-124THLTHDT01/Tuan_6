package Cau3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TK_TietKiem extends TaiKhoan {
    private double laiSuat;
    private LocalDate ngayBatDau;

    public TK_TietKiem(String SoTaiKhoan, String ChuTaiKhoan, int SoDu, String MatKhau, double laiSuat) {
        super(SoTaiKhoan, ChuTaiKhoan, SoDu, MatKhau);
        this.laiSuat = laiSuat;
        this.ngayBatDau = LocalDate.now();
    }
  
    public void setNgayBatDau(LocalDate ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }
    
    public void LaiHienTai() {
        long soNgayDaGui = ChronoUnit.DAYS.between(ngayBatDau, LocalDate.now());
        double laiHangNgay = (laiSuat / 365) * SoDu;
        SoDu += laiHangNgay * soNgayDaGui;
    }

    public void TinhLai() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thang DU KIEN gui tiet kiem : ");
        int SoThang = sc.nextInt();
        double tienLai = SoDu * (laiSuat / 12) * SoThang;
        System.out.println("So tien lai nhan duoc sau " + SoThang + " thang la : " + tienLai + "VND");
    }

    @Override
    public void RutTien(int soTien) {
        if (soTien > 0 && soTien <= SoDu) {
            SoDu = SoDu - soTien;
            System.out.println("Rut tien thanh cong. So du hien tai : " + SoDu + "VND");
        } else {
            System.out.println("SO TIEN RUT KHONG HOP LE.");
        }
    }
}
