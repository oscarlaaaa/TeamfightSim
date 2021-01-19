package champions;

public class Champion {
    
    String name;
    public String state;
    int maxHealth;
    public int curHealth;
    //int mana; later
    int damage;
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
           // int arm, 
           // int res, 
            int as 
            //int rng
            ){
        this.maxHealth = hp;
        this.curHealth = hp;
        this.state = "Alive";
        //this.mana = mp; later
        this.damage = dmg;
        //this.armour = arm;
        //this.resist = res; later
        this.attSpeed = as;
        this.nextAtt = as;
        //this.range = rng; later
        
    }
    
    // Creates demo champ1
    public static void protoChamp1() {
        Champion champ1 = new Champion("Tien Tran", 500, 500, 100);
    }
    
    // Creates demo champ2
    public static void protoChamp2() {
        Champion champ2 = new Champion("Clsoccer101", 1000, 200, 200);
    }
    /*******************
     * GETTERS
     *******************/
    
    public int getMaxHealth() {
        return maxHealth;
    }
        
    public int getDamage() {
        return damage;
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


