package ss1_IntroductiontoJava.ThucHanh;
import java.util.Scanner;

public class PTBac1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("a :");
        double a=scanner.nextDouble();

        System.out.println("b :");
        double b=scanner.nextDouble();

        System.out.println("c :");
        double c=scanner.nextDouble();

        if(a!=0){
            double kq=(c-b)/a;
            System.out.println("Equation pass with x = %f!\n"+kq);
        }
        else {
            if(b==c){
                System.out.println("The solution is all x!");
            }
            else {
                System.out.print("No solution!");
            }
        }


    }
}
