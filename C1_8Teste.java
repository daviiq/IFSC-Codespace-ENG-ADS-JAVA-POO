import java.util.Scanner;

public class C1_8Teste {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o dia da semana: ");
    String dia = entrada.nextLine(); // Lê o dia da semana

    //Através de um Switch com String que não difere as letras maiúsculas e minúsculas

    switch (dia.toLowerCase()) {
      case "segunda":
        System.out.println("Hoje é segunda-feira.");
        break;
      case "terça":
        System.out.println("Hoje é terça-feira.");
        break;
      case "quarta":
        System.out.println("Hoje é quarta-feira.");
        break;
      case "quinta":
        System.out.println("Hoje é quinta-feira.");
        break;
      case "sexta":
        System.out.println("Hoje é sexta-feira.");
        break;
      case "sábado":
        System.out.println("Hoje é sábado.");
        break;
      case "domingo":
        System.out.println("Hoje é domingo.");
        break;
      default:
        System.out.println("Dia inválido. Por favor, digite um dia da semana válido.");
    }
     
    entrada.close();
  
  }
}
