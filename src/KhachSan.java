import java.util.ArrayList;

public class KhachSan {
    private ArrayList<Phong> danhSachPhong;
    private ArrayList<KhachHang> danhSachKhachHang; // Thêm biến này

    public KhachSan() {
        danhSachPhong = new ArrayList<>();
        danhSachKhachHang = new ArrayList<>(); // Khởi tạo danh sách khách hàng
        khoiTaoPhong();
    }

    // Khởi tạo danh sách phòng
    private void khoiTaoPhong() {
        for (int i = 101; i <= 120; i++) {
            danhSachPhong.add(new Phong(String.valueOf(i)));
        }
    }

    // Lấy danh sách phòng
    public ArrayList<Phong> layDanhSachPhong() {
        return danhSachPhong;
    }

    // Tìm phòng theo số phòng
    public Phong timPhong(String soPhong) {
        for (Phong phong : danhSachPhong) {
            if (phong.getSoPhong().equals(soPhong)) {
                return phong;
            }
        }
        return null;
    }

    // Tìm phòng theo mã đặt
    public Phong timPhongTheoMaDat(String maDatPhong) {
        for (Phong phong : danhSachPhong) {
            // Kiểm tra nếu mã đặt phòng khớp và phòng đã được đặt (không còn trống)
            if (phong.getMaDatPhong() != null && phong.getMaDatPhong().equals(maDatPhong) && !phong.isTrangThai()) {
                return phong;
            }
        }
        return null;
    }

    // Thêm phương thức để thêm khách hàng mới
    public void themKhachHang(KhachHang khachHang) {
        danhSachKhachHang.add(khachHang);
    }

    // Thêm phương thức để tìm khách hàng theo mã
    public KhachHang timKhachHang(String maKhachHang) {
        for (KhachHang khachHang : danhSachKhachHang) {
            if (khachHang.getMaKhachHang().equals(maKhachHang)) {
                return khachHang;
            }
        }
        return null;
    }
}
