import java.util.Scanner;

public class F1_3Teste {
  public static void main(String[] args) {

    int[] n = new int[5];
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite 5 números inteiros:");
    for (int i = 0; i < 5; i++) { // Loop para ler 5 números inteiros
      System.out.println("Número " + (i + 1) + ":");
      n[i] = entrada.nextInt();
      //Colocamos o i dentro do loop para que ele incremente a cada iteração
      // Assim, irá aumentar o valor do número digitado cada vez que colocarmos o número
    }

    System.out.println("Números digitados:");
    for (int i = 0; i < 5; i++) {
      System.out.println("Número " + (i + 1) + ": " + n[i]);
    }
    entrada.close();
  }
}
