package kick;
import lotr.Character;

public class Cry implements kickStrategy {
    @Override
    public void kick(Character whoKick, Character opponent) {
        System.out.println(whoKick + " cries and does nothing to " + opponent);
    }
}
