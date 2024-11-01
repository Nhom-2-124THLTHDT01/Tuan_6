package TK_Ngan_Hang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<TK_ThanhToan> DSTK_TT = new ArrayList<>();
        DSTK_TT.add(new TK_ThanhToan("123", "Nguyen Van A", 1000000, "a123", 5000000));
        DSTK_TT.add(new TK_ThanhToan("456", "Nguyen Van B", 2000000, "a456", 5000000));
        DSTK_TT.add(new TK_ThanhToan("789", "Nguyen Van C", 3000000, "a789", 5000000));
        
        List<TK_TietKiem> DSTK_TK = new ArrayList<>();
        DSTK_TK.add(new TK_TietKiem("123", "Nguyen Van A", 0, "b123", 0.05));
        DSTK_TK.add(new TK_TietKiem("456", "Nguyen Van B", 0, "b456", 0.05));

        while (true) {
            boolean dangNhapThanhCong = false;
            System.out.println("---------------------------------------------------------------");
            System.out.println("VUI LONG DANG NHAP.");
            System.out.print("Nhap so tai khoan: ");
            String SoTaiKhoan = sc.next();
            System.out.print("Nhap mat khau: ");
            String matKhau = sc.next();
            
            for (TK_ThanhToan TKTT : DSTK_TT) {
                if (TKTT.KiemTraTaiKhoan(SoTaiKhoan, matKhau)) {
                    dangNhapThanhCong = true;
                    System.out.println("DANG NHAP THANH CONG.");
                    boolean quayLaiMenuChinh = true;
                    while (quayLaiMenuChinh) {
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("CO CAC LUA CHON : ");
                        System.out.println("1. Tai khoan thanh toan.");
                        System.out.println("2. Tai khoan tiet kiem.");
                        System.out.println("3. Dang xuat.");
                        System.out.print("Nhap lua chon: ");
                        int luachontaikhoan = sc.nextInt();

                        switch (luachontaikhoan) {
                            case 1:
                                boolean quayLaiTT = true;
                                while (quayLaiTT) {
                                    System.out.println("---------------------------------------------------------------");
                                    System.out.println("CO CAC LUA CHON : ");
                                    System.out.println("1. Gui tien.");
                                    System.out.println("2. Rut tien.");
                                    System.out.println("3. Kiem tra tai khoan.");
                                    System.out.println("4. Doi mat khau.");
                                    System.out.println("5. Chuyen khoan.");
                                    System.out.println("6. Thoat.");
                                    System.out.print("Nhap lua chon : ");
                                    int luachon = sc.nextInt();

                                    switch (luachon) {
                                        case 1:
                                            System.out.print("Nhap so tien muon gui : ");
                                            int TienGui = sc.nextInt();
                                            TKTT.GuiTien(TienGui);
                                            break;
                                        case 2:
                                            System.out.print("Nhap so tien muon rut : ");
                                            int TienRut = sc.nextInt();
                                            if (TKTT.DangNhap() == 1)
                                                TKTT.RutTien(TienRut);
                                            break;
                                        case 3:
                                            TKTT.KiemTraTaiKhoan();
                                            break;
                                        case 4:
                                            TKTT.DoiMatKhau();
                                            break;
                                        case 5:                                                                                   
                                            System.out.print("Nhap so tai khoan muon chuyen:");
                                            String TaiKhoanChuyenTien = sc.next();
                                            boolean KtrTkNhan = true;
                                            for(TK_ThanhToan TKNhan : DSTK_TT){
                                                if(TKNhan.SoTaiKhoan.equals(TaiKhoanChuyenTien)){
                                                    KtrTkNhan = false;
                                                    System.out.print("Nhap so tien muon chuyen:");                                                   
                                                    int SoTienChuyen = sc.nextInt();
                                                    System.out.println("XAC THUC DANH TINH.");
                                                    if (TKTT.DangNhap() == 1)
                                                        TKTT.ChuyenKhoan(TKNhan, SoTienChuyen);                                      
                                                    else
                                                        System.out.println("CHUYEN TIEN THAT BAI.");
                                                    break;
                                                }
                                            }
                                            if(KtrTkNhan)
                                                    System.out.println("Tai khoan khong ton tai.");
                                            break;                                           
                                        case 6:
                                            quayLaiTT = false;
                                            break;
                                        default:
                                            System.out.println("Lua chon khong hop le. Vui long thu lai.");
                                    }
                                }
                                break;

                            case 2:
                                for(TK_TietKiem TKTK : DSTK_TK){
                                    System.out.print("Nhap mat khau tai khoan tiet kiem: ");
                                    String matKhau1 = sc.next();
                                    if (TKTK.KiemTraTaiKhoan(SoTaiKhoan, matKhau1)) {

                                        boolean quayLaiTK = true;
                                        while (quayLaiTK) {
                                            TKTK.LaiHienTai();
                                            System.out.println("---------------------------------------------------------------");
                                            System.out.println("CO CAC LUA CHON : ");
                                            System.out.println("1. Gui tien.");
                                            System.out.println("2. Rut tien.");
                                            System.out.println("3. Kiem tra tai khoan.");
                                            System.out.println("4. Doi mat khau.");
                                            System.out.println("5. Kiem tra tien lai.");
                                            System.out.println("6. Thoat.");
                                            System.out.print("Nhap lua chon : ");
                                            int luachon = sc.nextInt();

                                            switch (luachon) {
                                                case 1:
                                                    System.out.print("Nhap so tien muon gui : ");
                                                    int TienGui = sc.nextInt();
                                                    TKTK.GuiTien(TienGui);
                                                    break;
                                                case 2:
                                                    System.out.print("Nhap so tien muon rut : ");
                                                    int TienRut = sc.nextInt();
                                                    if (TKTT.DangNhap() == 1)
                                                        TKTK.RutTien(TienRut);
                                                    break;
                                                case 3:
                                                    TKTK.KiemTraTaiKhoan();
                                                    break;
                                                case 4:
                                                    TKTK.DoiMatKhau();
                                                    break;
                                                case 5:
                                                    TKTK.TinhLai();                                                  
                                                    break;
                                                case 6:
                                                    quayLaiTK = false;
                                                    break;
                                                default:
                                                    System.out.println("Lua chon khong hop le. Vui long thu lai.");
                                            }
                                        }
                                        break;
                                    }
                                    else{
                                        System.out.println("DANG NHAP THAT BAI");
                                        break;
                                    }
                                }
                                break;

                            case 3:
                                System.out.println("Dang xuat thanh cong.");
                                quayLaiMenuChinh = false;
                                break;

                            default:
                                System.out.println("Lua chon khong hop le. Vui long thu lai.");
                        }
                    }
                }    
            }
            if (!dangNhapThanhCong)
                System.out.println("DANG NHAP THAT BAI."); 
        }
    }
}
