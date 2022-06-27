package listaDeExerciciosArrays;

public class Exercicio1 {

	public static void main(String[] args) {
		// 1 - criar o array que comporta até 10 inteiros;
		// também funciona com int numemos[];
		
		int[] numeros = new int[10];

		// 2 - preencher o array;
		
		numeros[0] = 2;
		numeros[1] = 12;
		numeros[2] = 15;
		numeros[3] = 34;
		numeros[4] = 54;
		numeros[5] = 4;
		numeros[6] = 23;
		numeros[7] = 12;
		numeros[8] = 8;
		numeros[9] = 21;

		// 3 - mostrar na tela (console) os valores pares;

		int totalPares = 0;
		for (int indiceArray = 0; indiceArray < numeros.length; indiceArray++) {
			int numeroAtual = numeros[indiceArray];
			int restoDivisaoPor2 = numeroAtual % 2;

			if (numeroAtual > 0 && restoDivisaoPor2 == 0) {
				totalPares++;
				System.out.println("Número par encontrado: " + numeroAtual);
			}

		}

		System.out.println("Total de números pares: " + totalPares);

	}

}
