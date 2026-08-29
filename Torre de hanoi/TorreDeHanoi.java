import java.util.Scanner;

public class TorreDeHanoi {
    static int movimentos = 0;

    public static void hanoi(int n, char origem, char auxiliar, char destino) {
        if (n == 1) {
            movimentos++;
            System.out.println("Movimento: " + movimentos);
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
            return;
        }

        hanoi(n - 1, origem, destino, auxiliar);
        movimentos++;
        System.out.println("Movimento " + movimentos + ": Mover disco " + n + " de " + origem + " para " + destino);
        hanoi(n - 1, auxiliar, origem, destino);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de discos: ");
        int n = scanner.nextInt();

        System.out.println(" ");
        System.out.println("--- ESTADO INICIAL ---");
        System.out.println("Todos os " + n + " discos estão na haste A.");
        System.out.println("Haste A: " + n + " discos");
        System.out.println("Haste B: vazia");
        System.out.println("Haste C: vazia");
        System.out.println(" ");

        System.out.println("--- MOVIMENTOS ---");
        hanoi(n, 'A', 'B', 'C');

        System.out.println(" ");
        System.out.println("--- ESTADO FINAL ---");
        System.out.println("Haste A: vazia");
        System.out.println("Haste B: vazia");
        System.out.println("Haste C: " + n + " discos");

        System.out.println("Quantidade total de movimentos: " + movimentos);
        scanner.close();
    }
}