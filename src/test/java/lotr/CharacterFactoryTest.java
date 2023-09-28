package lotr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CharacterFactoryTest {
    // BEGIN: ed8c6549bwf9
    private CharacterFactory characterFactory;
    // END: ed8c6549bwf9

    @BeforeEach
    public void init() {
        // Use the characterFactory field here
        characterFactory = new CharacterFactory();
    }

    @Test
    public void testCreateCharacter() {
        Character character = CharacterFactory.createCharacter();
        assertTrue(character instanceof Character);
    }
}

