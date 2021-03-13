package calculations;

import java.util.Timer;
import java.util.TimerTask;
import champions.Champion;

class Task extends TimerTask{
    
    public static int count = 0;
    
    
    public void run() {
        Champion tien = Champion.createTien();
        Champion alex = Champion.createAlex();
         if(tien.getState() == true && alex.getState() == true
                 && count < 250) {
            Damage.nextAttack(tien, alex);
            count++;
         } else {
             if(tien.getState() == false) {
             System.out.println(alex.getName() + " has won!");
             System.exit(0);
             } else {
                 System.out.println(tien.getName() + " has won!");
                 System.exit(0);
                 }
             }
    }
}

public class Clock {

    public void gameTime() {
        Timer timer1 = new Timer();
        TimerTask task = new Task();
        
        timer1.scheduleAtFixedRate(task, 0, 50); // Controls the rate that it increments
        
        System.out.println("running...");
    }
    
}

 