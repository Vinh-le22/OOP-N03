import net.mindview.simple.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Vector mà không chỉ định gói cụ thể
        // Vector v = new Vector();  // Sẽ gây lỗi xung đột

        // Sử dụng cách đầy đủ để chỉ định lớp Vector từ java.util
        java.util.Vector v1 = new java.util.Vector();
        System.out.println("Tạo đối tượng java.util.Vector thành công.");

        // Sử dụng cách đầy đủ để chỉ định lớp Vector từ net.mindview.simple
        net.mindview.simple.Vector v2 = new net.mindview.simple.Vector();
        System.out.println("Tạo đối tượng net.mindview.simple.Vector thành công.");
    }
}



