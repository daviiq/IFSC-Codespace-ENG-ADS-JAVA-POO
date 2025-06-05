//Importando a biblioteca Scanner para leitura de dados
import java.util.Scanner; 

public class B1_1Teste {
  public static void main(String[] args) {
    Scanner linhadigitada = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

    System.out.print("Digite algo: ");
    String entrada = linhadigitada.nextLine(); // Lê uma linha de texto digitada pelo usuário

    System.out.println("Você digitou: " + entrada); // Exibe o que foi digitado pelo usuário

    linhadigitada.close(); // Fecha o Scanner para liberar recursos
  }
}

//Lembrando que a Classe começa com letra maiúscula
//O metodo vem após o ponto
//O objeto é criado apartir do "new"
