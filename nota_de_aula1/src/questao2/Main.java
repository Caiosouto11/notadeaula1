package questao2;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    Produto p = new Produto();

    System.out.println("digite o nome do produto");
    p.setNome(sc.nextLine());

    System.out.println("digite o código do produto");
    p.setCodigo(sc.nextInt());

    System.out.println("digite a cor do produto");
    p.setCor(sc.next());

    System.out.println("digite o peso do produto");
    p.setPeso(sc.nextInt());

    System.out.println("digite a quantidade de produto no estoque");
    p.setEstoque(sc.nextInt());

    System.out.println("digite o preço do produto");
    p.setValor(sc.nextDouble());

    System.out.println("Escolha seu método de pagamento: Pix, Espécie, Débito, Tranferência ou Crédito");
    String formadepagamento = sc.next();

    if (formadepagamento.equalsIgnoreCase("Pix") ||
            formadepagamento.equalsIgnoreCase("Transferência") ||
            formadepagamento.equalsIgnoreCase("Débito")) {

      double valor = p.getValor() * 0.95;
      System.out.println("O preço com desconto é: " + valor);

    } else if (formadepagamento.equalsIgnoreCase("Crédito")) {
      System.out.println("o valor parcelado em 3x sem juros é: %2f%n" + p.getValor() / 3);

    }else if (formadepagamento.equalsIgnoreCase("Espécie")) {
      System.out.println("Quanto você irá pagar?");
      double valor1 = sc.nextDouble();
      double valor2 = p.getValor() * 0.95;
      double troco = valor1 - valor2;
      if (troco >= 0) {

        double valor = p.getValor() * 0.95;
        System.out.printf("O preço já com o desconto é: %.2f%n", valor);
        System.out.printf("O troco é: %.2f%n", troco);

      } else {

        System.out.println("Pagamento inválido!");
      }
    }
  }
}

