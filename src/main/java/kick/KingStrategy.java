package kick;
import lotr.Character;

public class KingStrategy implements kickStrategy{
    @Override
    public void kick(Character whoKick, Character opponent) {
        opponent.setHp(opponent.getHp() - Math.max(0, whoKick.getPower() - opponent.getPower()));
    }
}
