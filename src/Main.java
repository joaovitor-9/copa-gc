import service.Copa;
import util.CargaInicial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Copa copa = new Copa();
        CargaInicial.popular(copa);
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== Copa GC Menu Principal ===");
            System.out.println("1. Listar selecoes por grupo");
            System.out.println("2. Registrar resultado de partida");
            System.out.println("3. Exibir classificacao do grupo");
            System.out.println("4. Listar artilheiros");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    copa.listarGrupo('A');
                    copa.listarGrupo('B');
                    break;
                case 2:
                    System.out.println("Partida registrada no sistema com sucesso!");
                    break;
                case 3:
                    copa.calcularClassificacao('A');
                    break;
                case 4:
                    copa.topArtilheiros();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        }
        scanner.close();
    }
}