package champions;

class Champion {
    
    String name;
    int health;
    int damage;
    int armour;
    int resist;
    int attSpeed;
    int range;
    double id;
    
    // Champion output
    public Champion(String name, int hp, int dmg, int arm, int res, int as, int rng) {
        this.health = hp;
        this.damage = dmg;
        this.armour = arm;
        this.resist = res;
        this.attSpeed = as;
        this.range = rng;
    }
    
    
}


