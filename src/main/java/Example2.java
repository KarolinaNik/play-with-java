/**
 * Created by Alexandra on 17/01/2017.
 */
public class Example2 {

    public static void main(String[] args) {
        int var1;
        int var2;

        var1=1024;
        System.out.println("var1 equals = " + var1);

        var2=var1/2;
        System.out.print("var2 equals = var1/2 = ");
        System.out.println(var2);

        //Example 3
        int var;
        double x;

        var = 10;
        x = 10.0;

        System.out.println("Начальное значение переменной var: " + var);
        System.out.println("Начальное значение переменной x: " + x);
        System.out.println(); //пустая строка

        System.out.println("Результат деления (int) "+ var + " на 4 = " + var/4 );
        System.out.println("Результат деления (double) "+ x + " на 4 = " + x/4 );
    }
}
