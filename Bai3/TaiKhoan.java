package Bai3;

public class TaiKhoan {
    private String soTaiKhoan;
    private String chuTaiKhoan;
    protected double soDu;
    private String matKhau;


    public TaiKhoan(String soTaiKhoan, String chuTaiKhoan, double soDu, String matKhau) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
        this.matKhau = matKhau;
    }


    public void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Da gui " + soTien + " vao tai khoan. So du hien tai: " + soDu);
        } else {
            System.out.println("So tien gui khong hop le.");
        }
    }


    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Da rut " + soTien + " tu tai khoan. So du hien tai: " + soDu);
        } else {
            System.out.println("So tien rut khong hop le hoac khong du so du.");
        }
    }

  
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
        System.out.println("Chu tai khoan: " + chuTaiKhoan);
        System.out.println("So du: " + soDu);
    }
}


