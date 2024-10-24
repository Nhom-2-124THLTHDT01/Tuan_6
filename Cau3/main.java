package Cau3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        TaiKhoan TK1 = new TaiKhoan("123456", "Nguyen Van A", 1000000, "abc123");
        TK_TietKiem TK_TK = new TK_TietKiem(TK1.SoTaiKhoan, TK1.ChuTaiKhoan, 0, "123", 0.05);
        TK_ThanhToan TK_TT = new TK_ThanhToan(TK1.SoTaiKhoan, TK1.ChuTaiKhoan, TK1.SoDu, "123",TK1.SoDu );
        
        while(true){
            System.out.println("VUI LONG DANG NHAP.");
            if(TK1.DangNhap()== 1){
                System.out.println("DANG NHAP THANH CONG.");
                while(true){
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("CO CAC LUA CHON : ");
                    System.out.println("1.Gui tien.");
                    System.out.println("2.Rut tien.");
                    System.out.println("3.Kiem tra tai khoan.");
                    System.out.println("4.Doi mat khau.");
                    System.out.println("5.Tai khoan tiet kiem.");
                    System.out.println("6.Chuyen khoan.");
                    System.out.println("7.Dang xuat.");
                    System.out.print("Nhap lua chon : ");
                    int luachon = sc.nextInt();
                    
                    switch(luachon){
                        case 1 : 
                            System.out.print("Nhap so tien muon gui : ");
                            int TienGui = sc.nextInt();
                            TK1.GuiTien(TienGui);
                            break;
                        case 2:
                            System.out.print("Nhap so tien muon rut : ");
                            int TienRut = sc.nextInt();
                            TK1.RutTien(TienRut);
                            break;
                        case 3:
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("So tai khoan: " + TK1.SoTaiKhoan);
                            System.out.println("Chu tai khoan: " + TK1.ChuTaiKhoan);
                            System.out.println("So du hien tai: " + TK1.SoDu);
                            break;
                        case 4:
                            TK1.DoiMatKhau();
                            break;
                        case 5:
                            System.out.println("So du hien tai cua tai khoan tiet kiem : ");
                            TK_TK.KiemTraSoDu();
                            TK_TK.TinhLai();
                            break;
                        case 6:
                            System.out.println("Dang nhap tai khoan chuyen tien :");
                            if(TK_TK.DangNhap() == 1){
                                System.out.print("Nhap so tien muon chuyen vao tai khoan tiet kiem : ");
                                int SoTienChuyen = sc.nextInt();
                                TK1.SoDu = TK1.SoDu - SoTienChuyen;
                                TK_TT.ChuyenKhoan(TK_TK, SoTienChuyen);
                            }
                            else
                                System.out.println("CHUYEN TIEN THAT BAI.");
                            break;
                        case 7:
                            System.out.println("THOAT CHUONG TRINH.");
                            return;
                    }
                }
            }
            else
                System.out.println("DANG NHAP THAT BAI.");
        }
    }
}
