package main.java.com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAppMainDoesNotCrash() {
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}