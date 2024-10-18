import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// Tạo lớp SinhVien
class SinhVien {
    // Các thuộc tính của sinh viên
    private String maSinhVien;
    private String ten;
    private String ngaySinh;
    private double diemTrungBinh;

    // Constructor để khởi tạo đối tượng SinhVien
    public SinhVien(String maSinhVien, String ten, String ngaySinh, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    // Phương thức nhập thông tin sinh viên
    public void nhapThongTin(Scanner scanner) {
        System.out.print("Nhập mã sinh viên: ");
        maSinhVien = scanner.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        ten = scanner.nextLine();
        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        ngaySinh = scanner.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        diemTrungBinh = scanner.nextDouble();
        scanner.nextLine();  // Đọc bỏ dòng thừa
    }

    // Phương thức in thông tin sinh viên
    public void inThongTin() {
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Tên: " + ten);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
    }

    // Getter cho thuộc tính điểm trung bình
    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }
}

// Lớp chính chứa hàm main để chạy chương trình
public class Bai2 {
    public static void main(String[] args) {
        // Danh sách sinh viên
        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số lượng sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine();  // Đọc bỏ dòng thừa
        
        // Nhập thông tin sinh viên
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ": ");
            SinhVien sv = new SinhVien("", "", "", 0);
            sv.nhapThongTin(scanner);
            danhSachSinhVien.add(sv);
        }
        
        // Sắp xếp danh sách sinh viên theo điểm trung bình giảm dần
        Collections.sort(danhSachSinhVien, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.compare(sv2.getDiemTrungBinh(), sv1.getDiemTrungBinh());
            }
        });
        
        // In danh sách sinh viên sau khi sắp xếp
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm trung bình giảm dần:");
        for (SinhVien sv : danhSachSinhVien) {
            sv.inThongTin();
            System.out.println();
        }
        
        scanner.close();
    }
}
