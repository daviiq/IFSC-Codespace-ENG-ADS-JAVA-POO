import java.util.Scanner;

public class F1_5Teste {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int[][] matriz = new int[2][2];
   
    System.out.println("Digite os valores da matriz 2x2:");

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.println("Elemento [" + i + "][" + j + "]:");
        matriz[i][j] = entrada.nextInt();
      }
    }

    System.out.println("0x0 elemento " + matriz[0][0]);
    System.out.println("0x1 elemento " + matriz[0][1]);
    System.out.println("1x0 elemento " + matriz[1][0]);
    System.out.println("1x1 elemento " + matriz[1][1]);

    entrada.close();
  }
}
