package main.java.com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class UserService {

    // SECURITY ISSUE: Credentials should be externalized (use environment variables or config files)
    private String password = System.getenv("DB_PASSWORD") != null ? System.getenv("DB_PASSWORD") : "admin123";

    // FIXED: SQL Injection - using PreparedStatement + explicit columns
    public void findUser(String username) throws SQLException {
        String query = "SELECT id, name FROM users WHERE name = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db",
                "root", password);
             PreparedStatement st = conn.prepareStatement(query)) {
            st.setString(1, username);
            st.executeQuery();
        }
    }

    // FIXED: SQL Injection - using PreparedStatement
    public void deleteUser(String username) throws SQLException {
        String query = "DELETE FROM users WHERE name = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db",
                "root", password);
             PreparedStatement st = conn.prepareStatement(query)) {
            st.setString(1, username);
            st.execute();
        }
    }
}
