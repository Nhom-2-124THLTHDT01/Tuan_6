package Bai3;

public class TaiKhoanThanhToan extends TaiKhoan {
    private double phiGiaoDich;
    private double hanMucThauChi; 

    public TaiKhoanThanhToan(String soTaiKhoan, ChuTaiKhoan chuTaiKhoan, double soDu, String matKhau, double phiGiaoDich, double hanMucThauChi) {
        super(soTaiKhoan, chuTaiKhoan, soDu, matKhau);
        this.phiGiaoDich = phiGiaoDich;
        this.hanMucThauChi = hanMucThauChi; 
    }
    @Override
    public void guiTien(double soTien) {
        super.guiTien(soTien);
        System.out.println("Da gui thanh cong " + soTien + " vao tai khoan .So du hien tai: " + soDu);
    }
    @Override
    public void rutTien(double soTien) {
        double tongTienRut = soTien + phiGiaoDich; 
        if (soTien > 0 && tongTienRut <= (soDu + hanMucThauChi)) { 
            soDu -= tongTienRut; 
            System.out.println("Da rut " + soTien + " tu tai khoan. Phi giao dich la: " + phiGiaoDich + "So du hien tai: " + soDu );
        } else {
            System.out.println("So tien rut khong hop le hoac khong du so du.");
        }
    }

    public void thanhToanTienDien(double soTien) {
        double tongTienThanhToanTienDien = soTien + phiGiaoDich; 
        if (soTien > 0 && tongTienThanhToanTienDien <= (soDu + hanMucThauChi)) { 
            soDu -= tongTienThanhToanTienDien; 
            System.out.println("Da thanh toan tien dien: " + soTien + ". Phi giao dich: " + phiGiaoDich + "So du hien tai: " + soDu);
        } else {
            System.out.println("So tien thanh toan khong hop le hoac khong du so du.");
        }
    }

    public void thanhToanTienNuoc(double soTien) {
        double tongTienThanhToanTienNuoc = soTien + phiGiaoDich;
        if (soTien > 0 && tongTienThanhToanTienNuoc <= (soDu + hanMucThauChi)) { 
            soDu -= tongTienThanhToanTienNuoc; 
            System.out.println("Da thanh toan tien nuoc: " + soTien + ". Phi giao dich: " + phiGiaoDich + "So du hien tai: " + soDu);
        } else {
            System.out.println("So tien thanh toan khong hop le hoac khong du so du.");
        }
    }

    public void kiemTraPhiGiaoDich() {
        System.out.println("Phi giao dich: " + phiGiaoDich);
    }

    public void kiemTraHanMucThauChi() {
        System.out.println("Han muc thau chi: " + hanMucThauChi);
    }
}





