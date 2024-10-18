package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien() {
        danhSach = new ArrayList<>();
    }

    // Phương thức nhập danh sách sinh viên
    public void nhapDanhSach() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            SinhVien sv = SinhVien.nhapThongTin();
            if (sv != null) {
                danhSach.add(sv);
            }
        }
    }

    // Phương thức in danh sách sinh viên
    public void inDanhSach() {
        for (SinhVien sv : danhSach) {
            sv.inThongTin();
            System.out.println();
        }
    }

    // Phương thức sắp xếp danh sách theo điểm trung bình giảm dần
    public void sapXepTheoDiem() {
        Collections.sort(danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.compare(sv2.getDiemTrungBinh(), sv1.getDiemTrungBinh()); // Giảm dần
            }
        });
    }
}


