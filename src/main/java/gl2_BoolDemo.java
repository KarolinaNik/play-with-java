/**
 * Created by Alexandra on 23/01/2017.
 */
public class gl2_BoolDemo {

    public static void main(String[] args) {

        boolean b;

        b = false;
        System.out.println("Значение b: " + b);
        b = true;
        System.out.println("Значение b: " + b);

        // логическое значение можно использовать для
        // управления условным оператором if

        if (b) System.out.println("Эта инструкция выполняется");

        b = false;
        if (b) System.out.println("Эта инструкция не выполняется");

        System.out.println("Результат сравнения 10 > 9: " + (10 > 9));
    }
}
