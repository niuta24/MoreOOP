package kick;
import lotr.Character;
public class ElfKick implements kickStrategy {
    @Override
    public void kick(Character whoKick, Character opponent) {
        if (whoKick.getPower() > opponent.getPower()) {
            opponent.setHp(0);
            System.out.println(whoKick + " kills " + opponent);
        } else {
            opponent.setPower(opponent.getPower() - 1);
            System.out.println(whoKick + " kicks " + opponent);
        }
    }
}
