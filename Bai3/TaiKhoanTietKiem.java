package Bai3;

public class TaiKhoanTietKiem extends TaiKhoan {
    private double laiSuat;

    public TaiKhoanTietKiem(String soTaiKhoan, String chuTaiKhoan, double soDu, String matKhau, double laiSuat) {
        super(soTaiKhoan, chuTaiKhoan, soDu, matKhau);
        this.laiSuat = laiSuat;
    }

    @Override
    public void guiTien(double soTien) {
        super.guiTien(soTien);
        double lai = soTien * (laiSuat / 100);
        soDu += lai; 
        System.out.println("Da tinh lai " + lai + " cho so tien gui. So du hien tai: " + soDu);
    }

    public void kiemTraLaiSuat() {
        System.out.println("Lai suat: " + laiSuat + "%");
    }

    public void kiemTraSoDu() {
        super.kiemTraSoDu();
        System.out.println("Lai suat: " + laiSuat + "%");
    }
}




