import java.util.Scanner;

public class Slide29 {
    public static void main(String[] args) {
        
     //Declaração de variáveis:
        int minuto;
        int hora;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora");
        hora = scanner.nextInt(); // le a hora

        minuto = hora * 60; // calcula os minutos
        System.out.println("isto é: " + minuto +  "minutos");

        scanner.close();

    }
    
}
