package Ex2;
public class Ex2p1 {
    public static void main(String[] args) {
        Cycle[] cycles = { new Unicycle(), new Bicycle(), new Tricycle() };
        for(Cycle c:cycles){
            // c.balance();  Lỗi phương thức balance() không tồn tại trong Cycle
            c.ride();
        }
         ((Unicycle) cycles[0]).balance(); // Hoạt động
        ((Bicycle) cycles[1]).balance();  // Hoạt động
        // ((Tricycle) cycles[2]).balance(); // Lỗi vì Tricycle không có phương thức balance()
    }
}
