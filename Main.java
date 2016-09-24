import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        //read number from console
        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(reader.readLine());

            if (num < 0 || num >= 100) {

                System.err.print("Number is out of range. Please, enter number from range (0..100) and try.");
                System.exit(1);
            }

            //determine the integer part
            double units = num % 10;
            num = num / 10;

            //retur name number
            if (units == 0 && num ==0) System.out.print("Ноль");
            if (num == 0) {

                System.out.print(units(units));
            } else if (num == 1) {

                System.out.print(numTenToNinetheen(units));
            } else if (num == 2) {

                System.out.print("Двадцать " + units(units));
            } else if (num == 3) {

                System.out.print("тридцать " + units(units));
            } else if (num == 4) {

                System.out.print("Сорок " + units(units));
            } else if (num == 5) {

                System.out.print("Пядсят " + units(units));
            } else if (num == 6) {

                System.out.print("Щестдесят " + units(units));
            } else if (num == 7) {

                System.out.print("Семдесят " + units(units));
            } else if (num == 8) {

                System.out.print("Восемдесят " + units(units));
            } else if (num == 9) {

                System.out.print("Девяносто " + units(units));
            }
        } catch (IOException e) {

            System.out.print(e.getMessage());
        }  catch (NumberFormatException e){

            System.err.print("Enter a number from range 0..100");
        }
    }

    //methods that return units
    public static String units(double units) {

        if (units == 1.0) return "один";
        else if (units == 2.0) return "два";
        else if (units == 3.0) return "три";
        else if (units == 4.0) return "четрые";
        else if (units == 5.0) return "пять";
        else if (units == 6.0) return "шесть";
        else if (units == 7.0) return "семь";
        else if (units == 8.0) return "восемь";
        else if (units == 9.0) return "девять";
        else return "";
    }

    public static String numTenToNinetheen(double units) {

        if (units == 1.0) return "одиннацать";
        else if (units == 2.0) return "двенадацать";
        else if (units == 3.0) return "тринадцать";
        else if (units == 4.0) return "четрнадцать";
        else if (units == 5.0) return "пятнадцать";
        else if (units == 6.0) return "шестьнадцать";
        else if (units == 7.0) return "семьнадцать";
        else if (units == 8.0) return "восемьнадцать";
        else if (units == 9.0) return "девятьнадцать";
        else return "десять";
    }
}
