package connections;

public class ConnectionManager {
    private static final int SIZE = 5;
    private static Connection[] connections = new Connection[SIZE];
    private static int index = 0;

    static {
        for (int i = 0; i < SIZE; i++) {
            connections[i] = new Connection();
        }
    }

    // Phương thức tĩnh để lấy Connection
    public static Connection getConnection() {
        if (index < SIZE) {
            return connections[index++];
        } else {
            return null;
        }
    }
}

