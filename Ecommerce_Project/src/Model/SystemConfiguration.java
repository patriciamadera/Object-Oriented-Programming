package Model;


public class SystemConfiguration {
    private static SystemConfiguration instance;

    private String databaseUrl;
    private String uiTheme;

    // Constructor privado
    private SystemConfiguration() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/ecommerce";
        this.uiTheme = "light";
    }

    // Método estático para obtener la única instancia
    public static SystemConfiguration getInstance() {
        if (instance == null) {
            instance = new SystemConfiguration();
        }
        return instance;
    }

    // Getters y Setters
    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public String getUiTheme() {
        return uiTheme;
    }

    public void setUiTheme(String uiTheme) {
        this.uiTheme = uiTheme;
    }
}
