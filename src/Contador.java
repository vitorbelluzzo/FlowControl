import java.util.Scanner;

public class Contador {
    private static int setandoIterações;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Insira o segundo numero (deve ser maior que o primeiro): ");
        int numero2 = scanner.nextInt();
        Contar(numero1, numero2);
        int setandoIterações = numero2 - numero1;
        for (int i = 0; i <= setandoIterações; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

    static void Contar(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
}