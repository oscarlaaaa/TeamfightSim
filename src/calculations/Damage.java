package calculations;

import champions.Champion;

public class Damage {
    
    // Champ1 getting hit, champ2 doing the hitting
    public static void takeHit(Champion champ1, Champion champ2) {
        champ1.setCurHealth(champ1.curHealth - champ2.getDamage()); 
    }
    

    // Checks if the champion ready to attack, and hits if so
    public static void nextAttack(Champion champ1, Champion champ2) {
        if (champ1.nextAtt <= 0) {
            takeHit(champ2, champ1);
            champ1.setNextAtt(champ1.getAttSpeed());
            champ2.setNextAtt(--champ2.nextAtt);
            System.out.print(champ1.getName() + " took " + champ2.getDamage() 
            + " damage! ");
            System.out.println(champ1.getName() + " has " + champ1.curHealth + 
                    " health remaining!" );
            checkDead(champ1);
        } else {
            if (champ2.nextAtt <= 0) {
                takeHit(champ1, champ2);
                champ2.setNextAtt (champ2.getAttSpeed());
                champ1.setNextAtt(--champ1.nextAtt);
                System.out.print(champ2.getName() + " took " + champ1.getDamage() 
                + " damage! ");
                System.out.println(champ2.getName() + " has " + champ2.curHealth + 
                        " health remaining!" );
                checkDead(champ2);
            } else {
                --champ1.nextAtt;
                --champ2.nextAtt;
            }
        }
    }
    
    // Check if champion is alive or not
    public static void checkDead(Champion champ) {
        if (champ.curHealth <= 0) {
            champ.state = false;
        }
    }
    
}
