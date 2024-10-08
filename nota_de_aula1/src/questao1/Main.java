package questao1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.println("Nota 1?");
        a.setNota1(sc.nextDouble());
        System.out.println(a.getNota1());

        System.out.println("Nota 2?");
        a.setNota2(sc.nextDouble());
        System.out.println(a.getNota2());

        System.out.println("Nota 3?");
        a.setNota3(sc.nextDouble());
        System.out.println(a.getNota3());

        a.Calculo();
        System.out.println(a.getMedia());

        if (a.getMedia() < 7) {
            System.out.println("Você está reprovado");
        } else if (a.getMedia() >= 7) {

            System.out.println("Você está aprovado");
        }


    }
}