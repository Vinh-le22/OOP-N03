package widgets;

import access.Access; // Nhập lớp từ package access

public class Widget {
    public void showAccessData() {
        Access access = new Access();
        System.out.println("Truy cập dữ liệu từ lớp Access:");
        System.out.println("Public Data: " + access.publicData);
        // Các trường protected, package-private, và private không thể được truy cập từ đây
        // System.out.println("Protected Data: " + access.protectedData); // Lỗi
        // System.out.println("Package Data: " + access.packageData); // Lỗi biên
        // System.out.println("Private Data: " + access.privateData); // Lỗi biên
    }

    public static void main(String[] args) {
        Widget widget = new Widget();
        widget.showAccessData();
    }
}

