import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        int valor;
        int i = 0;
        int soma = 0;
        int media = 0;
        boolean op = true;
        System.out.println("Digite os valores de notas (-1 para sair)");
        while (op = true) {
            try {
                valor = sc.nextInt();
                if (valor == -1) {
                    i--;
                    op = false;
                    break;
                } else {
                    num.add(valor);
                    i++;
                }
            } catch(Exception e) {
                System.out.println("Erro: Digite um valor válido");
                sc.next();
            }
        }
        System.out.println("Foram inseridos " + (i + 1) + " números");
        System.out.println("Ordem Crescente:");
        for (int l = 0; l <= i; l++) {
            if (l == i) {
                System.out.println(num.get(l));
            } else {
                System.out.print(num.get(l) + ", ");
            }
        }
        System.out.println("Ordem Decrescente:");
        for (int l = i; l >= 0; l--) {
            System.out.println(num.get(l));
        }
        System.out.println("Soma:");
        for (int l = 0; l <= i; l++) {
            soma += num.get(l);
        }
        System.out.println(soma);
        System.out.println("Média");
        media = (soma / (i +1));
        System.out.println(media);
        System.out.println("Acima da média");
        for (int l = 0; l <= i; l++) {
            if (num.get(l) > media) {
                System.out.println(num.get(l));
            }
        }
        System.out.println("Abaixo de 7");
        for (int l = 0; l <= i; l++) {
            if (num.get(l) < 7) {
                System.out.println(num.get(l));
            }
        }
        System.out.println("Mensagem");
        sc.close();
    }
}