package Cau3;
import java.util.Scanner;
public class TaiKhoan {

    protected String SoTaiKhoan;
    protected String ChuTaiKhoan;
    protected int SoDu;
    private String MatKhau;

    public TaiKhoan(String SoTaiKhoan, String ChuTaiKhoan, int SoDu, String MatKhau) {
        this.SoTaiKhoan = SoTaiKhoan;
        this.ChuTaiKhoan = ChuTaiKhoan;
        this.SoDu = SoDu;
        this.MatKhau = MatKhau;
    }
    
    public void DoiMatKhau(){
        System.out.println("---------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mat khau cu : ");
        String MatKhauCu = sc.nextLine();
        if(MatKhau.equals(MatKhauCu)){
            System.out.print("Nhap mat khau moi : ");
            String MatKhauMoi = sc.nextLine();
            MatKhau = MatKhauMoi;
            System.out.println("Doi mat khau thanh cong. Mat khau cua ban la : "+ MatKhau );
        }
        else
            System.out.println("MAT KHAU KHONG CHINH XAC.");
    }
    
    public void GuiTien(int SoTien) {
        System.out.println("---------------------------------------------------------------");
        if (SoTien > 0) {
            SoDu = SoDu + SoTien;
            System.out.println("Gui " + SoTien + " thanh cong. So du hien tai : " + SoDu);
        } else {
            System.out.println("SO TIEN PHAI LON HON  0.");
        }
    }

    public void RutTien(int SoTien) {
        System.out.println("---------------------------------------------------------------");
        if (SoTien > 0 && SoTien <= SoDu) {
            SoDu = SoDu - SoTien;
            System.out.println("Rut " + SoTien + " thanh cong. So du hien tai : " + SoDu);
        } 
        else 
            System.out.println("SO TIEN RUT KHONG HOP LE.");
    }

    public double KiemTraSoDu() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("So du hien tai : " + SoDu);
        return SoDu;
    }
    public int DangNhap(){
        System.out.println("---------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tai khoan : ");
        String SoTaiKhoantt = sc.nextLine();
        if(SoTaiKhoan.equals(SoTaiKhoantt)){
            System.out.print("Nhap mat khau : ");
            String matkhautt = sc.nextLine();
            if(MatKhau.equals(matkhautt))
                return 1;
            else
                return 0 ;
        }
        else
            return 0 ;
    }    
}
