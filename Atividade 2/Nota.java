import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3;

        do{
        System.out.println("Digite sua nota do primeiro trimestre: (0-30)");
        nota1 = scanner.nextDouble();

        if (nota1 < 0 || nota1 > 30) {
            System.out.println("Digite sua nota novamenete: ");
        }

        }while(nota1 < 0 || nota1 > 30);

        do{
        System.out.println("Digite sua nota do segundo trimestre: (0-35)");
        nota2 = scanner.nextDouble();

            if (nota2 < 0 || nota2 > 35){
                System.out.println("Digite sua nota novamente");
            }

        }while(nota2 < 0 || nota2 > 35);

        do{
        System.out.println("Digite a sua nota do terceiro trimestre: (0-35)");
        nota3 = scanner.nextDouble();

        if(nota3 < 0 || nota3 > 35){
            System.out.println("Digite sua nota novamente");
        }

        }while(nota3 < 0 || nota3 > 35);

        double notaNova = nota1 + nota2 + nota3;

        System.out.println("Sua nota e: " + notaNova);
        if (notaNova < 70) {
            System.out.println("Voce esta reprovado!");
        }else if(notaNova > 70){
            System.out.println("Voce esta aprovado! :D");
        }
        
    }
}
