import java.util.Scanner;

public class C1_6Teste {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o item da lista: ");
    System.out.println("1 - Lista 1");
    System.out.println("2 - Lista 2");
    System.out.println("3 - Lista 3");

    int lista = entrada.nextInt();

    switch (lista) {
      case 1:
        System.out.println("Você escolheu a Lista 1");
        break;
      case 2:
        System.out.println("Você escolheu a Lista 2");
        break;
      case 3:
        System.out.println("Você escolheu a Lista 3");
        break;
      default:
        System.out.println("Opção inválida! Por favor, escolha entre 1, 2 ou 3.");
        break;
    }
    entrada.close();
  }
}
