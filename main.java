package Rpg;
import java.util.Scanner;
import java.util.List;
public class main {
    public static void main(String args[]) {
        Roster roster = new Roster();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the first fighter: ");
        Fighter fighter1 = roster.getOrCreate(sc);
        System.out.println("Choose the second fighter: ");
        Fighter fighter2 = roster.getOrCreate(sc);
        System.out.println("FIGHT!");
        //deciding who attacks first based on their speed and luck
        Fighter attacker;
        Fighter defender;
        int f1First = fighter1.firstAttack();
        int f2First = fighter2.firstAttack();
        if(f1First >= f2First){
            attacker = fighter1;
            defender = fighter2;
        }
        else{
            attacker = fighter2;
            defender = fighter1;
        }
        System.out.println(attacker.getName() + " starts!");
        while(attacker.isAlive() && defender.isAlive()){
            defender.takeDamage(attacker.getAttack());
            if(!defender.isAlive()){
                break;
            }
           Fighter temp = attacker;
            attacker = defender;
            defender = temp;
        }
        if(fighter1.isAlive()){
            System.out.println(fighter1.getName() + " won!");
        }
        else{
            System.out.println(fighter2.getName() + " won!");
        }
    }
}
