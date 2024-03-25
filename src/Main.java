import java.util.ArrayList;

public class Main {

    static ArrayList<String> ekstremalpunkt = new ArrayList<>();

    public static void sjekkEkstremalpunkt(double range, double stigning) {
        double s = stigning;
        lib lib = new lib();

        for (double i = -range; i <= range; i+=stigning) {

            if (Math.round(lib.derivert(i, 0.0001)) == 0) {
                ekstremalpunkt.add("(" + i + ", " + lib.f(i) + ")");
                System.out.println("uwu");
                return;
            }
            else if (i == 100 && ekstremalpunkt.size() == 0) {
                i = -range;
                stigning /= 10;
                lib.print("Tom");
            } else if (stigning == 0.0001) {
                lib.print("Stigning er 0.0001");
                range *= 10;
                stigning = s;
            } else if (range > 10000) {
                lib.print("Ut av range");
                return;
            }

        }

    }
    public static void main(String[] args) {

        double range = 100;
        double stigning = 1;

        sjekkEkstremalpunkt(range, stigning);

        System.out.println(ekstremalpunkt.size());
        for (int i = 0; i < ekstremalpunkt.size(); i++) {
            System.out.println(ekstremalpunkt.get(i));
        }


    }

}
