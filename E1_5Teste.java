public class E1_5Teste {
    public static void main(String[] args) {
   
      int a = 11;

      if ((a > 10) && (a < 20)) {
        System.out.println("O valor de a é maior que 10 e menor que 20");
      }
      if ((a < 10) || (a > 20)) {
        System.out.println("O valor de a é menor que 10 ou maior que 20");
      }
      if ((a <= 10) && (a <= 20)) {
        System.out.println("O valor de a é menor ou igual a 10 e menor ou igual a 20");
      }
    }
}
