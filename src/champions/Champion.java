package champions;

import items.Item;

public class Champion {
    
    String name;
    boolean state;
    int maxHealth;
    public int curHealth;
    //int mana; later
    int attack;
    int armour;
    //int resist; later
    int attSpeed;
    public int nextAtt;
    float critChance;
    float critDamage;
    //int range; later
    //Champion[] targeted; later
    Item[] equipped = new Item[2];
    
    // Champion constructor
    public Champion(String name, 
            int hp, 
            //int mp, 
            int att, 
            int arm, 
           // int res, 
            int as 
            //int rng
            ){
            this.name = name;
            this.maxHealth = hp;
            this.curHealth = hp;
            this.state = true;
            //this.mana = mp; later
            this.attack = att;
            this.armour = arm;
            //this.resist = res; later
            this.attSpeed = as;
            this.nextAtt = as;
            this.critChance = 0.25f;
            this.critDamage = 1.5f;
            //this.range = rng; later
        
    }
    

    /*******************
     * GETTERS
     *******************/
    public String getName() {
        return name;
    }
    
    public boolean getState() {
        return state;
    }
    
    public int getMaxHealth() {
        return maxHealth;
    }
        
    public int getAttack() {
        return attack;
    }
    
    public int getArmour() {
        return armour;
    }
    
    public int getAttSpeed() {
        return attSpeed;
    }
    
    public float getCritChn() {
        return critChance;
    }
    
    public float getCritDmg() {
        return critDamage;
    }
    
    /*******************
     * SETTERS
     *******************/
    
    public void setCurHealth(int health) {
        this.curHealth = health;
    }
    
    public void setNextAtt(int next) {
        this.nextAtt = next;
    }
    
    public void setState(boolean state) {
        this.state = state;
    }
    
    public void setItem(Item[] equip, Item item) {
        for (int i=0; i<equip.length; i++) {
            if (equip[i] == null) {
                equip[i] = item;
            }
        }
    }
}


