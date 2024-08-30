// Chọn gói debug/debugoff để sử dụng bằng cách thay đổi import
import static debug.DebugClass.debug;
// import static debugoff.DebugClass.debug;

public class Main {
    public static void main(String[] args) {
        debug("Đây là thông báo debug.");
    }
}
