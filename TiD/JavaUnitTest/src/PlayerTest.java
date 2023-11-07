
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    private Player player;

    @BeforeEach
    public void setUp() {
        player = new Player(true, "HeniekLach", 2000);
    }

    @Test
    public void testCreatePlayer() {
        assertEquals("HeniekLach", player.getName());
        assertEquals(Integer.valueOf(2000), player.getBornYear());
        assertTrue(player.getAgree());
    }

    @Test
    public void testSetName() {
        player.setName("Ala");
        assertEquals("Ala", player.getName());
    }

    @Test
    public void testSetBornYear() {
        player.setBornYear(20032);
        assertEquals(Integer.valueOf(2002), player.getBornYear());
    }

    @Test
    public void testInvalidName() {
        assertThrows(IllegalArgumentException.class, () -> player.setName("Invalid@Name"));
    }

    @Test
    public void testUnderagePlayer() {
        assertThrows(IllegalArgumentException.class, () -> player.setBornYear(2023));
    }
}