import java.io.Console;
import java.sql.SQLOutput;

public class Main {
    public int vikt= 19;
    double längd;
    double höjd;
    String färg;

    private boolean hoppa;

    String namn;


    public boolean hoppa(int vikt) {
        if (vikt >= 100) {
            hoppa = false;
        } else {
            hoppa = true;
        }
        return hoppa;
    }

    public boolean skaHoppa() {
        return hoppa;
    }

    public static void main(String[] args) {
        Main main1 = new Main();
        Main main2 = new Main();

        main1.hoppa(50);
        main2.hoppa(110);
        System.out.println("main1 ska hoppa=" + main1.skaHoppa());
        System.out.println("main2 ska hoppa=" + main2.skaHoppa());
    }

}
