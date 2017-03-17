/**
 * Created by Alexandra on 17/03/2017.
 */
public class gl2_SCops {

    public static void main(String[] args) {
        int n, d, q;
        n = 10;
        d = 2;

        if (d != 0 && (n % d) == 0)   //используем укороченный оператор И, вторая часть не обязательно выполняется
            System.out.println(d + " является делителем " + n);

        d = 0;
    }

}
