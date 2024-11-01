package Bai3;

public abstract class TaiKhoan {
    protected String soTaiKhoan;
    protected ChuTaiKhoan chuTaiKhoan;
    protected double soDu;
    private String matKhau;

    public TaiKhoan(String soTaiKhoan, ChuTaiKhoan chuTaiKhoan, double soDu, String matKhau) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
        this.matKhau = matKhau;
    }

    public void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
        } else {
            System.out.println("So tien gui khong hop le.");
        }
    }

    public abstract void rutTien(double soTien);

    public void kiemTraSoDu() {
        System.out.println("So du tai khoan: " + soDu);
    }

    public void doiMatKhau(String matKhauCu, String matKhauMoi) {
        if (this.matKhau.equals(matKhauCu)) {
            this.matKhau = matKhauMoi;
            System.out.println("Doi mat khau thanh cong.");
        } else {
            System.out.println("Mat khau cu khong dung.");
        }
    }

    public void thongTinTaiKhoan() {
        System.out.println("So tai khoan: " + soTaiKhoan);
        System.out.println("Chu tai khoan: " + chuTaiKhoan.getTenChuTaiKhoan());
        System.out.println("So du: " + soDu);
    }
}


