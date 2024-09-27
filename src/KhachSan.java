import java.util.ArrayList;
import java.util.List;

public class KhachSan {
    private List<Phong> danhSachPhong;
    private List<KhachHang> danhSachKhach;

    public KhachSan() {
        danhSachPhong = new ArrayList<>();
        danhSachKhach = new ArrayList<>();
    }

    // Thêm phòng vào danh sách
    public void themPhong(Phong phong) {
        danhSachPhong.add(phong);
    }

    // Lấy danh sách phòng
    public List<Phong> layDanhSachPhong() {
        return danhSachPhong;
    }

    // Đặt phòng cho khách
    public void datPhongChoKhach(int soPhong, KhachHang khachHang) {
        for (Phong phong : danhSachPhong) {
            if (phong.laySoPhong() == soPhong && phong.kiemTraPhongTrong()) {
                phong.datLaiTrangThaiPhong(false); // Cập nhật phòng thành đã đặt
                danhSachKhach.add(khachHang); // Thêm khách vào danh sách
                System.out.println("Phòng " + soPhong + " đã được đặt cho " + khachHang.layTenKhach());
                return;
            }
        }
        System.out.println("Phòng " + soPhong + " không thể đặt.");
    }

    // Hiển thị thông tin khách hàng trong phòng
    public void hienThongTinKhach(int soPhong) {
        for (Phong phong : danhSachPhong) {
            if (phong.laySoPhong() == soPhong && !phong.kiemTraPhongTrong()) {
                System.out.println("Thông tin khách hàng trong phòng " + soPhong + ": ");
                // Ở đây có thể lấy thông tin khách từ danh sách khách nếu liên kết
                return;
            }
        }
        System.out.println("Phòng " + soPhong + " hiện đang trống.");
    }
}
