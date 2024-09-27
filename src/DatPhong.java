public class DatPhong {
    private String maDat;
    private String ngayDat;
    private boolean trangThai; // true: đã đặt, false: chưa đặt

    public DatPhong(String maDat, String ngayDat, boolean trangThai) {
        this.maDat = maDat;
        this.ngayDat = ngayDat;
        this.trangThai = trangThai;
    }

    // Phương thức đặt phòng
    public void datPhong() {
        this.trangThai = true;
        System.out.println("Phòng đã được đặt.");
    }

    // Phương thức hủy đặt phòng
    public void huyDatPhong() {
        this.trangThai = false;
        System.out.println("Phòng đã được hủy đặt.");
    }
}
