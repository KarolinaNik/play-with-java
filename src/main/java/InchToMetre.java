/**
 * Created by Alexandra on 17/01/2017.
 */
public class InchToMetre {

    public static void main(String[] args) {
        int inches, counter=0;
        double foot, metres;

        for (inches = 1; inches <=100; inches++) {
            counter++;
            foot = inches * 0.0833333;
            metres = inches * 0.02539998984;
            System.out.println(inches + " дюймов = "
                    + foot + " футов или "
                    + metres + " метров ");
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
