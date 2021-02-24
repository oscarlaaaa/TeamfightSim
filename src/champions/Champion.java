package champions;

import java.awt.Point;
import java.util.ArrayList;
import items.Item;

public class Champion {
    
    private String name;
    private int ID;
    private boolean state;
    private int maxHealth;
    private int curHealth;
    //int mana; later
    private int attack;
    private int armour;
    //int resist; later
    private int attSpeed;
    public int nextAtt;
    private float critChance;
    private float critDamage;
    private Champion target;
    private ArrayList<Champion> targettedBy;
    private int range; 
    Item[] equipped = new Item[2];
    private Point position;
    private int movement;
    
    
    // Champion constructor
    public Champion(String name, 
            int hp, 
            int att, 
            int arm, 
            int as,
            int range
            //int rng,
            //int mp, 
            //int res, 
            
            ){
        
            this.name = name;
            this.ID = ID++;
            this.maxHealth = hp;
            this.curHealth = hp;
            this.state = true;
            this.attack = att;
            this.armour = arm;
            this.attSpeed = as;
            this.nextAtt = as;
            this.critChance = 0.25f;
            this.critDamage = 1.5f;
            this.position = null;
            this.target = null;
            this.targettedBy = new ArrayList<Champion>();
            this.range = range;
            this.movement = 550;
            //this.mana = mp; later
            //this.resist = res; later
            //this.range = rng; later
    }
    
    
    // Template champion 1
    public static Champion createTien() {
        Champion tien = new Champion("tien", 1000, 50, 50, 5, 50);
        return tien;
    }
    // Template champion 2
    public static Champion createAlex() {
        Champion alex = new Champion("alex", 2000, 30, 70, 10, 70);
        return alex;
    }

    /*******************
     * GETTERS
     *******************/
    public String getName() {
        return name;
    }
    
    public int getId() {
        return ID;
    }
    
    public boolean getState() {
        return state;
    }
    
    public int getMaxHealth() {
        return maxHealth;
    }
    
    public int getCurHealth() {
        return curHealth;
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
    
    public Point getPosition() {
        return position;
    }
    
    public Champion getTarget() {
        return target;
    }
    
    public int getRange() {
        return range;
    }
    
    public double getMove() {
        return movement;
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
    
    public void setPosition(Point p) {
        this.position = p;
    }

    public void setTarget(Champion c) {
        this.target = c;
    }

    public void addTargettedBy(Champion c) {
        this.targettedBy.add(c);
    }

    public void removeTargettedBy(Champion c) {
        this.targettedBy.remove(c);
    }
}


