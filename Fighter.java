package Rpg;
import java.util.Random;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fighter {
    private String name;
    private int defense;
    private int attack;
    private int health;
    private int speed;
    private int luck;
    Random chance = new Random();
    public int getDefense(){ return this.defense; }
    public int getHealth(){ return this.health; }
    public boolean isAlive(){ return this.health>0; }
    public String getName(){ return this.name; }
    public int getAttack(){ return this.attack; }
    public int getSpeed(){ return this.speed; }
    public int getLuck(){ return this.luck; }
    public Fighter(String name, int defense, int attack, int health, int speed, int luck){
        this.name = name;
        this.defense = defense;
        this.attack = attack;
        this.health = health;
        this.speed = speed;
        this.luck = luck;
    }
    public Fighter(){};
    public void sleep(int ms){
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
    public int firstAttack(){
        return this.speed + new Random().nextInt(11);
    }
    public void takeDamage(int damage) {
        int actualDamage = damage - (this.defense / 2);
        int dodgeAttack = chance.nextInt(101);
        dodgeAttack *= speed;
        int critChance = chance.nextInt(101);
        critChance *= luck;
        if (actualDamage < 0 || dodgeAttack >= 410) actualDamage = 0;
        else if(critChance >= 420) actualDamage *=2;
        this.health -= actualDamage;
        if (this.health < 0) this.health = 0;
        if (actualDamage == 0) {
            System.out.println(this.name + " has taken no damage from attack. His health is still " + this.health);
            sleep(1500);
        } else {
            System.out.println(this.name + " has taken " + actualDamage + " of damage. His health is now " + health);
            sleep(1500);
        }
    }

}
