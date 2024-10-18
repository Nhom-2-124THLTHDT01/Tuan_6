package Bai2;

public class Bai2 {
    public static void main(String[] args) {
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        dssv.nhapDanhSach();

        System.out.println("Danh sách sinh viên:");
        dssv.inDanhSach();

        dssv.sapXepTheoDiem();
        System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm trung bình:");
        dssv.inDanhSach();
    }
}


