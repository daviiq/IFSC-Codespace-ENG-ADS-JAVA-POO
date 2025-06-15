import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) {

     //Declaração de variaveis:
     Scanner scanner = new Scanner(System.in);
     double a;
     double b;
     double c;
     double delta;
     double x1;
     double x2;

     //Cálculo de delta:
        System.out.print("Digite o valor de a: ");
        a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        c = scanner.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("O valor de Delta é: " + delta);

        //Cálculo das raízes ( se existirem)
        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else {
             x1 = (-b + Math.sqrt(delta)) / (2 * a);
             x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes são: x1 = " + x1 + ", x2 = " + x2);
        }

        scanner.close();
    }
}

