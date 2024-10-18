package Bai2;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class SinhVien {
    private String maSinhVien;
    private String ten;
    private Date ngaySinh;
    private double diemTrungBinh;

    // Constructor
    public SinhVien(String maSinhVien, String ten, Date ngaySinh, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    // Phương thức nhập thông tin
    public static SinhVien nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        String maSinhVien = scanner.nextLine();
        
        System.out.print("Nhập tên: ");
        String ten = scanner.nextLine();

        System.out.print("Nhập ngày sinh (yyyy-MM-dd): ");
        String ngaySinhStr = scanner.nextLine();
        Date ngaySinh = null;
        try {
            ngaySinh = new SimpleDateFormat("yyyy-MM-dd").parse(ngaySinhStr);
        } catch (ParseException e) {
            System.out.println("Ngày sinh không hợp lệ. Vui lòng nhập lại.");
            return null; // Trả về null nếu ngày sinh không hợp lệ
        }

        System.out.print("Nhập điểm trung bình: ");
        double diemTrungBinh = scanner.nextDouble();

        return new SinhVien(maSinhVien, ten, ngaySinh, diemTrungBinh);
    }

    // Phương thức in thông tin
    public void inThongTin() {
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Tên: " + ten);
        System.out.println("Ngày sinh: " + new SimpleDateFormat("yyyy-MM-dd").format(ngaySinh));
        System.out.println("Điểm trung bình: " + diemTrungBinh);
    }

    // Getter để lấy điểm trung bình
    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }
}


