package calculations;

import java.util.Timer;
import java.util.TimerTask;
import champions.*;
import calculations.*;

class Task extends TimerTask{
    
    public static int count = 0;
    Champion champ1 = new Champion("Tien Tran", 500, 500, 100);
    Champion champ2 = new Champion("Clsoccer101", 1000, 200, 200);
    
    public void run() {
        if(count < 250) {
            // will be replaced with damage incrementing method
            while(champ1.state == "Alive" && champ2.state == "Alive") {
               Damage.nextAttack(champ1, champ2);
            }

        } else {
            // replaced with results screen
            System.out.println("End of round.");
            cancel();
        }
    }
}

public class Clock {

    public void gameTime() {
        Timer timer1 = new Timer();
        TimerTask task = new Task();
        
        timer1.scheduleAtFixedRate(task, 0, 100);
        
        System.out.println("running...");
    }
    
}