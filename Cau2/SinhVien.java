package Cau2;

import java.util.Scanner;

public class SinhVien {
    public String msv;
    public String ten;
    public String ngaysinh;
    public double dtb;
    
    public  void NHAP() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        msv = sc.nextLine();
        System.out.print("Nhap ten sinh vien : ");
        ten = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaysinh = sc.nextLine();
        System.out.print("Nhap diem trung binh : ");
        dtb = sc.nextDouble();
    }

    public  void XUAT() {
            System.out.println("Ma SV: " + msv + ", Ten: " + ten + ", Ngay sinh: " + ngaysinh + ", Điem TB: " + dtb);
    }
    
}
