package calculations;

import champions.Champion;

public class Damage {
    
    // Calculates the damage reduction by armour; champ2 hitting champ1
    static int damage(Champion champ1, Champion champ2) {
        int hit;
        float percent = (100 / (100 + champ1.getArmour()));
        hit = (int) (champ1.getAttack() * percent);
        return hit;
    }
    
    // Champ1 getting hit, champ2 doing the hitting
    static void takeHit(Champion champ1, Champion champ2) {
        champ1.setCurHealth(champ1.curHealth - damage(champ1, champ2)); 
    }
    
    // Displays c1 getting hit by c2
    static void damageVoice(Champion c1, Champion c2) {
        System.out.print(c1.getName() + " took " + c2.getAttack() 
        + " damage! ");
        System.out.println(c1.getName() + " has " + c1.curHealth + 
                " health remaining!" );
    }
    
    // Increments a champion's attack speed
    static void incrementAS(Champion c) {
        --c.nextAtt;
    }
    
    // Resets a champion's attack speed
    static void resetAS(Champion c) {
        c.setNextAtt (c.getAttSpeed());
    }

    // Check if champion is alive or not
    static void checkDead(Champion champ) {
        if (champ.curHealth <= 0) {
            champ.state = false;
        }
    }
    
    // Checks if the champion ready to attack, and hits if so
    public static void nextAttack(Champion champ1, Champion champ2) {
        
        // champ1 attacking champ2
        if (champ1.nextAtt <= 0) {
            takeHit(champ2, champ1);
            resetAS(champ1);
            incrementAS(champ2);
            damageVoice(champ1, champ2);
            checkDead(champ1);
        } else {
            
            // champ2 attacking champ1
            if (champ2.nextAtt <= 0) {
                takeHit(champ1, champ2);
                resetAS(champ2);
                incrementAS(champ1);
                damageVoice(champ2, champ1);
                checkDead(champ2);
            } else {
                
                //both simply increment AS
                incrementAS(champ1);
                incrementAS(champ2);
            }
        }
    }
    

    
}
