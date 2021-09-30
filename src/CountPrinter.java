/**
 * @author Paul Duschek
 * @version 1.0, 30.9.21
 */

public class CountPrinter implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }
}
