public class Phong {
    private int soPhong;
    private boolean trangThai; // true: phòng trống, false: phòng đã đặt

    public Phong(int soPhong, boolean trangThai) {
        this.soPhong = soPhong;
        this.trangThai = trangThai;
    }

    // Phương thức kiểm tra phòng có trống không
    public boolean kiemTraPhongTrong() {
        return trangThai;
    }

    // Phương thức đặt lại trạng thái phòng
    public void datLaiTrangThaiPhong(boolean trangThai) {
        this.trangThai = trangThai;
    }

    // Lấy số phòng
    public int laySoPhong() {
        return soPhong;
    }

    // In thông tin phòng
    public void inThongTinPhong() {
        String tinhTrang = trangThai ? "Phòng trống" : "Phòng đã đặt";
        System.out.println("Số phòng: " + soPhong + ", Tình trạng: " + tinhTrang);
    }
}
