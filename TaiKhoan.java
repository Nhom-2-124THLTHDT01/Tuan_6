package Bai3;

public class TaiKhoan {
    private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;
    private String matKhau;

    // Constructor
    public TaiKhoan(String soTaiKhoan, String chuTaiKhoan, double soDu, String matKhau) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
        this.matKhau = matKhau;
    }

    // Phương thức gửi tiền
    public void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Đã gửi " + soTien + " vào tài khoản. Số dư hiện tại: " + soDu);
        } else {
            System.out.println("Số tiền gửi không hợp lệ.");
        }
    }

    // Phương thức rút tiền
    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Đã rút " + soTien + " từ tài khoản. Số dư hiện tại: " + soDu);
        } else {
            System.out.println("Số tiền rút không hợp lệ hoặc không đủ số dư.");
        }
    }

    // Phương thức kiểm tra số dư
    public void kiemTraSoDu() {
        System.out.println("Số dư tài khoản: " + soDu);
    }

    // Phương thức đổi mật khẩu
    public void doiMatKhau(String matKhauCu, String matKhauMoi) {
        if (this.matKhau.equals(matKhauCu)) {
            this.matKhau = matKhauMoi;
            System.out.println("Đổi mật khẩu thành công.");
        } else {
            System.out.println("Mật khẩu cũ không đúng.");
        }
    }

    // Phương thức lấy thông tin tài khoản
    public void thongTinTaiKhoan() {
        System.out.println("Số tài khoản: " + soTaiKhoan);
        System.out.println("Chủ tài khoản: " + chuTaiKhoan);
        System.out.println("Số dư: " + soDu);
    }
}