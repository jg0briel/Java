import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ex1();
		//ex2();
		//ex3();
		//ex4();
		ex5();
	}
	
	private static void ex1() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Bom dia " +nome);
		entrada.close();
		
	}


	private static void ex2() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o seu ano de nascimento: ");
		int idade = entrada.nextInt();
		
		LocalDate d2 = LocalDate.now();
		int ano_atual = d2.getYear();
		
		System.out.println("Você tem: " +(ano_atual - idade));
		entrada.close();
		
	}

	private static void ex3() {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int n1 = teclado.nextInt();
		
		System.out.println("Digite agora um nome:");
		teclado.nextLine();
		
		
		String nome = teclado.nextLine();
		System.out.println("O número digitado foi"+n1+" e nome foi "+nome);
		teclado.close();
		
	}

	private static void ex4() {
		String nome, apelido;
		nome = "João";
		apelido = nome;
		nome = null;
		System.out.println(apelido);
		
	}
	
	private static void ex5() {
		final int salariominimo = 1412;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite seu salário: ");
		int salario = entrada.nextInt();
		
		System.out.println("A diferença entre o seu salário e o salário mínimo é: "+ (salario - salariominimo));
		entrada.close();
		
		
	


	}
}