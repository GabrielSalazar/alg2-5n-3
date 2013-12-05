package com.senac.planilha;
import com.senac.Listas.*;
import java.util.Scanner;
import com.senac.algoritmos.AvaliadorExpressao;
import com.senac.algoritmos.InvalidOperator;
import com.senac.algoritmos.InvalidToken;

public class Planilha {

	Lista A[];	
	public Planilha(){
		A = new Lista[10]; 
	}
	static String aux = "";
	static String form;

	public static void main(String[] args) throws InvalidOperator, InvalidToken {
		Scanner sc1 = new Scanner(System.in);
		while (sc1.hasNextLine()) {
			String formula1 = sc1.nextLine();
			if (formula1.equalsIgnoreCase("fim")) {
				System.out.println("Fim do Programa");
				break;
			}	
			System.out.println("Digite a celula: ");
			aux = new Scanner(System.in).next();
			Lista lista = new Lista();
			lista.adicionaNoComeco(aux);
			if(aux == aux)
			{
				System.out.println("Formula Atual: " + aux + " = " + lista.contem(form));
			}
			System.out.println("Exbir a lista.\n" + lista.toString());
			System.out.println("Digite a Formula: ");
			Scanner sc = new Scanner(System.in);
			while (sc.hasNextLine()) {
				String formula = sc.nextLine();
				lista.adicionaQualquerPosicao(0, formula);
				if (formula.equalsIgnoreCase("fim")) {
					System.out.println("Fim do Programa");
					break;
				}
				form = formula;
				String postfix = AvaliadorExpressao
						.convertInfixToPostfix(formula);
				double result = AvaliadorExpressao.evaluateRPN(postfix);
				System.out.println("Exbir a lista.\n" + lista.toString());
				 System.out.println("Resultado: " + result);

			}
		}
	
	}
	
	
	}
	


