public class KhachHang {
    private String maKhachHang; // Thêm mã khách hàng
    private String tenKhach;
    private String diaChi;
    private String soDienThoai;

    public KhachHang(String tenKhach, String diaChi, String soDienThoai) {
        this.maKhachHang = java.util.UUID.randomUUID().toString(); // Tạo mã khách hàng ngẫu nhiên
        this.tenKhach = tenKhach;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public String getThongTinKhachHang() {
        return "Tên khách hàng: " + tenKhach + "\n" +
               "Địa chỉ: " + diaChi + "\n" +
               "Số điện thoại: " + soDienThoai;
    }
}
