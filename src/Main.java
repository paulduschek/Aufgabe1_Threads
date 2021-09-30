/**
 * @author Paul Duschek
 * @version 1.0, 30.9.21
 */

public class Main {
    public static void main(String[] args) {
        DatePrinter dp = new DatePrinter();
        Thread th1 = new Thread(dp);

        CountPrinter cp = new CountPrinter();
        Thread th2 = new Thread(cp);

        th1.start();
        th2.start();
    }
}
