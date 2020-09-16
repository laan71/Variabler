public class Variabler {

    int omdrejning;

    public void start() {
        omdrejning = 1000;
    }

    public void stop() {
        omdrejning = 0;
    }

    public void accelerer() {
        omdrejning = omdrejning + 100;
    }

    public static void main(String[] args) {

        int x;
        double y = 9;

        x = 9;
        x = 8;
        x = 2;

        System.out.println(x+y);
    }
}
