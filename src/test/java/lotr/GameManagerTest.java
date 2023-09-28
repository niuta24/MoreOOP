package lotr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameManagerTest {
    @Test
    public void testFight() {
        Character character1 = new Hobbit();
        Character character2 = new Elf();

        GameManager.fight(character1, character2);

        // You can add more specific assertions based on the expected outcome of the fight
        assertTrue(!character1.isAlive() || !character2.isAlive());
    }
}

