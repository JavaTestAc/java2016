package basictypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App23 {

    static double a;
    static double b;

    public static void main(String[] args) {

        data();

        double p = 2 * (a + b);
        double s = a * b;

        System.out.println("Perimeter of rectangle(mm): " + p);
        System.out.println("Square of rectangle(mm): " + s);

    }


    static void data() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter side A: ");
            a = Double.parseDouble(reader.readLine());

            System.out.print("Enter side B: ");
            b = Double.parseDouble(reader.readLine());

            boolean flag = true;

            while (flag) {

                if (a <= 0 || b <= 0) {

                    System.out.println("Invalid data.");

                    System.out.print("Enter side A: ");
                    a = Double.parseDouble(reader.readLine());

                    System.out.print("Enter side B: ");
                    b = Double.parseDouble(reader.readLine());

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

