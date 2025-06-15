import java.util.Scanner;

public class Slide30 {
    
     public static void main(String[] args) {
        
     //Declaração de variáveis:
        float minuto;
        float hora;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os minutos");
        minuto = scanner.nextFloat(); // le os minutos

        hora = minuto / 60; // calcula as horas
        System.out.printf("Então temos: '%.2f'\n " + "horas", hora);

        scanner.close();
    }
    
}
