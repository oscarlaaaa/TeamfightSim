package items;

public class Item {
    
    String name;
    int addHp;
    int addAtt;
    int addArmour;
    float addCritChn;
    float addCritDmg;
    int addAttSpd;
    
    public Item(String nm, int hp, int att, int armour, float critchn, float critdmg, int as) {
        this.name = nm;
        this.addHp = hp;
        this.addAtt = att;
        this.addArmour = armour;
        this.addCritChn = critchn;
        this.addCritDmg = critdmg;
        this.addAttSpd = as;
    }
    
    Item item1 = new Item("hpdummy", 500, 0, 0, 0, 0, 0);
    Item item2 = new Item("attdummy", 0, 100, 0, 0, 0, 0);
    Item item3 = new Item("asdummy", 500, 0, 0, 0, 0, 2);
}
    


