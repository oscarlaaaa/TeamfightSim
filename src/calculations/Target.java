package calculations;


import java.util.ArrayList;

import champions.Champion;

public class Target {
    // Constant multiplier for range
    public static final int RANGE_MULTIPLY = 70;
    
    // Checks if the champion is in range using a distance away from a target
    private boolean inRange(Champion c, double x) {
        return ((c.getRange() * RANGE_MULTIPLY) >= x);
    }
    
    // Checks if there is a nearby champion, and sets as target if in range
    // If no one is in range, walk closer to them
    public void targetSystem(Champion c, ArrayList<Champion> field) {
        Champion closest = Position.getClosest(c, field);
        if (inRange(c, Position.getDistance(c, closest))) {
            c.setTarget(closest);
        } else {
            Position.walkToward(c, closest);
        }
    }
}
