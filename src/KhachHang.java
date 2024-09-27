public class KhachHang {
    private String tenKhach;
    private String diaChi;
    private String soDienThoai;
    private String maKhachHang;

    public KhachHang(String tenKhach, String diaChi, String soDienThoai, String maKhachHang) {
        this.tenKhach = tenKhach;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.maKhachHang = maKhachHang;
    }

    // Lấy tên khách
    public String layTenKhach() {
        return tenKhach;
    }

    // Lấy thông tin khách
    public void inThongTinKhach() {
        System.out.println("Tên khách: " + tenKhach + ", Địa chỉ: " + diaChi +
                ", Số điện thoại: " + soDienThoai + ", Mã khách hàng: " + maKhachHang);
    }
}
