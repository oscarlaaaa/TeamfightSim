package calculations;

import java.util.Timer;
import java.util.TimerTask;
import champions.*;

class Task extends TimerTask{
    
    public static int count = 0;
    Champion champ1 = new Champion("Tien Tran", 500, 50, 7); // should win
    Champion champ2 = new Champion("Clsoccer101", 1000, 25, 5); // should lose
    
    
    public void run() {
        
         if(champ1.state == "Alive" && champ2.state == "Alive"
                 && count < 2500) {
            Damage.nextAttack(champ1, champ2);
            count++;
            System.out.println(count);
         } else {
             if(champ1.state == "Dead") {
             System.out.println(champ2.getName() + " has won!");
             System.exit(0);
             } else {
                 System.out.println(champ1.getName() + " has won!");
                 System.exit(0);
                 }
             }
    }
}

public class Clock {

    public void gameTime() {
        Timer timer1 = new Timer();
        TimerTask task = new Task();
        
        timer1.scheduleAtFixedRate(task, 0, 100); // Controls the rate that it increments
        
        System.out.println("running...");
    }
    
}