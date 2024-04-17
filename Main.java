import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String[] op = {"Telefonou para a vítima? ", "Esteve no local do crime? ", "Mora perto da vítima? ", "Devia para a vítima? ", "Já trabalhou com a vítima? "};
	    int[] mat = new int[5];
	    int calc = 0;
	    String resp;
	    for (int i = 0; i < 5; i++) {
	        System.out.println(op[i] + "sim ou nao");
	        resp = sc.nextLine();
	        if (resp.equals("sim")) {
	            mat[i] = 1;
	        } else if (resp.equals("nao")) {
	            mat[i] = 0;
	        } else {
	            System.out.println("Digite uma opção válida");
	            sc.nextLine();
	            i--;
	        }
	    }
	    for (int i = 0; i < 5; i++){
	        calc += mat[i];
	    }
	    if (calc == 5) {
	        System.out.println("A pessoa é o assasino");
	    } else if (calc == 4 || calc == 3) {
	        System.out.println("A pessoa é o cumplice");
	    } else if (calc == 2) {
	        System.out.println("A pessoa é um suspeito");
	    } else {
	        System.out.println("A pessoa é inocente");
	    }
		sc.close();
	}
}
