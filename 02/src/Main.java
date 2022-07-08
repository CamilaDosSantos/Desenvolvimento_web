import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();
        double area = largura * comprimento;
        double preco = area * metroQuadrado;
        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);
        sc.close();
    }
}
// Exemplo do terminal:
//Eu:5
//Eu:        9
//Eu:        6
//        AREA = 45.00
//        PRECO = 270.00