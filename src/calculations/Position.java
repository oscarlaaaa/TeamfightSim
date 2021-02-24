package calculations;

import java.awt.Point;
import java.util.ArrayList;

import champions.Champion;

public class Position {
    
    public static final int STAGE_WIDTH = 500;
    public static final int STAGE_HEIGHT = 600;


    public static void setPosition(Champion champ, int x, int y) {
        Point p = new Point(x, y);
        champ.setPosition(p);
    }
    
    public static boolean anyTargets(Champion champ) {
        return (champ.getTarget() == null);
    }
    
    private static double getAngle(Champion c1, Champion c2) {
        Point myPos = c1.getPosition();
        Point enemyPos = c1.getPosition();
        
        double angle = Math.toDegrees(Math.asin((myPos.getY() - enemyPos.getY()
                /getDistance(c1, c2))));
        return angle;
    }
    
    private static double getDistance(Champion c1, Champion c2) {
        Point myPos = c1.getPosition();
        Point enemyPos = c1.getPosition();
        
        double distance = Math.hypot((myPos.getX() - enemyPos.getY())
                , (myPos.getY() - enemyPos.getY()));
        return distance;
    }
    
    public static Champion getClosest(Champion champ, ArrayList<Champion> field) {
        Champion closest = null;
        double shortest = 9999;
        for (int i=0; i<field.size(); i++) {
            if ((getDistance(champ, field.get(i))) < shortest) {
                closest = field.get(i);
            }
        }
        return closest;
    }
    
    public static void walkToward(Champion champ1, Champion champ2) {
        double hypo = getDistance(champ1, champ2) - champ1.getMove();
        double angle = getAngle(champ1, champ2);
        
        int newX = (int)(hypo * Math.cos(angle));
        int newY = (int)(hypo * Math.sin(angle));
        Point newSpot = new Point(newX, newY);
        champ1.setPosition(newSpot);
    }
    
}
