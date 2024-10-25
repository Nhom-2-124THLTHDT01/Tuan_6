package Bai3;

public class TaiKhoanThanhToan extends TaiKhoan {
    private double phiGiaoDich;

    public TaiKhoanThanhToan(String soTaiKhoan, String chuTaiKhoan, double soDu, String matKhau, double phiGiaoDich) {
        super(soTaiKhoan, chuTaiKhoan, soDu, matKhau);
        this.phiGiaoDich = phiGiaoDich;
    }

    @Override
    public void guiTien(double soTien) {
        if (soTien > 0) {
            super.guiTien(soTien);
        } else {
            System.out.println("So tien gui khong hop le.");
        }
    }

    @Override
    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= (super.soDu - phiGiaoDich)) {
            super.rutTien(soTien + phiGiaoDich); 
        } else {
            System.out.println("So tien rut khong hop le hoac khong du so du.");
        }
    }

    public void thanhToanTienDien(double soTien) {
        if (soTien > 0 && soTien <= (super.soDu - phiGiaoDich)) {
            super.rutTien(soTien + phiGiaoDich); 
            System.out.println("Da thanh toan tien dien: " + soTien + ". Phi giao dich: " + phiGiaoDich);
        } else {
            System.out.println("So tien thanh toan khong hop le hoac khong du so du.");
        }
    }

    public void thanhToanTienNuoc(double soTien) {
        if (soTien > 0 && soTien <= (super.soDu - phiGiaoDich)) {
            super.rutTien(soTien + phiGiaoDich); 
            System.out.println("Da thanh toan tien nuoc: " + soTien + ". Phi giao dich: " + phiGiaoDich);
        } else {
            System.out.println("So tien thanh toan khong hop le hoac khong du so du.");
        }
    }

    public void kiemTraPhiGiaoDich() {
        System.out.println("Phi giao dich: " + phiGiaoDich);
    }
}









