public class DatPhong {
    private String maDat;
    private boolean trangThai;

    public DatPhong(String maDat, String ngayDat, boolean trangThai) {
        this.maDat = maDat;
        this.trangThai = trangThai;
    }

    public String getMaDat() {
        return maDat;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
}
