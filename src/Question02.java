/*
 * Uma matriz quadrada inteira é um “quadrado mágico” se a soma dos elementos de cada linha, a soma dos elementos de cada coluna e a soma
 * dos elementos das diagonais principal e secundária são todas iguais. Por exemplo, a matriz abaixo é um quadrado mágico:
 */

import java.util.Random;

public class Question02 {

	// Método Principal
	public static void main(String[] args) {
		
		verificaMatrizQuadrada(geraMatrizQuadrada(2));
	}

	// Verifica a Matriz Quadrada
	public static void verificaMatrizQuadrada(int[][] matriz) {
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.println("["+ matriz[i][j] +"]");
			}
		}
		
		System.out.println("\n");
		
		boolean linhaseColunas = somaLinhaseColunas(matriz);
		boolean diagonais = somaDiagonais(matriz);
		
		if(linhaseColunas==true && diagonais==true) {
			System.out.println("\n A Matriz Gerada é um Quadrado Mágico.");
		}else {
			System.out.println("\n A Matriz Gerada não é um Quadrado Mágico.");
		}
	}
	
	// Gera Matriz Quadrada Randomica
	public static int[][] geraMatrizQuadrada(int dimensao) {
		
		int dim = dimensao;
		int[][] matriz = new int[dim][dim];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = new Random().nextInt(10);
			}
		}
		return matriz;
	}
	
	// Soma Linhas e Colunas da Matriz
	public static boolean somaLinhaseColunas(int[][] matriz) {
		
		int[] somaLinhas = new int[matriz.length];
		int[]somaColunas = new int[matriz.length];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				somaLinhas[i] += matriz[i][j];
			}
			
			System.out.println("A Soma da Linha " + i + " da Matriz é: " + somaLinhas[i]);
		}
		
		System.out.println();
		
		for(int j = 0; j < matriz.length; j++) {
			for(int i = 0; i < matriz[j].length; i++) {
				somaColunas[j] += matriz[i][j];
			}
			
			System.out.println("A Soma da Coluna " + j + " da Matriz é: " + somaColunas[j]);
		}
		
		return (somaLinhas == somaColunas);
	}
	
	// Soma Diagonais Primária e Secundária
	public static boolean somaDiagonais(int[][] matriz) {
		
		int diagonalPrincipal = 0;
		int diagonalSecundaria = 0;
		int col = matriz.length-1;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				if(i == j) {
					diagonalPrincipal += matriz[i][j];
				}
			}
		}
		
		for(int i = 0; i < matriz.length; i++) {
			diagonalSecundaria += matriz[i][col];
			col--;
		}
		
		System.out.println();
		System.out.println("A Soma da Diagonal Princilal é: " + diagonalPrincipal);
		System.out.println("A Soma da Diagonal Secundária é: " + diagonalSecundaria);
		
		return (diagonalPrincipal == diagonalSecundaria);
	}
		
}
	
	

