import java.util.Scanner;

public class C1_7Teste {
  public static void main(String[] args) {
   
    Scanner entrada = new Scanner(System.in);

    System.out.println("Menu: Digite a letra desejada:");
    System.out.println("a - Opção A");
    System.out.println("b - Opção B");
    System.out.println("c - Opção C");

    System.out.print("Digite sua opção: ");
    char opcao = entrada.next().charAt(0);

    switch (opcao) {
      case 'a':
        System.out.println("Você escolheu a Opção A");
        break;
      case 'b':
        System.out.println("Você escolheu a Opção B");
        break;
      case 'c':
        System.out.println("Você escolheu a Opção C");
        break;
      default:
        System.out.println("Opção inválida! Por favor, escolha entre a, b ou c.");
        break;
    }
    entrada.close();
  }
}
