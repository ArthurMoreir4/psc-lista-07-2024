import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
	    double[] temp = new double[12];
	    double media = 0;
	    double[] mm = new double[12];
		System.out.println("Escreva a média de cada mês");
		for (int i = 0;i < 12 ;i++ ) {
		    System.out.println("Temperatura média de " + mes[i]);
		    try {
		        temp[i] = sc.nextDouble();
		    } catch (Exception a) {
		        System.out.println("Erro: Digite um valor válido");
		        sc.next();
		        i--;
		    }
		}
		for (int i = 0; i < 12; i++) {
		    media = media + temp[i];
		}
		media = media / 12;
		for (int i = 0; i < 12; i++) {
		    if (temp[i] > media) {
		        mm[i] = 1;
		    } else {
		        mm[i] = 0;
		    }
		}
		System.out.println("A média anual é " + media);
		System.out.println("Os meses maiores que a média são: ");
		for (int i = 0; i < 12; i++) {
		    if (mm[i] == 1) {
		        System.out.println(mes[i] + " - " + temp[i] + "°");
		    }
		}
		sc.close();
	}
}