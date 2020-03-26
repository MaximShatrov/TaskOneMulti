import java.util.InputMismatchException;
import java.util.Scanner;

public class Math {

    public static void main(String[] args){

    }

    public static float scanInput(){
        boolean inputFloatCheck = true;
        Scanner input = new Scanner(System.in);
        float nextFloat = 0;
        while (inputFloatCheck) {
            try {

                nextFloat = input.nextFloat();
                inputFloatCheck = false;
            }
            catch (InputMismatchException e) {
                //System.out.println("NumberFormatException: " + e.getMessage());
                System.out.println("Это не число... вводи по новой:");
                input.next();
            }
        }

        return nextFloat;
    }

    public static void summary(float a, float b) {
        System.out.println("Сумма       a+b = " + (a + b));
    }

    public static void difference(float a, float b) {
        System.out.println("Разность    a-b = " + (a - b));
    }

    public static void composition(float a, float b) {
        System.out.println("Множество   a*b = " + a * b);
    }

    public static void ratio(float a, float b) {
        if (b == 0)
        {
            System.out.println("Частное     a/b = Бесконечность");
        }
        else{
            System.out.println("Частное     a/b = " + a / b);
        }
    }


}
