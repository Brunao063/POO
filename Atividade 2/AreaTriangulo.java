import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os 3 lados do triangulo X: ");
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double triangulo1 = x1+x2+x3;

        System.out.println("Digite os 3 lados do triangulo Y: ");
        double y1 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double triangulo2 = y1+y2+y3;

        double AreaTrianguloX = triangulo1/2;
        double AreaTrianguloY = triangulo2/2;

        System.out.println("A area do triangulo X e: ");
        System.out.println(AreaTrianguloX);

        System.out.println("A area do triangulo Y e: ");
        System.out.println(AreaTrianguloY);

        if (AreaTrianguloX > AreaTrianguloY) {
            System.out.println("O area do triangulo X e maior");
        }else if (AreaTrianguloY > AreaTrianguloX){
            System.out.println("O area do triangulo Y e maior");
        }else if (AreaTrianguloX == AreaTrianguloY){
            System.out.println("Os valores sao iguais");
        }
    }
}
