// Create a Singleton DatabaseConnection class with connect() and disconnect() methods to simulate a single database connection.

public class DatabaseConnection {
  private static final DatabaseConnection INSTANCE = new DatabaseConnection();
  private boolean connected = false;

  private DatabaseConnection() {}

  public static DatabaseConnection getInstance() {
      return INSTANCE;
  }

  public void connect() {
      if (!connected) {
          connected = true;
          System.out.println("Connected to the database.");
      } else {
          System.out.println("Already connected to the database.");
      }
  }

  public void disconnect() {
      if (connected) {
          connected = false;
          System.out.println("Disconnected from the database.");
      } else {
          System.out.println("No active database connection to disconnect.");
      }
  }

  public static void main(String[] args) {
      DatabaseConnection db1 = DatabaseConnection.getInstance();
      db1.connect();
      db1.disconnect();
  }
}
