package basictypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

public class App22 {
    static double a;
    static double b;
    static double c;

    public static void main(String[] args) {

        data();

        double p = a + b + c;
        double pdiv2 = p/2;
        double s = Math.sqrt(pdiv2 * (pdiv2 - a) * (pdiv2 - b) * (pdiv2 - c));
        System.out.println("Perimeter of triangle(mm): " + p);
        System.out.println("Square of triangle(mm): " + s);
    }

    static void data() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter side A: ");
            a = Double.parseDouble(reader.readLine());

            System.out.print("Enter side B: ");
            b = Double.parseDouble(reader.readLine());

            System.out.print("Enter side C: ");
            c = Double.parseDouble(reader.readLine());

            boolean flag = true;

            while (flag) {

                if (((a + b) <= c) || (a <= 0) || (b <= 0) || (c <= 0)) {

                    System.out.println("Invalid data.");

                    System.out.print("Enter side A: ");
                    a = Double.parseDouble(reader.readLine());

                    System.out.print("Enter side B: ");
                    b = Double.parseDouble(reader.readLine());

                    System.out.print("Enter side C: ");
                    c = Double.parseDouble(reader.readLine());

                } else {

                    flag = false;

                }
            }

        } catch (IOException e) {
            System.out.print(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please, enter a number");
            data();
        }
    }
}
