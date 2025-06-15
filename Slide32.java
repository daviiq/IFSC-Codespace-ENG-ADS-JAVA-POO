import java.util.Scanner;

public class Slide32 {
    public static void main(String[] args) {
        
     //declaração das variaveis:
     Scanner scanner = new Scanner(System.in);
     double preço;
     double desconto;
     double resultado;

     //Preço do produto:
     System.out.println("Digite o preço do produto: ");
     preço = scanner.nextDouble();

     //Desconto do produto:
     System.out.println("Digite o valor do desconto: ");
     desconto = scanner.nextDouble();

     //Valor real do produto:
     resultado = preço - desconto;
     System.out.println("Este é o valor do produto com desconto: " + resultado);

     scanner.close();
    }
}
