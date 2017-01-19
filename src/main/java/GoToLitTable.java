/**
 * Created by Alexandra on 17/01/2017.
 */
public class GoToLitTable {

    public static void main(String[] args) {
        double gallons, litres;
        int counter = 0;

        for (gallons = 1; gallons <=100; gallons++) {
            litres = gallons * 3.7854;
            System.out.println(gallons + " галлонам соответствует " + (int)litres + " литров.");
            counter++;
            if(counter == 10)
                System.out.println();
                counter = 0;
        }
    }
}
