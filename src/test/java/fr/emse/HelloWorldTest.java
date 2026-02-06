package fr.emse;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloWorldTest {
    @Test
    public void testGetMessage() {
        assertEquals("Hello World from Jenkins Pipeline!", HelloWorld.getMessage());
    }
}
