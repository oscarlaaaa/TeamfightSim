package items;

public class Item {
    
    String name;
    // attributes of the item
    private int addHp;
    private int addAtt;
    private int addArmour;
    private float addCritChn;
    private float addCritDmg;
    private int addAttSpd;
    // special effects of the items (will be linked to methods)
    private enum special {special1, special2, special3}
    
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
    


