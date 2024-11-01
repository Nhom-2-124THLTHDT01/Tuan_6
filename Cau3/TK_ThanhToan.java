package TK_Ngan_Hang;

public class TK_ThanhToan extends TaiKhoan {
    private int HanMucRutTien;

    public TK_ThanhToan(String SoTaiKhoan, String ChuTaiKhoan, int SoDu, String MatKhau, int HanMucRutTien) {
        super(SoTaiKhoan, ChuTaiKhoan, SoDu, MatKhau);
        this.HanMucRutTien = HanMucRutTien ;
    }


    public void ChuyenKhoan(TaiKhoan TKNhan, int SoTien) {
        if (SoTien > 0 && SoTien <= SoDu + HanMucRutTien) {            
            TKNhan.GuiTien(SoTien);
            SoDu = SoDu - SoTien ;
            System.out.println("Chuyen khoan thanh cong.");
        } 
        else
            System.out.println("SO TIEN CHUYEN KHONG HOP LE.");
    }

    @Override
    public void RutTien(int soTien) {
        if (soTien > 0 && soTien <= SoDu + HanMucRutTien) {
            SoDu = SoDu - soTien;
            System.out.println("Rut tien thanh cong. So du hien tai : " + SoDu + "VND");
        } 
         else
            System.out.println("So tien rut vuot qua han muc thau chi.");
    }
}

