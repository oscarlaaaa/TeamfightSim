package calculations;

import champions.Champion;

public class Damage {
    
    // Calculates whether the attack will be a critical hit
    private static boolean yesCrit(Champion c1) {
        double x = Math.random();
        return (x <= c1.getCritChn()); 
    }
    
    // Calculates the damage reduction by armour; champ2 hitting champ1
    private static int damage(Champion c1, Champion c2) {
        float percent = (100.0f / (100.0f + c1.getArmour()));
        int hit = (int)(c2.getAttack() * percent);
        
        // Multiplies by critdmg if crit, else normal hit
        if (yesCrit(c2)) {
            hit *= c2.getCritDmg();
            return hit;
        } else {
            return hit;
        }
    }
    
    
    // Champ1 hitting champ2
    private static void doDamage(Champion c1, Champion c2) {
        c2.setCurHealth(c2.getCurHealth() - damage(c2, c1)); 
    }
    
    // Displays c1 getting hit by c2 (CAN DELETE AFTER FULLY IMPLEMENTED)
    private static void damageVoice(Champion c1, Champion c2) {
        System.out.print(c1.getName() + " took " + damage(c1, c2) 
        + " damage! ");
        System.out.println(c1.getName() + " has " + c1.getCurHealth() + 
                " health remaining!" );
    }
    
    // Increments a champion's attack speed
    private static void incrementAS(Champion c) {
        --c.nextAtt;
    }
    
    // Resets a champion's attack speed
    private static void resetAS(Champion c) {
        c.setNextAtt (c.getAttSpeed());
    }

    // Check if champion is alive or not
    private static void checkDead(Champion c) {
        if (c.getCurHealth() <= 0) {
            c.setState(false);
        }
    }
    
    // Checks if the champion ready to attack, and hits if so
    public static void nextAttack(Champion champ1, Champion champ2) {
        
        // champ1 attacking champ2
        if (champ1.nextAtt <= 0) {
            doDamage(champ1, champ2);
            resetAS(champ1);
            incrementAS(champ2);
            damageVoice(champ1, champ2);
            checkDead(champ1);
        } else {
            
            // champ2 attacking champ1
            if (champ2.nextAtt <= 0) {
                doDamage(champ2, champ1);
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
