import java.util.Scanner;

public class Slide28 {
    public static void main(String[] args) {

        
    // Declaração de variáveis
    float base; 
    float altura;
    float area;

    Scanner scanner = new Scanner(System.in); // Importa a classe Scanner para ler entradas do usuário

    System.out.println("Digite o valor da base do triângulo: ");
    base = scanner.nextFloat(); // Lê a base do triângulo

    System.out.println("Digite o valor da altura do triângulo: ");
    altura = scanner.nextFloat(); // Lê a altura do triângulo
    
    area = (base * altura) / 2; // Calcula a área do triângulo
    System.out.println("A área do triângulo é:" + area); // Exibe a área do triângulo

    scanner.close(); // Fecha o scanner para evitar vazamento de recursos
    }
  }
