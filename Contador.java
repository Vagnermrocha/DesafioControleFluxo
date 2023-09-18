import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
	    Scanner terminal = new Scanner(System.in);
		// int parametroUm;
		// int parametroDois;
		System.out.println("Digite o parâmetro um");
		int parametroUm = terminal.next.Int();

		System.out.println("Digite o parâmetro dois");
		int parametroDois = terminal.next.Int();
		terminal.close();

		try {
			// chamando o método contendo a lógica de contagem
			contar( parametroUm, parametroDois);
		} catch(ParametrosInvalidosException e) {
			// Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro parâmetro
			System.out.println("O segundo parâmetro deve ser maior que o primeiro parâmetro");

		}

	}

	static void contar(int paramentroUm, int parametroDois) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar exceção
		if (parametroUm > parametroDois)
		throw new ParametrosInvalidosException();

		int contagem = parametroDois - parametroUm;
		// realizar o for para imprimir os números com base na variável contagem
		for (int i=1; i <= contagem; i++) {
			System.out.println("Imprimindo número " +1);
		}
	}

}
