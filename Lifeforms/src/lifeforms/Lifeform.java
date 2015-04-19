package lifeforms;


import java.util.Random;
import java.util.UUID;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class Lifeform {
    UUID id;
    String name;
    int strength;
    int dexterity;
    int intelligence;
    int charisma;
    int hitpoints;
    int current_hitpoints;
    int experience;
    int level;
    
    void init()
    {
        id = UUID.randomUUID();
        name = "Joe" + Randomnumber(1,1000); 
        strength = Randomnumber(1,6)+Randomnumber(1,6)+Randomnumber(1,6);
        dexterity = Randomnumber(1,6)+Randomnumber(1,6)+Randomnumber(1,6);
        intelligence = Randomnumber(1,6)+Randomnumber(1,6)+Randomnumber(1,6);
        charisma = Randomnumber(1,6)+Randomnumber(1,6)+Randomnumber(1,6);
        hitpoints = Randomnumber(1,10)+Randomnumber(1,10)+Randomnumber(1,10);
        current_hitpoints = hitpoints;
    }
    private int Randomnumber(int min,int max)
    {
        Random randomGenerator = new Random();
        return min + randomGenerator.nextInt(max-min);      
    }
}
