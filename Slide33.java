import java.util.Scanner;

public class Slide33 {
    public static void main(String[] args) {

     //Declaração de variaveis:
     Scanner scanner = new Scanner(System.in);
     double ano;
     double dias;

     // Quantidade de anos:
     System.out.println("Digite quantos anos são: ");
     ano = scanner.nextDouble();

     //Conversão de dias em anos:
     dias = ano * 365;
     System.out.println("Então são: " + dias + "Dias");

     scanner.close();
    }
}
