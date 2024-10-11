package Cau2;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien : ");
        int n = sc.nextInt();
        SinhVien[] dssv = new SinhVien[n];

        for(int i=0;i<n;i++){
            System.out.println(" - Nhap thong tin cua sinh vien thu " + (i+1) + " : ");
            dssv[i] = new SinhVien();
            dssv[i].NHAP();
        }
        
        for (int i = 0; i < n - 1; i++) {
            if (dssv[i].dtb < dssv[i + 1].dtb) {
                SinhVien x = dssv[i];
                dssv[i] = dssv[i + 1];
                dssv[i + 1] = x;
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(" - Thong tin cua sinh vien thu "+(i+1)+" : ");
            dssv[i].XUAT();
        }   

    }
}
