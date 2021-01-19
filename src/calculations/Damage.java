package calculations;

import champions.Champion;

public class Damage {
    
    // Champ1 getting hit, champ2 doing the hitting
    public void takeHit(Champion champ1, Champion champ2) {
        champ1.curHealth = (champ1.curHealth - champ2.getDamage()); 
    }
    

    // Checks if the champion ready to attack, and hits if so
    public void nextAttack(Champion champ2, Champion champ1) {
        if (champ1.nextAtt == 0) {
            takeHit(champ2, champ1);
            champ1.nextAtt = champ1.getAttSpeed();
        } else {
            --champ1.nextAtt;
        }
    }
    
    // Check if champion is alive or not
    public void checkDead(Champion champ) {
        if (champ.curHealth <= 0) {
            champ.state = "Dead";
        }
    }
    
}
