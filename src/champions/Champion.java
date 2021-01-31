package champions;

public class Champion {
    
    String name;
    public boolean state;
    int maxHealth;
    public int curHealth;
    //int mana; later
    int attack;
    int armour;
    //int resist; later
    int attSpeed;
    public int nextAtt;
    //int range; later
    //Champion[] targeted; later
    
    // Champion constructor
    public Champion(String name, 
            int hp, 
            //int mp, 
            int dmg, 
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
            this.attack = dmg;
            this.armour = arm;
            //this.resist = res; later
            this.attSpeed = as;
            this.nextAtt = as;
            //this.range = rng; later
        
    }
    

    /*******************
     * GETTERS
     *******************/
    public String getName() {
        return name;
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
    
    /*******************
     * SETTERS
     *******************/
    
    public void setCurHealth(int health) {
        this.curHealth = health;
    }
    
    public void setNextAtt(int next) {
        this.nextAtt = next;
    }

}


