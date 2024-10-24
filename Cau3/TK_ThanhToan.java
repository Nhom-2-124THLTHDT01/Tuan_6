package Cau3;

public class TK_ThanhToan extends TaiKhoan {
    private int HanMucRutTien;

    public TK_ThanhToan(String SoTaiKhoan, String ChuTaiKhoan, int SoDu, String MatKhau, int HanMucRutTien) {
        super(SoTaiKhoan, ChuTaiKhoan, SoDu, MatKhau);
        this.HanMucRutTien = HanMucRutTien;
    }

    public void ChuyenKhoan(TaiKhoan TKNhan, int SoTien) {
        if (SoTien > 0 && SoTien <= SoDu && SoTien <= HanMucRutTien) {
            RutTien(SoTien);
            TKNhan.GuiTien(SoTien);
            System.out.println("Chuyen khoan thanh cong.");
        } 
        else
            System.out.println("SO TIEN CHUYEN KHONG HOP LE.");
    }
}

