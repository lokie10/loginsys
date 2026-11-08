public class Main {
    public static void main(String[] args) {

        DatabaseConnection.initializeDatabase();

        IDandPassword idandPasswords = new IDandPassword();

        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
    }
}
