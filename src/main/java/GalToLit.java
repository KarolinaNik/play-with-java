/**
 * Created by Alexandra on 17/01/2017.
 */
public class GalToLit {

    public static void main(String[] args) {

        double gallons; //1 gallon = 3.7854 litres
        double litres;

        gallons = 10;
        litres = gallons * 3.7854;

        System.out.println("10 gallons contains " + litres + " litres");

        if (gallons == 10) System.out.println("10 gallons");
        //else System.out.println("Not equal to 10 gallons");
    }
}
