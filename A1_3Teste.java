public class A1_3Teste {
  public static final double PI = 3.14159; // Constante para o valor de PI

  public static void main(String[] args) {
    float valor = 12.34736272937628289213732864283f; // Tipo float (sufixo f)

    System.out.printf("Float com 6 casas decimais: '%.6f'\n" , valor);
    System.out.printf("Float em notação cientifica: %e\n" , valor);
    System.out.printf("Float da constante PI: %.4f\n", PI);
    System.out.println("float da constante PI: " + PI);
  }
}
