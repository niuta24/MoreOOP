package lotr;
import kick.KingStrategy;

public class Knight extends Character {
    public Knight() {
        // from 2 to 12
        super(Math.max(2, (int) (Math.random() * 10 + 2)), Math.max(2, (int) (Math.random() * 10 + 2)), new KingStrategy());
    }
}
