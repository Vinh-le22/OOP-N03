package connections;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Connection conn = ConnectionManager.getConnection();
            if (conn != null) {
                conn.connect();
            } else {
                System.out.println("Ngắt kết nối!");
            }
        }
    }
}

