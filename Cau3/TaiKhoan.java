package Cau3;
import java.util.Scanner;
public abstract class TaiKhoan {

    protected String SoTaiKhoan;
    protected String ChuTaiKhoan;
    protected int SoDu;
    protected String MatKhau;
    
    public TaiKhoan(String SoTaiKhoan, String ChuTaiKhoan, int SoDu, String MatKhau) {
        this.SoTaiKhoan = SoTaiKhoan;
        this.ChuTaiKhoan = ChuTaiKhoan;
        this.SoDu = SoDu;
        this.MatKhau = MatKhau;
    }

    public TaiKhoan() {
    }
    
    public void DoiMatKhau(){
        System.out.println("---------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mat khau cu : ");
        String MatKhauCu = sc.nextLine();
        if(this.MatKhau.equals(MatKhauCu)){
            System.out.print("Nhap mat khau moi : ");
            String MatKhauMoi = sc.nextLine();
            this.MatKhau = MatKhauMoi;
            System.out.println("Doi mat khau thanh cong. Mat khau cua ban la : "+ this.MatKhau );
        }
        else
            System.out.println("MAT KHAU KHONG CHINH XAC.");
    }
    
    public void GuiTien(int SoTien) {
        System.out.println("---------------------------------------------------------------");
        if (SoTien > 0) {
            this.SoDu = this.SoDu + SoTien;
            System.out.println("Gui " + SoTien + "VND thanh cong");
        } else {
            System.out.println("SO TIEN PHAI LON HON  0.");
        }
    }
    
    public void KiemTraTaiKhoan() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("So tai khoan : " + this.SoTaiKhoan);
        System.out.println("Chu tai khoan : " + this.ChuTaiKhoan);
        System.out.println("So du hien tai : " + this.SoDu + "VND");
        
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
    public boolean KiemTraTaiKhoan(String maTaiKhoan, String matKhau) {
        return this.SoTaiKhoan.equals(maTaiKhoan) && this.MatKhau.equals(matKhau);
    }
    public abstract void RutTien(int soTien);
}
