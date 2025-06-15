import java.util.Scanner;

public class Slide31 {
    public static void main(String[] args) {
     
     //declaração de variáveis:
     Scanner notaScanner = new Scanner(System.in);
     double valor1;
     double valor2;
     double valor3;
     double valor4;
     double media;
     double soma;

     //Nota 1:
     System.out.println("digite a nota 1: ");
     valor1 = notaScanner.nextDouble();

     //nota 2:
     System.out.println("digite a nota 2: ");
     valor2 = notaScanner.nextDouble();

     //nota3:
     System.out.println("digite a nota 3: ");
     valor3 = notaScanner.nextDouble();

     //nota 4: 
     System.out.println("digite a nota 4: ");
     valor4 = notaScanner.nextDouble();

     //Média das notas:
     soma = valor1 + valor2 + valor3 + valor4;
     media = soma/4;
     System.out.println("A média é: " + media);

     notaScanner.close();
    }
}
