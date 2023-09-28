package lotr; 

public class GameManager {
    static void fight(Character c1, Character c2) {
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " (HP: " + c1.getHp() + ") vs. " +
                    c2.getClass().getSimpleName() + " (HP: " + c2.getHp() + ")");
            c1.kick(c2);
            c2.kick(c1);

            if (c1.isAlive() && c2.isAlive()) {
                System.out.println(c1.getClass().getSimpleName() + " (HP: " + c1.getHp() +  ") vs. " +
                        c2.getClass().getSimpleName() + " (HP: " + c2.getHp() + ")");
            }
        }

        if (c1.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " wins!");
        } else if (c2.isAlive()) {
            System.out.println(c2.getClass().getSimpleName() + " wins!");
        }
    }
}