package main.java.com.example;

import java.sql.SQLException;
import java.util.logging.Logger;

public class App {
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        LOGGER.info(String.valueOf(calc.calculate(10, 5, "add-again")));
        
        UserService service = new UserService();
        try {
            service.findUser("admin");
            service.deleteUser("admin");
        } catch (SQLException e) {
            LOGGER.severe("Database error: " + e.getMessage());
        }
    }
}

