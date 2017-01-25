/**
 * Created by AlexandraADM on 25/01/2017.
 */
public class gl2_RelLogOps {

    public static void main(String[] args) {
        int i = 10;
        int j = 11;
        boolean b1, b2;

        if (i < j) System.out.println("i < j");
        if (i > j) System.out.println("i > j");
        if (i <= j) System.out.println("i <= j");
        if (i >= j) System.out.println("i >= j");
        if (i != j) System.out.println("i != j");
        if (i == j) System.out.println("i == j");

        b1 = true;
        b2 = false;
        if (b1 & b2) System.out.println("This won't be run");
        if (!(b1 & b2)) System.out.println("!(b1 & b2): true");
        if (b1 | b2) System.out.println("b1 | b2: true");
        if (b1 ^ b2) System.out.println("b1 ^ b2: true");
    }


}
