package basictypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App21 {

    static double outerradius;
    static double internalradius;
    static final double p = Math.PI;

    public static void main(String[] args) {

        data();

        double lenght = 2 * p * outerradius;
        double squareofcircle = p * outerradius * outerradius;
        double squareofring = p * ((outerradius * outerradius) - (internalradius * internalradius));
        System.out.println("Lenght of circle(mm): " + lenght);
        System.out.println("Square of circle(mm): " + squareofcircle);
        System.out.println("Square of ring(mm): " + squareofring);
    }

    static void data(){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter outer radius of circle: ");
            outerradius = Double.parseDouble(reader.readLine());

            System.out.print("Enter internal radius of circle: ");
            internalradius = Double.parseDouble(reader.readLine());

            boolean flag = true;

            while (flag){

                if (outerradius <= 0.0 || internalradius > outerradius || internalradius <= 0) {

                    System.out.println("Invalid data.");

                    System.out.print("Enter outer radius of circle(mm): ");
                    outerradius = Double.parseDouble(reader.readLine());

                    System.out.print("Enter internal radius of circle(mm): ");
                    internalradius = Double.parseDouble(reader.readLine());

                }else {

                    flag = false;

                }
            }

        }catch (IOException e){
            System.out.print(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("Please, enter a number");
            data();
        }
    }
}
