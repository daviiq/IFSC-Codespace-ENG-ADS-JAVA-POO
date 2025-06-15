import java.util.Scanner;

public class Slide34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     //Declaração de variaveis:

     double dolares;
     double real;
     
     //Quantidade de Dólares:
     System.out.println("Digite quantos dolares são: ");
     dolares = scanner.nextDouble();

     //Quantidade de reais convertidos:
     real = dolares * 5.64;
     System.out.println("Isso dá: " + real + "Reais");

     scanner.close();
    }
}
