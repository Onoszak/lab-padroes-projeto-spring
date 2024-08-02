
package one.digitalinnovation.gof.singleton;

public class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection() {
        // Conexão com o banco de dados
    }

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
