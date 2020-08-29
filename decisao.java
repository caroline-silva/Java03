import java.util.Scanner;

public class Decisao {
	
	public static void main(String[] args) {
		Scanner meuScanner = new Scanner(System.in); //Criar um objeto Scanner
		System.out.println("Entre com um numero");
		int n= meuScanner.nextInt(); //Le os numero inteiro
		String mensagem = " Eh impar!";
		
		if (n % 2 == 0) //verifica se o numero eh par
			mensagem = " Eh par!";
		System.out.println(n + mensagem);
	}

}
