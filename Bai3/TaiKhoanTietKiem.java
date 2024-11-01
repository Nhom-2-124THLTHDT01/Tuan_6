package Bai3;

public class TaiKhoanTietKiem extends TaiKhoan {
    private double laiSuat;

    public TaiKhoanTietKiem(String soTaiKhoan, ChuTaiKhoan chuTaiKhoan, double soDu, String matKhau, double laiSuat) {
        super(soTaiKhoan, chuTaiKhoan, soDu, matKhau);
        this.laiSuat = laiSuat;
    }

    @Override
    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Da rut " + soTien + " tu tai khoan. So du hien tai: " + soDu);
        } else {
            System.out.println("So tien rut khong hop le hoac khong du so du.");
        }
    }

    @Override
    public void guiTien(double soTien) {
        super.guiTien(soTien);
        double lai = soTien * (laiSuat / 100);
        soDu += lai; 
        System.out.println("Da gui thanh cong " + soTien + " vao tai khoan va lai suat la " + lai + ".So du hien tai: " + soDu);
    }
}

