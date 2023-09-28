package lotr;
import kick.KingStrategy;
public class King extends Character {
    public King() {
        // from 5 to 15
        super(Math.max(5, (int) (Math.random() * 10 + 5)), Math.max(5, (int) (Math.random() * 10 + 5)), new KingStrategy());
    }
}
