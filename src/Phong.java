import java.time.LocalDate;

public class Phong {
    private String soPhong;
    private boolean trangThai; // true = trống, false = đã đặt
    private KhachHang khachHang;
    private LocalDate ngayDat;
    private String maDatPhong;
    private String maDatMacDinh;

    public Phong(String soPhong) {
        this.soPhong = soPhong;
        this.trangThai = true;
        this.maDatMacDinh = String.format("%03d", Integer.parseInt(soPhong) - 100);
    }

    // Getters
    public String getSoPhong() {
        return soPhong;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public LocalDate getNgayDat() {
        return ngayDat;
    }

    public String getMaDatPhong() {
        return maDatPhong;
    }

    public String getMaDatMacDinh() {
        return maDatMacDinh;
    }

    // Cập nhật phương thức đặt phòng
    public String datPhong(String tenKhachHang, String soDienThoai, String diaChi, LocalDate ngayDat) {
        if (this.trangThai) {
            this.trangThai = false;
            this.khachHang = new KhachHang(tenKhachHang, diaChi, soDienThoai);
            this.ngayDat = ngayDat;
            this.maDatPhong = this.maDatMacDinh;
            return this.maDatPhong;
        }
        return null;
    }

    // Cập nhật phương thức hủy đặt phòng
    public void huyDatPhong() {
        this.trangThai = true;
        this.khachHang = null;
        this.ngayDat = null;
        this.maDatPhong = null; // Đặt lại mã đặt phòng thành null khi hủy
    }

    public void setMaDatPhong(String maDatPhong) {
        this.maDatPhong = maDatPhong;
    }
}
