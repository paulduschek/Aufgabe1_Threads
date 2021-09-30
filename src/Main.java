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

        th2.start();
        th1.start();
    }
    /*Erklärung:
    Egal, welcher Thread zuerst erzeugt wird, der CountPrinter Thread wird immer vor dem DatePrinter Thread ausgegeben.
    Das Ganze ändert sich auch nicht, wenn man die auszugebenen Daten erhöht.
    Ab 2000 auszugebenen Daten schleicht sich während der Ausgabe des Counts hin und wieder eine Ausgabe vom Datum ein.
    Die Ausgabe der Threads ist unvorhersehbar, weshalb die einzelnen Threads bei höheren Datensätzen immer mehr durcheinander geraten.
     */
}
