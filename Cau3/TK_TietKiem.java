package Cau3;
import java.util.Scanner;
public class TK_TietKiem extends TaiKhoan {
    private double laiSuat;

    public TK_TietKiem(String SoTaiKhoan, String ChuTaiKhoan, int SoDu, String MatKhau, double laiSuat) {
        super(SoTaiKhoan, ChuTaiKhoan, SoDu, MatKhau);
        this.laiSuat = laiSuat;
    }

    public void TinhLai() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thang muon gui tiet kiem : ");
        int SoThang = sc.nextInt();
        double tienLai = SoDu * (laiSuat/12) * SoThang;
        System.out.println("So tien nhan duoc sau" + SoThang + " la : " + (tienLai+SoDu) );
    }
}
