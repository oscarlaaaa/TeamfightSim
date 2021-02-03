package main;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Hex {
    
    /**
     * Builds the Hexfield battlegrounds.
     * @return Group
     */
    public static Group hexField() {
        Group group = new Group();
        
        for (double i=0; i<7; i++) {
            for (int n=0; n<8; n++) {
                if (n < 4) {
                    if (n % 2 == 0) {
                        group.getChildren().add(createHex(i, n, Color.BLUE));
                        } else {
                        group.getChildren().add(createHex(i+0.5, n, Color.BLUE));
                        }
                } else {
                    if (n % 2 == 0) {
                    group.getChildren().add(createHex(i, n, Color.GREEN));
                    } else {
                    group.getChildren().add(createHex(i+0.5, n, Color.GREEN));
                    }
                }
            }
        }
        return group; 
    }
    
    
    /**
     * Builds a hexagon.
     * @param x X-position
     * @param y Y-position
     * @param c Colour
     * @return Group
     */
    public static Group createHex(double x, int y, Color c) {
        
       // Circle a = new Circle((x * 50), (y * 50), 25, c);
        Rectangle xx = new Rectangle((x * 75), (y * 65), 40, 69.28);
        Rectangle yy = new Rectangle((x * 75), (y * 65), 40, 69.28);
        Rectangle zz = new Rectangle((x * 75), (y * 65), 40, 69.28);
        xx.setRotate(30);
        yy.setRotate(150);
        zz.setRotate(270);
        xx.setFill(c);
        yy.setFill(c);
        zz.setFill(c);
        
        Group hexagon = new Group(xx, yy, zz);
        return hexagon;
    }
}
