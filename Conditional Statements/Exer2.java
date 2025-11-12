
import java.util.Scanner;

public class Exer2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a : ");
        double a = sc.nextDouble();
        System.out.print("Enter b : ");
        double b = sc.nextDouble();
        System.out.print("Enter c : ");
        double c = sc.nextDouble();

        double result = b * b - 4 * a * c;

        if(result > 0.0){
            double r1 = (-b + Math.sqrt(result)) / 2 * a;
            double r2 = (-b - Math.sqrt(result)) / 2 * a;

            System.out.println("The roots are " + r1 + " and " + r2);
        }else if(result == 0){
            double r1 = -b / (2 * a);
            System.out.println("The root is " + r1);
        }else{
            System.out.println("The equation has no real roots.");
        }
        sc.close();
    }
    
}
