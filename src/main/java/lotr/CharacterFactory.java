package lotr;

import java.util.Random;
import java.util.Arrays;
import java.util.List;
import lombok.SneakyThrows;

public class CharacterFactory {
    @SneakyThrows
    public static Character createCharacter() {
        List<Class<? extends Character>> characterClasses = Arrays.asList(Knight.class, King.class, Hobbit.class, Elf.class);
        return characterClasses.get(new Random().nextInt(characterClasses.size())).getDeclaredConstructor().newInstance();
    }    
}
