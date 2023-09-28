package lotr; 
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import kick.kickStrategy;

@Getter @Setter @AllArgsConstructor
public abstract class Character{
    private int hp;
    private int power; 
    private kickStrategy kickStrategy;

    public void kick(Character c){
        kickStrategy.kick(this, c);
    }

    public boolean isAlive(){
        return hp > 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + getHp() + ", power=" + getPower() + "}";
    }
    public void setHp(int hp){
        this.hp = hp > 0 ? hp : 0;
    }
}
