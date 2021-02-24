package calculations;


import java.util.ArrayList;

import champions.Champion;

public class Target {
    public static final int RANGE_MULTIPLY = 70;
    
    
    private boolean inRange(Champion c, int x) {
        return ((c.getRange() * RANGE_MULTIPLY) >= x);
    }
    
    private void findTarget(Champion c, ArrayList<Champion> field) {
        c.setTarget(Position.getClosest(c, field));
    }
    
    public void targetSystem(Champion c, ArrayList<Champion> field) {
        if (c.getTarget() == null) {
            findTarget(c, field);
        } 
    }
}
