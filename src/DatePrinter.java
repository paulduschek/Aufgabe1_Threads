/**
 * @author Paul Duschek
 * @version 1.0, 30.9.21
 */

import java.util.Date;

public class DatePrinter implements Runnable{
    @Override
    public void run() {
        Date now = new Date();
        for(int i = 0; i < 20; i++) {
            System.out.println(now);
        }
    }
}
